package com.stackroute.demo1;

import java.util.Scanner;

class Palindrome 
{
public static void main(String[] args) 
{
int a,b,c,temp=0;

Scanner s=new Scanner(System.in);
System.out.println("Enter any num: ");
c=s.nextInt();
b=c;
while(c>0)
{
a=c%10;
c=c/10;
temp=temp*10+a;
}
if(temp==b)
{
System.out.println("Palindrome");
}
else
{
System.out.println("not Palindrome");
}
}
}
