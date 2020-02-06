package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Item;

public interface ItemService {
	
	public List<Item> getAllItem();
	public Item createItem(Item item);
	public Optional<Item> getItemById(Integer itemId);
	public List<Item> findItemByName(String itemName);
	public void deleteItemById(Integer itemId);
	public void deleteItemByName(Integer itemName);
	public void deleteAll();
	

}
