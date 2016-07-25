package com.ssa1.assignment1;

import java.util.Scanner;

//import com.ssa1.main.Person;

public class UserTest {

		public static void main(String[] args) {
			Username u1 = new Username();
			Username u2 = new Username();
			
			System.out.println("Enter an email address you wish to be a Login for this site");
			Scanner scanner = new Scanner(System.in);
			String input1 = scanner.nextLine();
//			u1.email = input1;
			u2.email = input1 + "forinput2   ";
			
			System.out.println("Enter your ssn");
			String inputSsn = scanner.nextLine();
			u2.ssn = inputSsn+ "   ";
		
			System.out.println("Enter your date of birth using 2 digits for month/2 digits for day/4 digits for year");
			String inputDOB = scanner.nextLine();
			//u2.dob  = inputDOB+ "forinput2   ";
			
				
			System.out.println("User1 data is " + u1.getLogon(input1)+" "+u1.getSSN(inputSsn)+" "+u1.getBirthDate(inputDOB));
			System.out.println("User2 data is " + u2.getLogon(u2.email)+" "+u2.getSSN(u2.ssn)+" "+u2.getRawBirthDate(inputDOB));
	}
}
