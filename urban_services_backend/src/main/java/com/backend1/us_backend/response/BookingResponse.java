package com.backend1.us_backend.response;

import lombok.Data;
import com.backend1.us_backend.entity.Booking;

@Data
public class BookingResponse {
    private String message;
    public Booking booking;
}
