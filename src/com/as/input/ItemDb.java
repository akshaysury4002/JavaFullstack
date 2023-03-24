package com.as.input;

import java.util.ArrayList;
import java.util.List;

import com.as.exception.ItemNotFoundException;
import com.as.item.Item;

public class ItemDb 
{
	 public static final int NO_MORE_SPACE = 890;
	 public static final int ITEM_ALREADY_EXISTS = 990;
	 public static final int ITEM_SUCCESSFULLY_CREATED= 1001;
	    
	    
	    
	    // our users that we will create from users menu,
	    // those users will be stored here
	    private static final Item[] items = new Item[20];    
	    
	    
	    public static int addNewItem(int id, String name,double price) {

	        int emptyPos = getEmptyPosition();
	       
	        if(emptyPos == -1) {
	            return NO_MORE_SPACE;
	        }

	        // check user availability
	        int pos = isExists(id);
	    
	        if(pos != -1)return ITEM_ALREADY_EXISTS;
	      
	        // we have reached this line means, there is space and user is fresh
	        // supplied userid is fresh  
	        
	        Item item = new Item(id, name,price);
	        items[emptyPos] = item;
	        return ITEM_SUCCESSFULLY_CREATED;
	    }
	    
	    
	    public static Item[] listUsers() {
	        return items;
	    }

	    
	    private static int isExists(int id) {
	        for ( int i = 0; i < items.length; i++  ) {
	            Item item = items[i];
	            if(item != null) {
	                if(item.getId()==id)return i;
	                
	            }
	        }
	        return -1;
	    }
	    
	    private static int getEmptyPosition() {
	        for ( int i = 0; i < items.length; i++  ) {
	            Item item = items[i];
	            if(item == null) {
	                return i; // at the ith location, block is empty
	            }
	        }
	        return -1;
	    }
	    
	    public static int removeItem(int id)
	    {
		       
	    	for ( int i = 0; i < items.length; i++  ) {
	            Item item = items[i];
	            if(item != null) {
	                if(item.getId()==id)
	                {
	                	items[i]=null;
	                	 return 1;
	                	
	                }
	                
	            }
	        }
	    	 return -1;
	       
	    	
	    }
	    
	    
	    //==========================================
	

	    
	    private final static ArrayList<Item> items1 = new ArrayList<>();

	    public static void addItem(int id, String name, double price) {
	        Item item = new Item(id, name, price);
	        items1.add(item);
	    }

	    public static List<Item> listItems() {
	        return items1;
	    }

	    public static Item findItemById(int itemId) {

	        for( Item item : items1) {
	            if(item.getId() == itemId) {
	                return item;
	            }
	        }

	        throw new ItemNotFoundException("❌ Item Id " + itemId  +" Not Found");
	    }
}
