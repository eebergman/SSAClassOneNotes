package com.ssa1.assignment1;


public class Dejure {


	public static void main(String[] args) { 
		// TODO Auto-generated method stub

		
		Claim d = new Claim();
		
		
        System.out.println("Dejure Claims:");	
		System.out.println("County - " + d.county);
		System.out.println("Duchy - " + d.duchy);
		System.out.println("Kingdom - " + d.kingdom);
		
		Claim d2 =new Claim();
		
		d2.county = "Kildare";
		
		
		
		System.out.println("Lord of " + d.getClaim());
		System.out.println("Counties claimed - " + d2.county);
		
		System.out.println("Total titles: ");
		System.out.println(d2.county + " and " + d.getClaim());
		
		
		
	
	}


}
