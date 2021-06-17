package org.example.room.medium;

import org.example.room.Room;
import org.example.room.RoomFactory;

public class MediumRoomFactory implements RoomFactory {

    @Override
    public Room createRoom(String name) {
        Room room;
        if(name.equalsIgnoreCase("Kitchen")){
            room = new Kitchen();
        } else if(name.equalsIgnoreCase("Bathroom")){
            room = new Bathroom();
        } else if(name.equalsIgnoreCase("LivingRoom")){
            room = new LivingRoom();
        }else if(name.equalsIgnoreCase("Bedroom")){
            room = new Bedroom();
        }else throw new RuntimeException("Unsupported room type!");
        return room;
    }
}
