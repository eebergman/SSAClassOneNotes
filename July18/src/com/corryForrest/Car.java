package com.ssa1.assignment1;

public class Car 
{
	String make;
	String model;
	String year;
	Integer year1;
	public Car()
	{
		make = "Make: Nissan";
		model = "Model: Versa";
		year1 = 2009;
		
	}
	
	public String getCarDetails()
	{
		return make + " " + model + " Year: " + year1;
		
	}
	
}
