package com.pack.day1;
//approch 1 to access instance and static variables
public class App1 {
String batsman = "virat kohli";
static String bowlers ="siraj";
void display()
{
	System.out.println("Hellloooo");
}
static String display1()
{
	return "Hie";
}
public static void main(String[] args)
{
	App1 a1=new App1();
	System.out.println(a1.batsman);
	a1.display();
	System.out.println(App1.bowlers);
	System.out.println(App1.display1());
	
	
	
}
}
