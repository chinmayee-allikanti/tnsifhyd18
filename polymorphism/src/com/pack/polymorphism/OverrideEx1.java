package com.pack.polymorphism;
//overriding an instance method
class OverrideEx1 {
	void instanceex()
	{
		System.out.println("Instance method in base class");
	}
}
class Child extends OverrideEx1{
	void instanceex()
	{
		System.out.println("instance method in child class");
	
	}
}


	

