package com.si.day1;
import java.util.Scanner;

public class Program2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	if(n%2==0)
	{
		System.out.println(n+" "+"is a prime number");
	}
	else
	{
		System.out.println(n+" "+"is not a prime number");
	}
	sc.close();
}
}
