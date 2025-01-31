package com.backend1.us_backend.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.backend1.us_backend.DTO.BookingDetails;
import com.backend1.us_backend.entity.Booking;
import com.backend1.us_backend.entity.Customer;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {
    // @Query("SELECT new com.backend1.us_backend.DTO.BookingDetails(b.booking_id,c.customer_id,c.first_name, c.last_name, "+"b.agent_id, b.utilities_id, b.booking_date, b.scheduled_date,b.scheduled_time, b.status, b.created_at, b.updated_at) " +"FROM Booking b JOIN b.customer c")
    // List<BookingDetails> findAllBookingsWithCustomerNames();

    // List<BookingDetails> findAllBooking();
    // List<Booking> findAll();
    List<Booking> findByCustomer(Customer customer);
}
