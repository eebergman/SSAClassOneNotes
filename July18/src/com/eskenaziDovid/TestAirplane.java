package com.ssaweek1.assignment1;

public class TestAirplane
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Airplane one = new Airplane();
        Airplane two = new Airplane();
        
        two.makeYear = 1930;
        two.price = 19000;
        
        System.out.println(one.getAirplaneData());
        
        one.model = "Jet";

        System.out.println( one.model);
        System.out.println(two.getAirplaneData());
    }

}
