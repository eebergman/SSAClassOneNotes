package com.ssa1.assignment1;

public class Dog 
{
	String name;
	String breed;
	String color;
	
	public Dog()
	{
		name = "Sparky";
		breed = "Lab";
		color = "Black";
	}
	
	public void printInfo()
	{
		System.out.println("Name: " + name);
		System.out.println("Breed: " + breed);
		System.out.println("Color: " + color);
		System.out.println("Description: " + description()); //description method that returns the description string
		System.out.println("\nWhat does " + name + " say? \n" + speak() + "\n"); //speak method
	}
	
	public String description()
	{
		return name + " is a " + color + " " + breed + ".";
	}
	
	public String speak()
	{
		return "Woof!, Woof!";
	}
	
	
}
