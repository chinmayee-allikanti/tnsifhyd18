package com.oop.inheritance;

public class MainHierarical {
	public static void main(String[] args) {
		Dog d=new Dog();
		Cat c=new Cat();
		d.eat();
		d.bark();
		//d.meow();error
		c.eat();
		c.meow();
		//c.bark();error
	}

}
