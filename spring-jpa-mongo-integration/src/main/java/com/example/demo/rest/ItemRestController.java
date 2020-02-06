package com.example.demo.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Item;
import com.example.demo.repo.ItemRepository;

@RestController
@RequestMapping("/api")
public class ItemRestController {

	private ItemRepository itemRepository;

	@Autowired
	public ItemRestController(ItemRepository itemRepository) {
		super();
		this.itemRepository = itemRepository;	
	} 
	@PostMapping("/items")
	public Item createItem(@RequestBody Item item)
	{
		return itemRepository.insert(item);
	}
	@GetMapping("/items")
	public List<Item> getAllItem()
	{
		return itemRepository.findAll();
	}
	@GetMapping("/items/{itemId}")
	public Optional<Item> getItemById (@PathVariable Integer itemId)
	{
		return itemRepository.findById(itemId);
	}
	@GetMapping("/items/{itemId}")
	public void deleteItemById(@PathVariable Integer itemId)
	{
		 itemRepository.deleteById(itemId);
	}
	@GetMapping("/items")
	public void deleteAll() {
		itemRepository.deleteAll();
	}
	@GetMapping("/items/findByItemName/{itemName}")
	public void deleteItemByName(@PathVariable Integer itemName)
	{
		itemRepository.deleteByItemName(itemName);
	}
	
	
}
