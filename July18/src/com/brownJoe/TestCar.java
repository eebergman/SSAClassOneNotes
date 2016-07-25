package com.ssa1.assignment1;

public class TestCar
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Car c1 = new Car();
		Car c2 = new Car();

		c1.type = "Accord";
		c2.color = "Blue";

		System.out.println("Car 1: " + c1.getColor() + " " + c1.model + " " + c1.type);
		System.out.println("Car 2: " + c2.getColor() + " " + c2.model + " " + c2.type);
	}
}