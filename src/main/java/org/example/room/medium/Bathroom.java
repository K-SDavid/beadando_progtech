package org.example.room.medium;

import org.example.room.Room;

public class Bathroom implements Room {
    @Override
    public int cost() {
        return 300;
    }

    @Override
    public String toString() {
        return "Bathroom value: " + this.cost() + "€";
    }
}
