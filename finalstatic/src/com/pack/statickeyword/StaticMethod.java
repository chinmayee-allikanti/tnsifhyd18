package com.pack.statickeyword;

public class StaticMethod {
void display()
{
	System.out.println("this is a parent class method");
}
}
class B extends StaticMethod
{
	void display()
	{
		System.out.println("this is a method from child class");
	}
	void display1()
	{
		System.out.println("this is a second child class method");
	}
	void display2()
	{
		super.display();
		display1();
	}	
		public static void main(String[] args) {
	
		// TODO Auto-generated method stub
B a = new B();
a.display2();
	}

}
