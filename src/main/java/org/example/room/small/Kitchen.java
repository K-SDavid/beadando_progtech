package org.example.room.small;

import org.example.room.Room;

public class Kitchen implements Room {

    @Override
    public int cost() { return 200; }

    @Override
    public String toString() {
        return "Kitchen value: " + this.cost() + "€";
    }
}
