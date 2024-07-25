package com.backend1.us_backend.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class BookingDetails {

    private Integer booking_id;

    private Integer customer_id;

    // adding customers attributes
    private String first_name;

    private String last_name;
    // end

    private Integer agent_id;

    private Integer utilities_id;

    private LocalDate booking_date;

    private LocalDate schedule_date;

    private String status;

    private LocalDateTime created_at;

    private LocalDateTime updated_at;

}
