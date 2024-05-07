package com.pack.polymorphism;

public class OverloadEX {
		String name="chinmayee";
		static String place="hyderabad";
		static void display(int num)
		{
			System.out.println("static method1:"+num);
		}
		static void display(double n)
		{
			System.out.println("static method2:"+n);
		}
		int display(int n1,int n2)
		{
			return n1+n2;
		}
		int display(int a,int b,int c)
		{
			return a+b+c;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadEX o1 = new OverloadEX();
     System.out.println("name is:-"+o1.name);
     System.out.println("addition is:-"+o1.display(2,3));
     System.out.println("addition is:-"+o1.display(2,3,4));
     System.out.println("place is:-"+OverloadEX.place);
     OverloadEX.display(12);
     OverloadEX.display(1.22);
     


	}

}
