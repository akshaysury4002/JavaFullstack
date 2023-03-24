package com.as;

public class App {

	
	 public static void remChar() {

		 RemoveChar rc = new RemoveChar();
	          
		    System.out.println("Answer (abcpqr) : "+ rc.remChar("abcxpqr", "x"));
	        System.out.println("There is no x in string : "+ rc.remChar("abcpqr", "x"));
	        System.out.println("Invalid Strinf : "+ rc.remChar("", "x"));
	        System.out.println("Specify the character to be removed : "+ rc.remChar("abcxpqr", ""));
	        System.out.println("Answer (x) : "+ rc.remChar("axb", "ab"));
	        System.out.println("Answer (nothing remains) : "+ rc.remChar("x", "x"));
	        System.out.println("Answer (x) : "+ rc.remChar("xx", "x"));
	        System.out.println("Answer (abcxpqr) : "+ rc.remChar("axbcxpqr", "x"));
	    }
	 
	 public static void uniqueInArray()
	 {
		 Integer[] arr1 = {1, 2, 3, 4, 5};
	     Integer[] arr2 = {4, 5, 6, 7, 8};
	     
	     CommenUniqueInArray array=new CommenUniqueInArray();
	     array.commenEle(arr1, arr2);
	 }
	 
		public static void main(String[] args) {
			
//			TypeChecker checker=new TypeChecker();
//			checker.checkType1(10);
//			checker.checkType1("ram");
			
			//remChar();
			
			uniqueInArray();	
			
		}
	

}
