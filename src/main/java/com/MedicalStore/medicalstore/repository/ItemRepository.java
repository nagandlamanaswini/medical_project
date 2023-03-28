package com.MedicalStore.medicalstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.MedicalStore.medicalstore.entity.Item;

public interface ItemRepository extends CrudRepository<Item, Integer>{

}
