package com.as.input;

import java.util.ArrayList;
import java.util.List;

import com.as.exception.ItemNotFoundException;
import com.as.item.Item;

public class ItemDb1 {
	  private final static ArrayList<Item> items = new ArrayList<>();

	    public static void addItem(int id, String name, double price) {
	        Item item = new Item(id, name, price);
	        items.add(item);
	    }

	    public static List<Item> listItems() {
	        return items;
	    }

	    public static Item findItemById(int itemId) {

	        for( Item item : items) {
	            if(item.getId() == itemId) {
	                return item;
	            }
	        }

	        throw new ItemNotFoundException("❌ Item Id " + itemId  +" Not Found");
	    }

}
