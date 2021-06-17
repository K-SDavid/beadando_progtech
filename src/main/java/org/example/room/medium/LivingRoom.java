package org.example.room.medium;

import org.example.room.Room;

public class LivingRoom implements Room {
    @Override
    public int cost() {
        return 800;
    }

    @Override
    public String toString() {
        return "Living room value: " + this.cost() + "€";
    }
}
