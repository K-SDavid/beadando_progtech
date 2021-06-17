package org.example.room;

import org.example.room.large.LargeRoomFactory;
import org.example.room.medium.MediumRoomFactory;
import org.example.room.small.SmallRoomFactory;

public class AbstractFactory {
    public static RoomFactory getRoomFactory(String name){
        RoomFactory roomFactory;
        if (name.equalsIgnoreCase("small")){
            roomFactory = new SmallRoomFactory();
        } else if(name.equalsIgnoreCase("medium")){
            roomFactory = new MediumRoomFactory();
        } else if(name.equalsIgnoreCase("large")){
            roomFactory = new LargeRoomFactory();
        } else throw new RuntimeException("Unsupported Factory type!");
        return roomFactory;
    }
}
