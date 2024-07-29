package com.backend1.us_backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend1.us_backend.DTO.BookingDetails;
import com.backend1.us_backend.entity.Booking;
// import com.backend1.us_backend.models.BookingDetails;
import com.backend1.us_backend.repository.BookingRepository;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public List<BookingDetails> getAllBookingsWithCustomersNames() {
        // List<Booking> bookings= bookingRepository.findAllBookingsWithCustomerNames();
        // List<BookingDetails> bookingDetails = new ArrayList<>();
        // bookings.forEach(item-> bookingDetails.add(convertBookingToBookingDetails(item)));
        // return bookingDetails;
        return bookingRepository.findAllBookingsWithCustomerNames();
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
