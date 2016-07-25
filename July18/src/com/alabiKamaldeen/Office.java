package com.alabiKamaldeen;

public class Office {
	
	String officeName;
	String street;
	String city;
	String state;
	Integer zipCode;
	
	
	public Office()
	{
		officeName = "Social Security Administration Headquarters";
		street = "6401 Security Boulevard";
		city = "Baltimore";
		state = "Maryland";
		zipCode = 21235;
	}
	
	
	public String getFullOfficeInformation() 
	{
		return officeName + " - " + street + ", " + city + ", " + state + " " + zipCode;
	}

}
