package com.alexanderVernet;

public class FlashLight 
{

	boolean isOn;
	boolean hasBattery;
	
	public FlashLight()
	{	
		isOn = false;
		hasBattery = false;
	}
	
	public void turnOn()
	{
		if(!hasBattery){
			System.out.println("Battery needed!");	
		}
		
		else isOn = true;
		System.out.println("Let there be light!");
		
	}
	
	public void turnOff()
	{
		isOn = false;
		System.out.println("And then there was darkness...");

	}
	
	public void insertBattery()
	{
		hasBattery = true;
	}
	
	public void removeBattery()
	{
		hasBattery = false;
	}
	
	@Override 
	public String toString()
	{
		return "\nFlashlight on: " + isOn + ", Battery inserted: " + hasBattery;
	}
}
