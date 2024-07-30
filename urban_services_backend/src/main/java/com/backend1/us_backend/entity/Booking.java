package com.backend1.us_backend.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id")
    private Integer booking_id;

    // @Column(name = "customer_id")
    // private Integer customer_id;
    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id") // Reference to customer entity to fetch its attributes
    private Customer customer;

    // @Column(name = "agent_id")
    // private Integer agent_id;
    @ManyToOne
    @JoinColumn(name = "agent_id", referencedColumnName = "agent_id")
    private Agent agent;

    // @Column(name = "utilities_id")
    // private Integer utilities_id;
    @ManyToOne
    @JoinColumn(name = "utilities_id", referencedColumnName = "utilities_id")
    private Utility utility;

    @Column(name = "booking_date")
    private LocalDate booking_date;

    @Column(name = "scheduled_date")
    private LocalDate schedule_date;

    @Column(name = "scheduled_time")
    private LocalDateTime scheduled_time; 

    @Column(name = "status")
    private String status;

    @Column(name = "created_at")
    private LocalDateTime created_at;

    @Column(name = "updated_at")
    private LocalDateTime updated_at;

    @Column(name = "place", length = 255)
    private String place;

}
