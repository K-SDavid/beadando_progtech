package org.example;

import org.example.house.House;
import org.example.house.HouseBuilderImpl;
import org.example.room.AbstractFactory;
import org.example.room.Room;
import org.example.room.RoomFactory;

public class Client {
    public static RoomFactory roomFactory;

    public static Room generateRoom(RoomFactory rF, String roomName){
        return rF.createRoom(roomName);
    }

    public static House generateHouse(Room kitchen, Room bedroom, Room bathroom, Room livingRoom){
        return new HouseBuilderImpl().addKitchen(kitchen).addBedroom(bedroom).addBathroom(bathroom).addLivingRoom(livingRoom).build();
    }

    public static House buildHouse(String kitchenSize, String kitchenString, String bedroomSize, String bedroomString,
                                   String bathroomSize, String bathroomString, String livingRoomSize, String livingRoomString){
        roomFactory = AbstractFactory.getRoomFactory(kitchenSize);
        Room kitchen = Client.generateRoom(roomFactory, kitchenString);

        roomFactory = AbstractFactory.getRoomFactory(bedroomSize);
        Room bedroom = Client.generateRoom(roomFactory, bedroomString);

        roomFactory = AbstractFactory.getRoomFactory(bathroomSize);
        Room bathroom = Client.generateRoom(roomFactory, bathroomString);

        roomFactory = AbstractFactory.getRoomFactory(livingRoomSize);
        Room livingRoom = Client.generateRoom(roomFactory, livingRoomString);

        return Client.generateHouse(kitchen, bedroom, bathroom, livingRoom);
    }
}
