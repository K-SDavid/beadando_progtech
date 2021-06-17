package org.example.room.large;

import org.example.room.Room;

public class Kitchen implements Room {

    @Override
    public int cost() {
        return 1000;
    }

    @Override
    public String toString() {
        return "Kitchen value: " + this.cost() + "€";
    }
}
