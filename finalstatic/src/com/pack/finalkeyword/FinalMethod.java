package com.pack.finalkeyword;
//to prevent method overriding
public class FinalMethod
{
	final String name="Chinmayee";
	final void display()
	{
		System.out.println("final method cannot be ovveridden");
	}
	
}
class FinalEX1 extends FinalMethod
{
	public static void main(String[] args)
	{
		/*void display()
		{
			System.out.println("the display() method cannot be overridden");
		}*/
		FinalEX1 f=new FinalEX1();
		f.display();
		System.out.println("the name is - "+f.name);
	}
}