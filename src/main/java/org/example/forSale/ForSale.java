package org.example.forSale;

import org.example.house.House;

import java.util.ArrayList;
import java.util.List;

public class ForSale {
    public final static int limit = 20;
    private static ForSale instance;
    private final List<House> houses = new ArrayList<>();

    public static ForSale getInstance(){
        if(instance == null) {
            instance = new ForSale();
        }
        return instance;
    }

    private ForSale(){
    }

    public void store(House house){
        if(houses.size() == limit) {
            throw new RuntimeException("The Warehouse is full!");
        }
        this.houses.add(house);
    }

    public void sold(House house){
        this.houses.remove(house);
    }

    @Override
    public String toString() {
        return "Number of houses available to buy: " + houses.size();
    }
}
