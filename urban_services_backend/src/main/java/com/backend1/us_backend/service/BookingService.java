package com.backend1.us_backend.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend1.us_backend.DTO.BookingDetails;
import com.backend1.us_backend.entity.Booking;
import com.backend1.us_backend.entity.Customer;
import com.backend1.us_backend.entity.Agent;
import com.backend1.us_backend.entity.Utility;
import com.backend1.us_backend.repository.AgentRepository;
// import com.backend1.us_backend.models.BookingDetails;
import com.backend1.us_backend.repository.BookingRepository;
import com.backend1.us_backend.repository.CustomerRepository;
import com.backend1.us_backend.repository.UtilityRepository;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private AgentRepository agentRepository;

    @Autowired
    private UtilityRepository utilityRepository;

    public Booking addBooking(Integer customerId, Integer agentId, Integer utilitiesId, LocalDate bookingDate, LocalDate scheduleDate, LocalDateTime scheduledTime, String status, String place) {
        Booking booking = new Booking();
        
        Customer customer = customerRepository.findById(customerId).orElseThrow(() -> new RuntimeException("Customer not found"));
        Agent agent = agentRepository.findById(agentId).orElseThrow(() -> new RuntimeException("Agent not found"));
        Utility utility = utilityRepository.findById(utilitiesId).orElseThrow(() -> new RuntimeException("Utility not found"));

        booking.setCustomer(customer);
        booking.setAgent(agent);
        booking.setUtility(utility);
        booking.setBooking_date(bookingDate);
        booking.setSchedule_date(scheduleDate);
        booking.setScheduled_time(scheduledTime);
        booking.setStatus(status);
        booking.setPlace(place);
        booking.setCreated_at(LocalDateTime.now());
        booking.setUpdated_at(LocalDateTime.now());

        return bookingRepository.save(booking);
        // Booking booking = new Booking();
        // booking.setCustomer_id(bookingDTO.getCustomer_id());
        // booking.setAgent_id(bookingDTO.getAgent_id());
        // booking.setUtilities_id(bookingDTO.getUtilities_id());
        // booking.setBooking_date(bookingDTO.getBooking_date());
        // booking.setSchedule_date(bookingDTO.getSchedule_date());
        // booking.setStatus(bookingDTO.getStatus());
        // booking.setCreated_at(bookingDTO.getCreated_at());
        // booking.setUpdated_at(bookingDTO.getUpdated_at());
        // return bookingRepository.save(booking);
    }
    public List<Booking> getAllBookingsWithCustomersNames() {
        // List<Booking> bookings= bookingRepository.findAllBookingsWithCustomerNames();
        // List<BookingDetails> bookingDetails = new ArrayList<>();
        // bookings.forEach(item-> bookingDetails.add(convertBookingToBookingDetails(item)));
        // return bookingDetails;
        return bookingRepository.findAll();
    }
    // public BookingDetails convertBookingToBookingDetails(Booking booking) {
    //     BookingDetails bookingDetails = new BookingDetails();
    //     bookingDetails.setBooking_id(booking.getBooking_id());
    //     bookingDetails.setCustomer_id(booking.getCustomer().getCustomer_id());
    //     bookingDetails.setFirst_name(booking.getCustomer().getFirst_name());
    //     bookingDetails.setLast_name(booking.getCustomer().getLast_name());
    //     bookingDetails.setAgent_id(booking.getAgent_id());
    //     bookingDetails.setUtilities_id(booking.getUtilities_id());
    //     bookingDetails.setBooking_date(booking.getBooking_date());
    //     bookingDetails.setSchedule_date(booking.getSchedule_date());
    //     bookingDetails.setStatus(booking.getStatus());
    //     bookingDetails.setCreated_at(booking.getCreated_at());
    //     bookingDetails.setUpdated_at(booking.getUpdated_at());
    //     return bookingDetails;
    // }
}
