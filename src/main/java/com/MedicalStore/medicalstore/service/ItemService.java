package com.MedicalStore.medicalstore.service;

import java.util.List;

import com.MedicalStore.medicalstore.entity.Item;

public interface ItemService {
	Item save( Item item );

    boolean delete( int itemId );

    List<Item> all();

    Item findById( int itemId );
}
