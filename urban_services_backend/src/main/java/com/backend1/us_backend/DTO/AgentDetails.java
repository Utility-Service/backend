package com.backend1.us_backend.DTO;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class AgentDetails {
    private Integer agent_id;

    private String first_name;

    private String last_name;

    private String aadhar_number;

    private String phone_number;

    private LocalDate hire_date;

    private LocalDateTime created_at;

    private LocalDateTime updated_at;

    private String password;

    private String profession;

}
