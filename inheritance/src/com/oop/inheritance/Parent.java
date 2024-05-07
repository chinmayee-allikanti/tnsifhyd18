package com.oop.inheritance;

public class Parent {
	public void content()
	{
		System.out.println("content from parent class");
	}
}
class Subclass1 extends Parent
{
	public void content1()
	{
		System.out.println("content from sub class 1");
	}
}
class Subclass2 extends Subclass1
{
	public void content2()
	{
	System.out.println("content from sub class 2");
    }
}