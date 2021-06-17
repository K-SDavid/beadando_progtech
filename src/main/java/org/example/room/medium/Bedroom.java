package org.example.room.medium;

import org.example.room.Room;

public class Bedroom implements Room {
    @Override
    public int cost() {
        return 900;
    }

    @Override
    public String toString() {
        return "Bedroom value: " + this.cost() + "€";
    }
}
