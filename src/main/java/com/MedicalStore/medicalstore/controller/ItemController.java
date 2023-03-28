package com.MedicalStore.medicalstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MedicalStore.medicalstore.controller.dto.ItemDto;
import com.MedicalStore.medicalstore.entity.Item;

import com.MedicalStore.medicalstore.service.ItemService;


@RestController
@RequestMapping("/item")
public class ItemController {
	private final ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping("/save")
    public Item save(@RequestBody Item item) {
        return itemService.save(item);
    }

    @PostMapping("/create")
    public Item create(@RequestBody Item item) {
//        Item item = new Item(itemDto.getName(), itemDto.getDescription(),itemDto.getImageUrl(), itemDto.getPrice());
        return itemService.save(item);
    }

    @PutMapping("/{id}")
    public Item update(@RequestBody Item item, @PathVariable Integer id) {
        return itemService.save(item);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        itemService.delete(id);
    }

    @GetMapping("/all")
    public List<Item> all() {
        return itemService.all();
    }

    @GetMapping("/{itemId}")
    public Item findById(@PathVariable int itemId) {
        return itemService.findById(itemId);
    }

    @GetMapping("/{id}")
    public Item findItemById(@PathVariable Integer id) {
        return itemService.findById(id);
    }	    
}
