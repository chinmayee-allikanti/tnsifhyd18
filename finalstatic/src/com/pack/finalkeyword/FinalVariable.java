package com.pack.finalkeyword;
//to create constant variable
public class FinalVariable {
final int speedlimit=100;
void run()
{
	//speedlimit=90; 
    //the speedlimit cant be modified as it is a final variable
	System.out.println("speedlimit cant be modified");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalVariable f=new FinalVariable();
		System.out.println("the value of speedlimit is -"+f.speedlimit);
		f.run();
		
	}
}
