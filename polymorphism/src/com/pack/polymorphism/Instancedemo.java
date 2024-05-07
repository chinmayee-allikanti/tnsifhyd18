package com.pack.polymorphism;

public class Instancedemo {
	
		int a=100;//instance variable
		static int d =999;//static variable
		void instancecall()
		{
		System.out.println("Value of a is:" +a);
		System.out.println("Value of b is:" +d);
		//accessing static & instance variables through instance method 
		
		}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instancedemo i1=new Instancedemo();
		System.out.println(i1.a);
		System.out.println(i1.d);

	}

}
