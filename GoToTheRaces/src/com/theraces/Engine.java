package com.theraces;

public class Engine {
	
	private int torque;
	private int horsepower;
	private boolean running = false;
	
	
	public Engine(int torque, int horsepower) {
		this.torque = torque;
		this.horsepower = horsepower;
	}
	
	public void startEngine() {
		running = true;
	}
	
	public void stopEngine() {
		
	}

}
