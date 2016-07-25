package com.ssa1.assignment1;

public class BaseballPlayer 
{
	String playerLastName;
	String playerTeam;
	Integer number;
	
	public BaseballPlayer()
	{
		playerLastName = "Machado";
		playerTeam = "Baltimore Orioles";
		number = 13;
	}
	
	public String getPlayerInfo() 
	{
		return playerLastName + " " + playerTeam + " " + number;
	}
}