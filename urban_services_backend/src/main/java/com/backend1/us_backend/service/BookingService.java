package com.backend1.us_backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import com.backend1.us_backend.models.BookingDetails;
=======
import com.backend1.us_backend.DTO.BookingDetails;
import com.backend1.us_backend.entity.Booking;
// import com.backend1.us_backend.models.BookingDetails;
>>>>>>> 01a2673 (Added login and Signup)
import com.backend1.us_backend.repository.BookingRepository;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public List<BookingDetails> getAllBookingsWithCustomersNames() {
        return bookingRepository.findAllBookingsWithCustomerNames();
    }

}
