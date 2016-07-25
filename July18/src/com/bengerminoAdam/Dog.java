package com.bengerminoAdam;

public class Dog {
	
	String breed;
	String color;
	Integer age;
	
	public Dog()
	{
		breed = "Australian Sheperd";
		color = "Black";
		age = 4; 
	}
	
	public String getInfo()
	{
		return breed + " " + color + " " + age;
	}
	

}
