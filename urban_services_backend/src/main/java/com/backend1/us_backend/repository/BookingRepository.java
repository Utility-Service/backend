package com.backend1.us_backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.backend1.us_backend.entity.Booking;
import com.backend1.us_backend.models.BookingDetails;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {
    @Query("SELECT new com.backend1.us_backend.models.BookingDetails(b.booking_id, c.first_name, c.last_name) " +
            "FROM Booking b JOIN b.customer c")
    List<BookingDetails> findAllBookingsWithCustomerNames();
}
