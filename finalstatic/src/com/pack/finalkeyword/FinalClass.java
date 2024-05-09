package com.pack.finalkeyword;
//prevents inheritance
public final class FinalClass {
String name="chinmayee";
void display()
{
	System.out.println("hellooooo");
}

//class B extends FinalClass
//cannot extend final class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
FinalClass f=new FinalClass();
System.out.println("name is "+f.name);
f.display();

	}

}
