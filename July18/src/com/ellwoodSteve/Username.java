package com.ssa1.assignment1;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Username {
			
		String ssn;
		String email;
		String dob;
		Integer ID;
		//assign username based on email input scan and data
		public Username()
		{
			//I decided not to override any values because it is non-normative
		}
		public String getLogon(String email){
			String logon = email;			
			//System.out.println(logon);//this was spontaneously printing unlike th sysout for others
			return logon.trim();
		}
//take in date with the ability to use single digit months without errors
		public String getBirthDate(String dob)
		{
			String DOB = dob.trim();
			String newDateString = null;//I had to do this to avoid compile error why?
			DateFormat df = new SimpleDateFormat("MM/dd/yyyy"); 
		    try {
		        Date dateDOB = df.parse(DOB);
		        newDateString = df.format(dateDOB);
		        //System.out.println(newDateString);
		        //return(startDate);
		        
		    } catch (ParseException e) {
		        e.printStackTrace();
		    }
		    return newDateString;
		}
		public Date getRawBirthDate(String dob)
		{
			String DOB = dob.trim();
			String newDateString = null;//I had to do this to avoid compile error why?
			Date dateDOB = null;//ide made me do this
			DateFormat df = new SimpleDateFormat("MM/dd/yyyy"); 
		    try {
		        dateDOB = df.parse(DOB);
		        //newDateString = df.format(dateDOB);
		        //System.out.println(newDateString);
		        //return(startDate);
		        
		    } catch (ParseException e) {
		        e.printStackTrace();
		    }
		    return dateDOB;
		}
		//we need a clean int for further processing. this will still crash with letters
		public Integer getSSN(String ssn)
		{//int y = Integer.parseInt(str);
			String SSN = ssn.trim();
			int intSSN = Integer.parseInt(SSN); //this doesn't like the add on for 
			//System.out.println("SSN entered is "+ SSN);
			return intSSN; //boolean if ==
			
		}
		
//		public String getFullName() {
//			return firstName +" "+	middleInitial +" "+	lastName;

}
//v
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//public class DateTest {
//
//    public static void main(String[] args) throws Exception {
//        String startDateString = "06/27/2007";
//
//        // This object can interpret strings representing dates in the format MM/dd/yyyy
//        DateFormat df = new SimpleDateFormat("MM/dd/yyyy"); 
//
//        // Convert from String to Date
//        Date startDate = df.parse(startDateString);
//
//        // Print the date, with the default formatting. 
//        // Here, the important thing to note is that the parts of the date 
//        // were correctly interpreted, such as day, month, year etc.
//        System.out.println("Date, with the default formatting: " + startDate);
//
//        // Once converted to a Date object, you can convert 
//        // back to a String using any desired format.
//        String startDateString1 = df.format(startDate);
//        System.out.println("Date in format MM/dd/yyyy: " + startDateString1);
//
//        // Converting to String again, using an alternative format
//        DateFormat df2 = new SimpleDateFormat("dd/MM/yyyy"); 
//        String startDateString2 = df2.format(startDate);
//        System.out.println("Date in format dd/MM/yyyy: " + startDateString2);
