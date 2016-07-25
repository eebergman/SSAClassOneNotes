package com.ssa1.assignment1;

public class Address
{
	Integer streetNumber;
	String streetName;
	String cityName;
	String stateName;
	Integer zipCode;

	public Address()
	{
		streetNumber = 1234;
		streetName = "Main Street";
		cityName = "Any City";
		stateName = "Any State";
		zipCode = 98765;
	}

	public String getFullAddress()
	{
		return streetNumber + " " + streetName + " " + cityName + ", " + stateName + " " + zipCode;
	}
}
