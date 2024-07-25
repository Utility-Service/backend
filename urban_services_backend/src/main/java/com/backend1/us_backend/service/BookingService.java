package com.backend1.us_backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend1.us_backend.entity.Booking;
import com.backend1.us_backend.models.BookingDetails;
// import com.backend1.us_backend.models.BookingDetails;
import com.backend1.us_backend.repository.BookingRepository;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public List<BookingDetails> getAllBookingsWithCustomersNames() {
        List<BookingDetails> bd1;
        bd1 = bookingRepository.findAllBookingsWithCustomerNames();
        System.out.println(bd1);
        return bd1;
    }

    // public List<BookingDetails> getAllBookings() {
    // List<Booking> bookings = bookingRepository.findAll();
    // List<BookingDetails> bookingDetailsList = new ArrayList<>();
    // bookings.forEach(item ->
    // bookingDetailsList.add(convertBookingToBookingDetails(item)));
    // return bookingDetailsList;
    // }

    // private BookingDetails convertBookingToBookingDetails(Booking booking) {
    // BookingDetails bookingDetails = new BookingDetails();

    // bookingDetails.setBooking_id(booking.getBooking_id());
    // bookingDetails.setCustomer_id(booking.getCustomer_id());
    // bookingDetails.setAgent_id(booking.getAgent_id());
    // bookingDetails.setUtilities_id(booking.getUtilities_id());
    // bookingDetails.setBooking_date(booking.getBooking_date());
    // bookingDetails.setSchedule_date(booking.getSchedule_date());
    // bookingDetails.setStatus(booking.getStatus());
    // bookingDetails.setCreated_at(booking.getCreated_at());
    // bookingDetails.setUpdated_at(booking.getUpdated_at());

    // return bookingDetails;

    // }
}
