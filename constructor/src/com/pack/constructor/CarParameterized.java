package com.pack.constructor;

public class CarParameterized {
	private String doors;
	private String engine;
	private String drivers;
	private int speed;
	 public CarParameterized(String doors,String engine,String drivers,int speed)
	 {
		 this.doors=doors;
		 this.engine=engine;
		 this.drivers=drivers;
		 this.speed=speed;
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

