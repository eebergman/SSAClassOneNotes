package com.ssa1.assignment1;

public class TestDog 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Dog d = new Dog();
		Dog d2 = new Dog();
		
		d2.age = 7;
		d2.breed = "Pit Bull";
		d2.coatLength = "Short";
		
		System.out.println(d.getdogDetails());
		System.out.println(d2.getdogDetails());
				
	}

}
