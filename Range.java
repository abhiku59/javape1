package com.stackroute.demo1;

import java.util.Scanner;

public class Range {
	public static void main(String[] args) 
	{
	int a,b;
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter any num: ");
	a=s.nextInt();
	
	b=a%2;
	if(b==0) {
		if(a>20 && a<30) {
			System.out.println("tom");
		}
		else {
			System.out.println("jerry");
		}
	}

}
}
