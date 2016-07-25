package com.alexanderVernet;

public class FlashLightTest 
{

	public static void main(String[] args) 
	{
		// instantiate FlashLight instances
		FlashLight testLight1 = new FlashLight();
		FlashLight testLight2 = new FlashLight();
		
		
		
		//test turn on without battery
		testLight1.turnOn();
		
		//insert battery, then call toString()
		testLight1.insertBattery();		
		System.out.println(testLight1.toString());
		
		
		
		//test turn on and off with battery
		testLight2.insertBattery();		
		testLight2.turnOn();
		testLight2.turnOff();
		
		//remove battery, then call toString()
		testLight2.removeBattery();
		
		System.out.println(testLight2.toString());
		

	}

}
