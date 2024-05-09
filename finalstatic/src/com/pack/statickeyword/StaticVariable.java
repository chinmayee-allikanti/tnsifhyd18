package com.pack.statickeyword;

public class StaticVariable {
String color="white";
}
class A extends StaticVariable{
	String color="purple";
	void printcolor()
	{
		System.out.println("color from child class "+color);
		System.out.println("color from parent class "+super.color);
		
	}
	public static void main(String[] args)
	{
		A a=new A();
		a.printcolor();
	}
}
