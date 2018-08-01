package com.stackroute.demo1;
public class Local
{
 int x=30;
	void display()
	{
		class Local1{
			void msg() {
			System.out.println(x);
			}
		}
			Local1 l=new Local1();
			l.msg();
		
	}
	public static void main(String args[]) {
		Local obj=new Local();
		obj.display();
	}
	
	
}