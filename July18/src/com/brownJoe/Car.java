package com.ssa1.assignment1;

public class Car
{

	String model;
	String type;
	String color;
	Double price;
	int year;
	int mileage;

	public Car()
	{
		model = "Honda";
		type = "CR-V";
		color = "Silver";
		price = 15000.00;
		year = 2004;
		mileage = 122000;
	}

	public String getColor()
	{
		return color;
	}
}
