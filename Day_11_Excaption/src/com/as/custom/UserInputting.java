package com.as.custom;

import java.util.InputMismatchException;

import java.util.Scanner;



public class UserInputting {

    private final Scanner scanner = new Scanner(System.in);

    public int askForUserAge() throws InvalidAgeException {
        System.out.println("\n 👉 Whats you age : ");
        int age = 0;
        
        try {
           age = scanner.nextInt();
        }catch(InputMismatchException ex) {
            age = 0;
            System.out.println("\n ❌ Please Enter Numbers Only");
        }    

        // age should not be negative 

        if(age < 0) {
            throw new InvalidAgeException(" ❌ "+age +" Must be possitive ");
        }
        if(age > 100) {
            throw new InvalidAgeException(" ❌ "+age +" Must not be greater than 100 ");
        }
        // age should not be more than 100 years

        return age;
    }

    public void createUserFromFile(String name) throws WrongFileFormatException {
        if(name.contains(".xml")) {
            throw new WrongFileFormatException("Unsuported File Format");
        }
        // save user to db
    }

    public int askForDay() {

        System.out.println("\n 👉 Whats Birth Day : ");
        int day = 0;
        
        try {
           day = scanner.nextInt();
        }catch(InputMismatchException ex) {
            // throw new RuntimeException("❌ any message", ex);
            // throw ex;
            String msg = ex.getMessage() + " -> " + "Do not enter text";
            throw new BadInputException(msg, "age");
        }    

        return 0;
    }

    public int askForAmount() {
        System.out.println("\n 👉 Whats Amount : ");
        int amt = 0;
        
        try {
            amt = scanner.nextInt();
            try {
                validateAmount(amt);
            } catch (BadInputException e) {
                throw e;
            }
        }catch(Exception ex) {
            throw ex;
        }   

        return 89;
    }
    
    public int askForYear()
    {
    	System.out.println("\n 👉 enter year : ");
        int year = 0;
        
        try {
            year = scanner.nextInt();
           
        }catch(InputMismatchException ex) {
        	year = 0;
            System.out.println("\n ❌ Please Enter Numbers Only");
        }
        
        if(year < (2023-23)) {
            throw new InvalidYearException(" ❌ "+year +" should not be older than 23 years. ");
        }
        if(year > 2023) {
            throw new InvalidYearException(" ❌ "+year +" Must not be greater than present year 2023 ");
        }
       

        return year;

    	
    }

    private void validateAmount(int amt) {
        if(amt <= 0) {
            throw new  BadInputException("❌ Invalid amount", "amount");
        }
    }
}