package com.pallavi.project.AirBnb.service;

import com.pallavi.project.AirBnb.dto.HotelDto;

public interface HotelService {
    HotelDto createNewHotel(HotelDto hotelDto);
    HotelDto getHotelById(Long id);

}
