package org.example.room.small;

import org.example.room.Room;

public class LivingRoom implements Room {
    @Override
    public int cost() {
        return 500;
    }

    @Override
    public String toString() {
        return "Living room value: " + this.cost() + "€";
    }
}
