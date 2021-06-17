package org.example.room.small;

import org.example.room.Room;

public class Bedroom implements Room {
    @Override
    public int cost() {
        return 400;
    }

    @Override
    public String toString() {
        return "Bedroom value: " + this.cost() + "€";
    }
}
