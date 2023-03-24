package com.as.item;

import java.util.Scanner;

import com.as.exception.InvalidInputException;
import com.as.input.CartDataInput;
import com.as.user.UserController;
import com.as.user.UserOptions;

public class ItemOption 
{
	private Scanner scanner;
	private final CartDataInput ip;
    private final ItemController controller;
	public ItemOption() {
		this.ip = new CartDataInput();
		this.controller = new ItemController();
		
		
	}
    
	public void displaMenu()
	{
		System.out.println("****CART MENU****");
		System.out.println("------------------");
		System.out.println("select your choice");
		System.out.println("------------------");
		System.out.println("1.add item");
		System.out.println("2.remove item");
		System.out.println("3.list item");
		System.out.println("4.calculate the total cost");
		System.out.println("5.Exit");
		
		
	}
	
	public void performAction()
	{
		displaMenu();
		int ch=0;
		try {
			ch=ip.askForItemChoice();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
			
			
			switch (ch) {
			case 1:
				System.out.println("\n 👏 You selected add item \n");
				try {
					int id=ip.askForIid();
					String name=ip.askForIname();
					double price=ip.askForPrice();
					controller.saveItem(id, name, price);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				break;
				
				
			case 2:
				System.out.println("\n 👏 You selected remove item \n");
				try {
					int id=ip.askForIid();
					controller.deleteItem(id);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
				
			case 3:
				System.out.println(" \n 👏 You selected List items \n ");
	             controller.listAllItem();
				break;
				
			case 4:
				System.out.println(" \n 👏 You selected calculate the total cost \n ");
				controller.totalCartPrice();
				break;
				
			case 5:
				UserOptions options=new UserOptions();
			    options.performAction();
				break;

			default:
				break;
			}
			
			System.out.println("\n");
			  ItemOption option=new ItemOption();
			  option.performAction();
			  
		
		
	}
    

	

}
