package org.example.house;

import org.example.room.Room;

public interface HouseBuilder {
    HouseBuilder addKitchen(Room kitchen);
    HouseBuilder addBathroom(Room bathroom);
    HouseBuilder addBedroom(Room bedroom);
    HouseBuilder addLivingRoom(Room livingRoom);
    House build();
}
