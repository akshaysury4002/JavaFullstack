package com.as.input;

import java.util.Scanner;

import com.as.exception.InvalidInputException;

public class CartDataInput {
	
	 private final Scanner scanner;

	    public CartDataInput() {
	        scanner = new Scanner(System.in);
	    }

	    public int readNumber() {
	       int num=0;
	        try {
	            num = scanner.nextInt();
	        }catch (Exception e) {
	            throw new InvalidInputException("❌ Please Enter Number Only");
	        }
	        return num;
	    }

	    public int askForUserChoice() {
	        System.out.print("👉 Enter Your Choice : ");
	        int mop= readNumber();

	        if(mop <= 0) throw new InvalidInputException("❌ Id "+ mop +" is invalid. Please provide positive input");
	        return mop;
	    }

	    public int askForId() {
	        System.out.print("👉 Enter Id : ");
	        int id = readNumber();
	       
	        if(id <= 0) throw new InvalidInputException("❌ Id "+ id +" is invalid. Please provide positive id");
	        return id;
	    }

	    public String askForName() {
	        System.out.print("👉 Enter Name : ");
	        String name = scanner.next();
	        boolean b=true;
	        if(name.length() < 3) {
	            throw new InvalidInputException("❌ Name must be contains atleast 3 characters");
	        }
	        
	        for (int i = 0; i < name.length(); i++) {
				if(name.charAt(i)<'a' && name.charAt(i)>'z')
				{
					 b=false;
					 break;
				}
			
			}
	        if(b==false)
	        {
	        	throw new InvalidInputException("❌ Name must be contains atleast 3 characters");
	        }
	        return name;
	    }
	    
	    public int askForItemChoice() {
	        System.out.print("👉 Enter Your Choice : ");
	        int mop= readNumber();
	        return mop;
	    }
	    
	    public int askForIid() {
	        System.out.print("👉 Enter Id : ");
	        int id = readNumber();
	       
	        if(id <= 0) throw new InvalidInputException("❌ Id "+ id +" is invalid. Please provide positive id");
	        return id;
	    }

	    public String askForIname() {
	        System.out.print("👉 Enter Name : ");
	        String name = scanner.next();
	        boolean b=true;
	        if(name.length() < 3) {
	            throw new InvalidInputException("❌ Name must be contains atleast 3 characters");
	        }
	        
	        for (int i = 0; i < name.length(); i++) {
				if(name.charAt(i)<'a' && name.charAt(i)>'z')
				{
					 b=false;
					 break;
				}
			
			}
	        if(b==false)
	        {
	        	throw new InvalidInputException("❌ Name must be contains atleast 3 characters");
	        }
	        return name;
	    }
	    
	    public double askForPrice() {
	        System.out.print("👉 Enter price : ");
	        double id = readNumber();
	       
	        if(id <= 0) throw new InvalidInputException("❌ Id "+ id +" is invalid. Please provide positive id");
	        return id;
	    }


}
