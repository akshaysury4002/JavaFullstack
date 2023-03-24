package com.as.deviation;

import java.util.Scanner;

public class Dvmain 
{
public static void main(String[] args) {
		
		
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("enter the length");
//		int length=sc.nextInt();
//		
//		int []a=new int[length];
//		System.out.println("enter the veriable");
//		for (int i = 0; i < a.length; i++) {
//			int m=sc.nextInt();
//			a[i]=m;			
//		}
		double []a= {10, 12, 23, 23, 16, 23, 21, 16};
		int length=8;
		Calculator r=new Calculator();
		r.calculateDv(a, length);
	}
	
	
	

}

class Calculator
{
	public void calculateDv(double []a,int length)
	{
		System.out.println("Count is: "+length);
		double sum=0;
		
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		System.out.println("sum of veriables is: "+sum);
		
		double mean=sum/length;
		System.out.println("mean of veriables is: "+mean);
		
		double sumesion=0;
		for (int i = 0; i < a.length; i++) {
			sumesion+= Math.pow((a[i]-mean), 2);
			
			
		}	
		double deviation= Math.sqrt(sumesion/length);
		System.out.println("Standard Deviation is : "+deviation);
		
	}
}