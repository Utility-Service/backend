package com.backend1.us_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.backend1.us_backend.service.AgentService;
import com.backend1.us_backend.service.BookingService;
import com.backend1.us_backend.DTO.BookingDetails;
import com.backend1.us_backend.entity.Agent;
import com.backend1.us_backend.entity.Booking;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.backend1.us_backend.response.BookingResponse;

@RestController
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/admin/bookings") // Only admin should be able to see all the bookings
    public List<Booking> getAllBookingsWithCustomersNamesAPI() {
        return bookingService.getAllBookingsWithCustomersNames();
    }

    @Autowired
    private AgentService agentService;
    
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(path ="/booking/add",consumes = "application/json")
    public BookingResponse postMethodName(@RequestBody BookingDetails bookingDTO) {
        System.out.println(bookingDTO);
        
        String status="pending";
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
    
}
