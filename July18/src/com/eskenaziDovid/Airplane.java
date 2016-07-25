package com.ssaweek1.assignment1;

public class Airplane
{

    String model;
    String idNumber;
    Integer seatAmount;
    Integer makeYear;
    Integer price;

    public Airplane()
    {

        model = "Concord";
        idNumber = "F123D-5";
        seatAmount = 300;
        makeYear = 1990;
        price = 25000;
    }

    public String getAirplaneData()
    {
        return model + "\n" + idNumber + "\n" + seatAmount + "\n" + makeYear + "\n" + price;

    }
}
