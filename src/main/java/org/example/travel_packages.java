package org.example;
import org.example.Destination;
import org.example.Passenger;
import java.util.ArrayList;

public class travel_packages {

    String Name;
    int Passenger_Capacity;
    ArrayList<Destination> destinations;
    ArrayList<Passenger>Passengers;
    travel_packages(String Name,int Passenger_Capacity,ArrayList<Destination> destinations,ArrayList<Passenger>Passengers)
    {

        this.Name=Name;
        this.Passenger_Capacity=Passenger_Capacity;
        this.destinations=destinations;
        this.Passengers=Passengers;
    }
    public void print_packages()
    {
        System.out.println("Package Name "+Name);
        for(Destination dr:destinations)
        {   System.out.println("Destination Name "+(dr.Name));
            for(Activity ar :dr.activities)
            {
                System.out.println("Activity participating "+(ar.Name));
                System.out.println("Cost of the activity "+(ar.cost));
                System.out.println("Capacity of the Activity "+(ar.capacity));
                System.out.println("Description of the Activity "+(ar.Description));

            }
        }

    }
    public void passengers_list()

    {
        System.out.println("Package Name "+Name);
        System.out.println("Passenger Capacity "+Passenger_Capacity);
        for(Passenger pr:Passengers)
        {
            System.out.println("Passenger Name "+pr.Name);
            System.out.println("Passenger Number "+pr.Passenger_No);


        }


    }

}
