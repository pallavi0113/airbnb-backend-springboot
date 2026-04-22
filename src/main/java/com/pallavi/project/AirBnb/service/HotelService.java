package com.pallavi.project.AirBnb.service;

import com.pallavi.project.AirBnb.dto.HotelDto;
import com.pallavi.project.AirBnb.dto.HotelInfoDto;
import org.jspecify.annotations.Nullable;

public interface HotelService {
    HotelDto createNewHotel(HotelDto hotelDto);
    HotelInfoDto getHotelById(Long id);
    HotelDto updateHotelById(Long id, HotelDto hotelDto);
    void deleteHotelById(Long id);
    void activateHotel(Long hotelId);

    HotelInfoDto getHotelInfoById(Long hotelId);
}
