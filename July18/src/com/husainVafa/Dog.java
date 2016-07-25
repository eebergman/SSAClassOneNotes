package com.ssa1.assignment1;

public class Dog 
{
	String breed;
	Integer age;
	String coatLength;
	
	public Dog ()
	{
	breed = "German Shepard";
	age	= 5;
	coatLength = "Long";
	}
	
	public String getdogDetails() 
	{ 
		return "A " + breed + " that is " + age + " Years Old with a " + coatLength + " coat";
	}

}
	
	

