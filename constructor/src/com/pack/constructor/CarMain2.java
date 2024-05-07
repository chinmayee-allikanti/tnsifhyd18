package com.pack.constructor;

public class CarMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarParameterized c1=new CarParameterized("closed","on","seated",10);
		CarParameterized c2=new CarParameterized("closed","off","seated",-10);
		System.out.println(c1.run());
		System.out.println(c2.run());
		
		
		

	}

}
