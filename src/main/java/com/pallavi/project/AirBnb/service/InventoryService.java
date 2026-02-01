package com.pallavi.project.AirBnb.service;

import com.pallavi.project.AirBnb.entity.Room;

public interface InventoryService {
    void initializeRoomForAYear(Room room);
    void deleteFutureInventories(Room room);

}
