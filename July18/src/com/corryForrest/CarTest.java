package com.ssa1.assignment1;

public class CarTest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Car c = new Car();
		Car c2 = new Car();
		
		c2.make = "Make: Ford";
		c2.model = "Model: F-250";
		c2.year1 = 2016;
		
		System.out.println(c2.getCarDetails());
			//Full description of Car2 on 1 line
		
		System.out.println(c.getCarDetails());
			//Full description of the Car on 1 line
			
		System.out.println(c.make);
		System.out.println(c.model);
		System.out.println("Year:" + c.year1);
			//Description on multiple lines
	}

}
