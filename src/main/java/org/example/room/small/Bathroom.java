package org.example.room.small;

import org.example.room.Room;

public class Bathroom implements Room {
    @Override
    public int cost() {
        return 100;
    }

    @Override
    public String toString() {
        return "Bathroom value: " + this.cost() + "€";
    }
}
