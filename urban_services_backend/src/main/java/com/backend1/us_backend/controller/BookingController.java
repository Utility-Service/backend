package com.backend1.us_backend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.backend1.us_backend.service.AgentService;
import com.backend1.us_backend.service.BookingService;
import com.backend1.us_backend.DTO.BookingDetails;
import com.backend1.us_backend.entity.Agent;
import com.backend1.us_backend.entity.Booking;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.backend1.us_backend.response.BookingResponse;
import com.backend1.us_backend.response.CancelBookingResponse;

@RestController
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @CrossOrigin(origins = "*")
    @GetMapping("/admin/bookings") // Only admin should be able to see all the bookings
    public List<Booking> getAllBookingsWithCustomersNamesAPI() {
        return bookingService.getAllBookingsWithCustomersNames();
    }

    @Autowired
    private AgentService agentService;
    
    @CrossOrigin(origins = "*")
    @PostMapping(path ="/booking/add",consumes = "application/json")
    public BookingResponse postMethodName(@RequestBody BookingDetails bookingDTO) {
        System.out.println(bookingDTO);
        
        String status="pending";
        //find agent id
        Integer agent_id;
        Integer utilities_id=bookingDTO.getUtilities_id();
        agent_id=agentService.findAgentIdByUtilityId(utilities_id);


        // Booking booking = bookingService.addBooking(bookingDTO);
        Booking booking=bookingService.addBooking(bookingDTO.getCustomer_id(), agent_id, bookingDTO.getUtilities_id(), bookingDTO.getBooking_date(), bookingDTO.getScheduled_date(), bookingDTO.getScheduled_time(), status, bookingDTO.getPlace());

        BookingResponse bookingResponse = new BookingResponse();
        if (booking != null) {
            bookingResponse.setMessage("Booking successful");
            bookingResponse.setBooking(booking);
        } else {
            bookingResponse.setMessage("Booking failed");
        }
        return bookingResponse;
    }
    
    @CrossOrigin(origins = "*")
    @GetMapping("/mybookings-active/{customerId}")
    public List<Booking> getMyBookingsPendingAPI(@PathVariable Integer customerId) {
        List<Booking> allBookings= bookingService.getMyBookings(customerId);
        List<Booking> pendingBookings = new ArrayList<>();

        for (Booking booking : allBookings) {
            if (booking.getStatus().trim().equals("pending")) {
                pendingBookings.add(booking);
            }
        }
        return pendingBookings;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/mybookings-cancelled/{customerId}")
    public List<Booking> getMyBookingsCancelledAPI(@PathVariable Integer customerId) {
        List<Booking> allBookings= bookingService.getMyBookings(customerId);
        // System.out.println(allBookings);
        List<Booking> cancelledBookings = new ArrayList<>();

        for (Booking booking : allBookings) {
            if (booking.getStatus().trim().equals("cancelled")) {
                cancelledBookings.add(booking);
            }
        }
        return cancelledBookings;
    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("/cancel/{booking_id}")
    public CancelBookingResponse cancelBooking(@PathVariable Integer booking_id) {
        Booking bookingCancelled=bookingService.cancelBooking(booking_id);
        
        CancelBookingResponse response = new CancelBookingResponse();
        if (bookingCancelled != null) {
            response.setMessage("Booking cancelled successfully :(");
            response.setDeleted(true);
        } else {
            response.setMessage("Booking not found");
            response.setDeleted(false);
        }
        return response;
    }
}
