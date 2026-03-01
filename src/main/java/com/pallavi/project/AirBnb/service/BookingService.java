package com.pallavi.project.AirBnb.service;

import com.pallavi.project.AirBnb.dto.BookingDto;
import com.pallavi.project.AirBnb.dto.BookingRequest;
import com.pallavi.project.AirBnb.dto.GuestDto;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface BookingService {
    BookingDto initialiseBooking(BookingRequest bookingRequest);
    BookingDto addGuests(Long bookingId, List<GuestDto> guestDtoList);
}