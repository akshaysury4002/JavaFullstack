package com.as.funcallback;

public class App {
	
	
	 public static void callbackDemo() {
	       
		 ImgUploader up = new ImgUploader();

	        up.select( imageTask -> {
	            System.out.println("✅ Image Selection Completed ");

	            up.compress( compressTask -> { 
	                System.out.println("✅ Image Compression Completed ");

	                up.upload( uploadTask -> {
	                    System.out.println("✅ Image Upload Completed ");
	                });
	                
	            });
	        });
	    }
	 
	public static void main(String[] args) {
		 System.out.println("🔥 General Solutions 🔥");
	        callbackDemo();
	}

}
