package com.pack.polymorphism;

public class Staticdemo {
	static int a=180;
	int c=12;
	static void staticcall()
	{
		System.out.println("Value of a is:"+a);
		//System.out.println("Value of c is:"+c);
		//this gives an error as static method cannot access instance variables
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staticdemo.staticcall();

	}

}
