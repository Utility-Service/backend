package com.backend1.us_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.backend1.us_backend.service.BookingService;
import com.backend1.us_backend.entity.Booking;
import com.backend1.us_backend.models.BookingDetails;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/admin/bookings") // Only admin should be able to see all the bookings
    public List<BookingDetails> getALlBookingsWithCustomersNames() {
        return bookingService.getALlBookingsWithCustomersNames();
    }

}
