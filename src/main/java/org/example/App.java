package org.example;

import org.example.forSale.ForSale;
import org.example.house.House;

public class App
{
    public static void main( String[] args )
    {
        ForSale forSale = ForSale.getInstance();

        House house = Client.buildHouse("small", "Kitchen", "small", "Bedroom",
                "small", "Bathroom", "small", "LivingRoom");
        System.out.println(house.toString());

        forSale.store(house);
        System.out.println(forSale);
    }
}
