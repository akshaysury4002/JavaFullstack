package com.as.item;

import com.as.input.ItemDb;


public class ItemController {
	
	 public void saveItem(int id, String name,double price) {
	        int sts = ItemDb.addNewItem(id, name, price);
	        if (sts == ItemDb.NO_MORE_SPACE) {
	            System.out.println("\n ❌ There is no more space ");
	        }else if (sts == ItemDb.ITEM_ALREADY_EXISTS) {
	            System.out.println("\n ❌ User Already Exists ");
	            
	        } else {
	            System.out.println("\n ✅ Item Successfully added into cart ");
	        }
	    }
	 
	 
	 public void deleteItem(int id)
	 {
		 int sts=ItemDb.removeItem(id);
		 if(sts==1)
		 {
			 System.out.println("\n ✅ Item Successfully deleted from the cart ");
		 }
		 else
		 {
			 System.out.println("\n ❌ user not found ");
			 
		 }
	 }

	    public void listAllItem() {
	        Item[] items = ItemDb.listUsers();
	        for (Item item : items) {
	            if (item != null) {
	                System.out.println("\n 👉 Id " + item.getId() + " Name " + item.getName() + " Price " + item.getPrice());
	            }
	        }
	        System.out.println("\n");
	    }

	    public void totalCartPrice() {
	    	double totalCost=0;
	    	
	    	Item[] items = ItemDb.listUsers();
	        for (Item item : items) {
	            if (item != null) {
	                totalCost=totalCost+item.getPrice();
	            }
	        }
	       System.out.println("total cost is : "+totalCost);
	        System.out.println("\n");
	        
	    }

}
