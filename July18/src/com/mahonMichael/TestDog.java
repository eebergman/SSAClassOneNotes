package com.ssa1.assignment1;

public class TestDog 
{
	public static void main(String[] args) 
	{
		//create 2 Dog objects
		Dog d = new Dog();
		Dog d2 = new Dog();
		
		//Dog d
		d.printInfo();
		
		//change second object variables
		d2.name = "Maggie";
		d2.color = "Yellow";

		//Dog d2
		d2.printInfo();
	}
}
