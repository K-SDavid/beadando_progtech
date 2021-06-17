package org.example.house;

import org.example.room.Room;

import java.util.ArrayList;
import java.util.List;

public class HouseBuilderImpl implements HouseBuilder{
    List<Room> roomList = new ArrayList<>();
    int price = 0;

    @Override
    public HouseBuilder addKitchen(Room kitchen) {
        roomList.add(kitchen);
        price += kitchen.cost();
        return this;
    }

    @Override
    public HouseBuilder addBathroom(Room bathroom) {
        roomList.add(bathroom);
        price += bathroom.cost();
        return this;
    }

    @Override
    public HouseBuilder addBedroom(Room bedroom) {
        roomList.add(bedroom);
        price += bedroom.cost();
        return this;
    }

    @Override
    public HouseBuilder addLivingRoom(Room livingRoom) {
        roomList.add(livingRoom);
        price += livingRoom.cost();
        return this;
    }

    @Override
    public House build() {
        return new House(roomList, price);
    }
}
