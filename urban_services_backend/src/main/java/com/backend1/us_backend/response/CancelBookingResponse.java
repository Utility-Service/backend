package com.backend1.us_backend.response;

import lombok.Data;

@Data
public class CancelBookingResponse {
    private boolean deleted;
    private String message;
}
