package com.stackroute.demo1;

import java.util.Scanner;

public class Loop {
	public static void main(String[] args) 
	{
	int a;
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter any num: ");
	a=s.nextInt();
	
	for(int i=0;i<=a;i++) {
		int temp=i; 
		int num=i;
		 while(num>0){
			 System.out.println(temp);
			 num--;
			 
		 }
		
	}

}}
