package com.ssa1.assignment1;

public class Claim {
	String county;
	String duchy;
	String kingdom;
	
	public Claim()
	{
		county = "Dublin";
		duchy = "Meath";
		kingdom = "Ireland";
				
	}
	
	public String  getClaim() {
		return county + ", in " + duchy + ", in " + kingdom + ".";
		
		
	}

}