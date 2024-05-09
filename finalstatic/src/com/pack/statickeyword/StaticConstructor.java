package com.pack.statickeyword;

public class StaticConstructor {
	StaticConstructor()
	{
		System.out.println("constructor is created");
	}
}
class Hello extends StaticConstructor {
	Hello()
	{
		super();
		System.out.println("child class constructor is created");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hello h=new Hello();
	}

}
