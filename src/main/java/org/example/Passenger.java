package org.example;

public class Passenger {
    String Name;
    int Passenger_No;
    String type;
    int balance;
    Passenger(String Name,int Passenger_No,String type,int balance)
    {
        this.Name=Name;
        this.Passenger_No=Passenger_No;
        this.type=type;
        this.balance=balance;


    }
    public void passenger_details()
    {
        System.out.println("Passenger Name "+Name);
        System.out.println("Passenger Number "+Passenger_No);
        if(type!="Premium")
        {
            System.out.println("Balance "+balance);

        }




    }


}
