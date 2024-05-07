package com.pack.getterssetters;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Carl1 c1=new Carl1();
        c1.setDoors("Open");
        System.out.println("the doors are:-"+c1.getDoors());
        c1.setEngine("On");
        System.out.println("the doors are:-"+c1.getEngine());
        c1.setDrivers("seated");
        System.out.println("the doors are:-"+c1.getDrivers());
        c1.setSpeed(40);
        System.out.println("the doors are:-"+c1.getSpeed());
        System.out.println(c1.run());
	}

}
