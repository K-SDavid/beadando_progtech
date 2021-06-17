package org.example.producer;

import org.example.forSale.ForSale;
import org.example.house.House;

public class Producer {
    ForSale forSale;

    public Producer(ForSale forSale) {
        this.forSale = forSale;
    }

    public void testProducer(House house) {
        this.forSale.store(house);
    }
}
