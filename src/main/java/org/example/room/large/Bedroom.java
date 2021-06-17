package org.example.room.large;

import org.example.room.Room;

public class Bedroom implements Room {
    @Override
    public int cost() {
        return 1400;
    }

    @Override
    public String toString() {
        return "Bedroom value: " + this.cost() + "€";
    }
}
