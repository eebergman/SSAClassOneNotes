package com.tiy.races;

public class Engine {

	private int torque;
	private int topSpeed;
	private boolean running = false;

	public Engine(int torque, int topSpeed) {
		this.torque = torque;
		this.topSpeed = topSpeed;
	}
	
	public void startEngine() {
		running = true;
	}
	
	public void stopEngine() {
		running = false;
	}

}
