package com.pallavi.project.AirBnb.service;

import com.pallavi.project.AirBnb.dto.BookingDto;
import com.pallavi.project.AirBnb.dto.BookingRequest;
import com.pallavi.project.AirBnb.dto.GuestDto;
import com.pallavi.project.AirBnb.dto.HotelReportDto;
import com.pallavi.project.AirBnb.entity.Booking;
import com.pallavi.project.AirBnb.entity.enums.BookingStatus;
import org.jspecify.annotations.Nullable;
import com.stripe.model.Event;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.List;

public interface BookingService {
    BookingDto initialiseBooking(BookingRequest bookingRequest);

    BookingDto addGuests(Long bookingId, List<GuestDto> guests);

//    String initiatePayments(Long bookingId);
    Booking getBookingEntity(Long bookingId);
    void capturePayment(Event event);

    void cancelBooking(Long bookingId);

    BookingStatus getBookingStatus(Long bookingId);

    List<BookingDto> getAllBookingsByHotelId(Long hotelId);

    HotelReportDto getHotelReport(Long hotelId, LocalDate startDate, LocalDate endDate);

    List<BookingDto> getMyBookings();
}