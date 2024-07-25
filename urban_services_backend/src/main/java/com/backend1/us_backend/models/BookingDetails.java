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

    public BookingDetails(Integer booking_id, Integer customer_id, String first_name, String last_name,
            Integer agent_id, Integer utilities_id, LocalDate booking_date, LocalDate schedule_date, String status,
            LocalDateTime created_at, LocalDateTime updated_at) {
        this.booking_id = booking_id;
        this.customer_id = customer_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.agent_id = agent_id;
        this.utilities_id = utilities_id;
        this.booking_date = booking_date;
        this.schedule_date = schedule_date;
        this.status = status;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

}
