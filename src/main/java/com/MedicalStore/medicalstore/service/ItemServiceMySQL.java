package com.MedicalStore.medicalstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MedicalStore.medicalstore.entity.Item;
import com.MedicalStore.medicalstore.repository.ItemRepository;
@Service
public class ItemServiceMySQL implements ItemService {
	    
	    private final ItemRepository itemRepository;

	    @Autowired
	    public ItemServiceMySQL(ItemRepository itemRepository) {
	        this.itemRepository = itemRepository;
	    }

	    @Override
	    public Item save(Item item) {
	        return itemRepository.save(item);
	    }

	    @Override
	    public boolean delete(int itemId) {
	        boolean deleted = false;
	        if (itemRepository.findById(itemId).isPresent()) {
	            itemRepository.deleteById(itemId);
	            deleted = true;
	        }
	        return deleted;
	    }

	    @Override
	    public List<Item> all() {
	        return (List<Item>) itemRepository.findAll();
	    }

	    @Override
	    public Item findById(int itemId) {
	        return itemRepository.findById(itemId).orElse(null);
	    }
	}


