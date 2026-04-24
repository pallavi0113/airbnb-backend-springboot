package com.pallavi.project.AirBnb.service;

import com.pallavi.project.AirBnb.entity.Booking;

public interface CheckoutService {

    String getCheckoutSession(Booking booking, String successUrl, String failureUrl);

}
