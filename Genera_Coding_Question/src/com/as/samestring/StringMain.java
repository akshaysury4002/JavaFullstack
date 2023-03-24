package com.as.samestring;

public class StringMain 
{
	 public static void rotationEquality() {

			Rotation rotation=new Rotation();
			
	        String sts1 = rotation.isRotationEqual("abc", "bbc") ? "bbc is rotation of abc" : "bbc is not a roatation of abc";
	        System.out.println(sts1);

	        String sts2 = rotation.isRotationEqual("aa", "aa") ? "aa is rotation of aa" : "aa is not a roatation of aa";
	        System.out.println(sts2);

	        String sts3 = rotation.isRotationEqual("a", "b") ? "b is rotation of a" : "b is not a roatation of a";
	        System.out.println(sts3);

	        String sts4 = rotation.isRotationEqual("a", "a") ? "a is rotation of a" : "a is not a roatation of a";
	        System.out.println(sts4);

	        String sts5 = rotation.isRotationEqual("abcpqr", "rqpcba") ? "rqpcba is rotation of abcpqr" : "rqpcba is not a roatation of abcpqr";
	        System.out.println(sts5);
	    }
	 
	public static void main(String[] args) {
		rotationEquality();
	}
	

}
