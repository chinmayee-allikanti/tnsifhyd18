package com.oop.inheritance;

public class MainMultilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subclass1 s1=new Subclass1();
		Subclass2 s2=new Subclass2();
		s1.content();
		s1.content1();
		//s1.content2(); error
		s2.content();
		s2.content2();
		s2.content1();

	}

}
