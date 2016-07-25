package com.ssa1.assignment1;

public class TestAddress
{

	public static void main(String[] args)
	{
		Address a = new Address();
		Address a2 = new Address();
		
		a2.streetNumber = 451;
		a2.cityName = "Baltimore";
		a2.zipCode = 21201;
		
		System.out.println(a.getFullAddress());
		System.out.println(a2.getFullAddress());
		
	}

}
