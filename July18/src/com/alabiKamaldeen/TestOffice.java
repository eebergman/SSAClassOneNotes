package com.alabiKamaldeen;

public class TestOffice {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		Office o = new Office();
		Office o2 = new Office();
		
		System.out.println(o.getFullOfficeInformation());
		
		o2.officeName = "Office of the SSA Acting Commissioner";
		
		System.out.println(o2.getFullOfficeInformation());


	}

}
