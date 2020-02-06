package com.example.demo.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Item;
@Repository
public interface ItemRepository extends MongoRepository<Item, Integer>{

	List<Item> findItemByName(String itemName);

	List<Item> deleteByItemName(Integer itemName);



	

	
}


