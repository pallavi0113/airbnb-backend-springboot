package com.pallavi.project.AirBnb.service;

import com.pallavi.project.AirBnb.dto.HotelDto;
import com.pallavi.project.AirBnb.dto.HotelPriceDto;
import com.pallavi.project.AirBnb.dto.HotelSearchRequest;
import com.pallavi.project.AirBnb.entity.Room;
import org.springframework.data.domain.Page;


public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteAllInventories(Room room);

    Page<HotelPriceDto> searchHotels(HotelSearchRequest hotelSearchRequest);
}

