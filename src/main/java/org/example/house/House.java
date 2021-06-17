package org.example.house;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.example.room.Room;

import java.util.List;

@RequiredArgsConstructor
@ToString
public class House {
    private final List<Room> rooms;
    private final int price;

    public int getPrice() {
        return this.price;
    }
}
