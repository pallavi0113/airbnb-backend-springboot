package com.pallavi.project.AirBnb.controller;

import com.pallavi.project.AirBnb.dto.*;
import com.pallavi.project.AirBnb.entity.Booking;
import com.pallavi.project.AirBnb.service.BookingService;
import com.pallavi.project.AirBnb.service.CheckoutService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bookings")
@Slf4j
public class HotelBookingController {
    private final BookingService bookingService;
    private final CheckoutService checkoutService;

    @PostMapping("/init")
    public ResponseEntity<BookingDto> initialiseBooking(@RequestBody BookingRequest bookingRequest){
        return ResponseEntity.ok(bookingService.initialiseBooking(bookingRequest));
    }

    @PostMapping("/{bookingId}/addGuests")
    public ResponseEntity<BookingDto> addGuests(@PathVariable Long bookingId,
                                                @RequestBody List<GuestDto> guests) {
        return ResponseEntity.ok(bookingService.addGuests(bookingId, guests));
    }


//    @PostMapping("/{bookingId}/payments")
//    @Operation(summary = "Initiate payments flow for the booking", tags = {"Booking Flow"})
//    public ResponseEntity<BookingPaymentInitResponseDto> initiatePayment(@PathVariable Long bookingId) {
//        String sessionUrl = bookingService.initiatePayments(bookingId);
//        return ResponseEntity.ok(new BookingPaymentInitResponseDto(sessionUrl));
//    }

    @PostMapping("/{bookingId}/payments")
    public ResponseEntity<BookingPaymentInitResponseDto> initiatePayment(@PathVariable Long bookingId) {

        Booking booking = bookingService.getBookingEntity(bookingId); // we will add this

        String successUrl = "http://localhost:3000/success";
        String failureUrl = "http://localhost:3000/failure";

        String sessionUrl = checkoutService.getCheckoutSession(booking, successUrl, failureUrl);

        return ResponseEntity.ok(new BookingPaymentInitResponseDto(sessionUrl));
    }

    @PostMapping("/{bookingId}/cancel")
    @Operation(summary = "Cancel the booking", tags = {"Booking Flow"})
    public ResponseEntity<Void> cancelBooking(@PathVariable Long bookingId) {
        bookingService.cancelBooking(bookingId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{bookingId}/status")
    @Operation(summary = "Check the status of the booking", tags = {"Booking Flow"})
    public ResponseEntity<BookingStatusResponseDto> getBookingStatus(@PathVariable Long bookingId) {
        return ResponseEntity.ok(new BookingStatusResponseDto(bookingService.getBookingStatus(bookingId)));
    }
}
