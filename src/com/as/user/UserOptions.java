package com.as.user;

import java.util.Scanner;

import com.as.cart.CartController;
import com.as.cart.CartDataInput1;
import com.as.cart.CartMenu;
import com.as.input.CartDataInput;

public class UserOptions 
{
	private Scanner scanner;
	private final CartDataInput ip;
    private final UserController controller;
    private final CartDataInput1 ip1;
    
    private CartMenu cartMenu;
    private CartController cartController;

	public UserOptions() {
		
		 ip = new CartDataInput();
	     controller = new UserController();
	     
	     ip1 = new CartDataInput1();
	     
	     
	     cartMenu = new CartMenu();
	     cartController = new CartController();
	}
	
	
	private void displayManu()
	{
		System.out.println("****USER MENU****");
		System.out.println("------------------");
		System.out.println("select your choice");
		System.out.println("------------------");
		System.out.println("1.new user");
		System.out.println("2.list user");
		System.out.println("3.select user");
		System.out.println("4.Exit");
	}


	public void performAction() {
		
		displayManu();
		int ch=0;
		try {
			 ch=ip.askForUserChoice();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		switch (ch) {
		case 1:
			
			 System.out.println("\n 👏 You selected New User \n");
             try {
                 int id = ip.askForId();
                 String name = ip.askForName();
                 controller.createNewUser(id, name);
             } catch (Exception e) {
                 System.out.println(e.getMessage());
             }
			
			break;
		
		case 2:
			 System.out.println(" \n 👏 You selected List users \n ");
             controller.listAllUsers();
			break;
		
		case 3:
//			System.out.println(" \n 👏 You selected select user \n ");
//			try {
//                int id = ip.askForId();
//                controller.selectUser(id);
//            } catch (Exception e) {
//             
//			System.out.println(e.getMessage());
//            }
			
			System.out.println(" \n 👏 Entering to User Cart \n ");
            
            int userId = ip1.askForId("Enter User Id");
            System.out.println(userId);
            cartController.setUserId(userId);
            cartMenu.performAction();
			
			break;
		
		case 4:
			
			System.out.println(" \n 👏 Thanks for using our service \n ");
			

		default:System.out.println("\n 👏 option does not exist \n" );
			System.out.println(" \n 👏 Thanks for using our service \n ");
			break;
		}
		 UserOptions options=new UserOptions();
		  options.performAction();
	}

}
