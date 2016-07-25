package com.shahAmi;

public class Student {

	String firstName;
	String lastName;
	double gpa;
	char sex;
	
	
	public Student(String firstName, String lastName, double gpa, char sex)
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gpa = gpa;
		this.sex = sex;
	}


	public Student() 
	{
		this.firstName = "Unknown";
		this.lastName	= "Unkown";
		this.gpa = 0.0;
		this.sex = 'x';
	}
	
	public String getFullInfo()
	{
		return  firstName + " " + lastName +" " + gpa + " " + sex + " ";
	} 


	public String getFirstName()
	{
		return firstName;
	}


	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}


	public String getLastName()
	{
		return lastName;
	}


	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}


	public double getGPA()
	{
		return gpa;
	}


	public void setGPA(double gPA)
	{
		this.gpa = gpa;
	}


	public char getSex() 
	{
		return sex;
	}


	public void setSex(char sex) 
	{
		this.sex = sex;
	}


	@Override
	public String toString()
	{
		return "Student= " + firstName + ", " + lastName + ", GPA= " + gpa + ", sex= " + sex + "]";
	}
	
	
}
