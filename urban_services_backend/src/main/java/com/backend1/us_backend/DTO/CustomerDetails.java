package com.backend1.us_backend.DTO;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class CustomerDetails {
    private Integer customer_id;

    private String first_name;

    private String last_name;

    private String email;

    private String phone_number;

    private String address;

    private String city;

    private String state;

    private String zip_code;

    private LocalDateTime created_at;

    private LocalDateTime updated_at;

    private String password;

}
