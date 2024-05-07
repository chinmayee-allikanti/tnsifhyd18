package com.pack.constructor;

public class CarDefault {
	private String doors;
	private String engine;
	private String drivers;
	private int speed;
	 public CarDefault()
	 {
		 doors="closed";
		 engine="on";
		 drivers="seated";
		 speed=40;
	 }
	 public String run() {
			if(doors.equals("closed")&&engine.equals("on")&&drivers.equals("seated")&&speed>0)
			{
				return "car is in running state";
			}
			else
			{
				return "car is not in running state";
			}
		}
			
}
