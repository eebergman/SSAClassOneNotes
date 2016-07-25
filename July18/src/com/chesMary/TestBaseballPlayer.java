package com.ssa1.assignment1;


public class TestBaseballPlayer 
{

	public static void main(String[] args) 
	{
		BaseballPlayer b = new BaseballPlayer();
		BaseballPlayer b2 = new BaseballPlayer();
		
		b2.playerLastName = "Hardy";
		b2.playerTeam = "Baltimore Orioles";
		b2.number = 2;
		
		System.out.println(b.getPlayerInfo());
		System.out.println(b.playerTeam);
		System.out.println(b.number);
		
		System.out.println(b2.getPlayerInfo());
		System.out.println(b2.playerTeam);
		System.out.println(b2.number);
	}
}