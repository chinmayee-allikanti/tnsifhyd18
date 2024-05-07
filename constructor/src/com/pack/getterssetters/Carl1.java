package com.pack.getterssetters;
//encapsulation:- accessing private members using getters and setters
public class Carl1 {
	private String doors;
	private String engine;
	private String drivers;
	public int Speed;
	public String getDoors() {
		return doors;
	}
	public void setDoors(String doors) {
		this.doors = doors;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getDrivers() {
		return drivers;
	}
	public void setDrivers(String drivers) {
		this.drivers = drivers;
	}
	public int getSpeed() {
		return Speed;
	}
	public void setSpeed(int speed) {
		Speed = speed;
	}
public String run() {
	if(doors.equals("closed")&&engine.equals("on")&&drivers.equals("seated")&&Speed>0)
	{
		return "car is in running state";
	}
	else
	{
		return "car is not in running state";
	}
}
	
}
