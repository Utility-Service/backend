package com.backend1.us_backend.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @Column(name = "booking_id")
    private Integer booking_id;

    // @Column(name = "customer_id")
    // private Integer customer_id;

    // adding customers attributes
    // @Column(name = "first_name")
    // private String first_name;

    // @Column(name = "last_name")
    // private String last_name;
    // end

    @Column(name = "agent_id")
    private Integer agent_id;

    @Column(name = "utilities_id")
    private Integer utilities_id;

    @Column(name = "booking_date")
    private LocalDate booking_date;

    @Column(name = "schedule_date")
    private LocalDate schedule_date;

    @Column(name = "status")
    private String status;

    @Column(name = "created_at")
    private LocalDateTime created_at;

    @Column(name = "updated_at")
    private LocalDateTime updated_at;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id") // Reference to customer entity to fetch its
                                                                            // attributes
    private Customer customer;
}
