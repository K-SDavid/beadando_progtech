package org.example.room.large;

import org.example.room.Room;

public class Bathroom implements Room {
    @Override
    public int cost() {
        return 600;
    }

    @Override
    public String toString() {
        return "Bathroom value: " + this.cost() + "€";
    }
}
