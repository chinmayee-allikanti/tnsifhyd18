package com.si.day1;
import java.util.Scanner;
public class Program8 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string:");
	String s=sc.nextLine();
	String rev= new StringBuilder(s).reverse().toString();
	if(s.equals(rev))
	{
		System.out.println(s+" is a palindrome");
	}
	else
	{
		System.out.println(s+" is not a palindrome");
	}
	sc.close();
}
}
