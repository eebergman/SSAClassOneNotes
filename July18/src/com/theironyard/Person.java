package com.theironyard;

public class Person {
	String firstName;
	String middleInital;
	String lastName;

	public Person() {
		firstName = "Rodney";
		middleInital = "P";
		lastName = "Barbarti";
	}

	public String getFullName() {
		return firstName + " " + middleInital + " " + lastName;
	}

}
