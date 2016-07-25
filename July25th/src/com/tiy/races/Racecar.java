package com.tiy.races;

public class Racecar {
	
	private String sponser;
	private Engine engine;
	
	
	
	
	
	public Racecar(int torque, int topSpeed) {
		this.sponser = "The Iron Yard Racing";
		this.engine = new Engine(torque, topSpeed);
	}
	
	
	public void startEngine() {
		
	}
	
	public void accelerate() {
		
	}
	
	public void stop() {
		engine.stopEngine();
	}

}
