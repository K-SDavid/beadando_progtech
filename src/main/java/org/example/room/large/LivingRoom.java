package org.example.room.large;

import org.example.room.Room;

public class LivingRoom implements Room {
    @Override
    public int cost() {
        return 1300;
    }

    @Override
    public String toString() {
        return "Living room value: " + this.cost() + "€";
    }
}
