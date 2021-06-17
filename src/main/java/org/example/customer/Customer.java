package org.example.customer;

import org.example.forSale.ForSale;
import org.example.house.House;

public class Customer {
    ForSale forSale;

    public Customer(ForSale forSale){
        this.forSale = forSale;
    }

    public void testCustomer(House house){
        this.forSale.sold(house);
    }
}
