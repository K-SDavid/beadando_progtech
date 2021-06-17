package org.example.room.medium;

import org.example.room.Room;

public class Kitchen implements Room {

    @Override
    public int cost() {
        return 500;
    }

    @Override
    public String toString() {
        return "Kitchen value: " + this.cost() + "€";
    }
}
