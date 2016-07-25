package com.ssaweek1.assignment1;

public class Stock {

	double DOW;
	double  SandP;
	double Nasdaq;
	
	String stock1; 
	String stock2;
	String stock3;

	
	
	//TODAY'S STOCK VALUE
	public Stock() 
	{
		DOW = 18521.82; 
		SandP = 2159.95;
		Nasdaq = 2159.95;
		
		stock1 = "DOW";
		stock2 = "SandP";
		stock3 = "Nasdaq";
		
	}
	
	public double getStockValueaverage ()
	
	{
		return ((DOW + SandP + Nasdaq)/3);
	}
	
	
	public String sendMessage()
	
	{
	return stock1 + " " + stock2 + " " + stock3; 
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
