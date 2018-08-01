package com.stackroute.demo1;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args)
	{
		System.out.println("enter string ");
		
		Scanner sc = new Scanner (System.in);
		String word=sc.nextLine();
		int len=word.length();
		char a[] = new char[len];
		int j=0;
		for(int i=len-1;i>=0;i--) 
		{
			char ch=word.charAt(i);
			a[j]=ch;
			j++;
			
		}
		System.out.println(a);
		
	}}
