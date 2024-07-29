package com.backend1.us_backend.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "agents")
public class Agent {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "agents_agent_id_seq")
    @SequenceGenerator(name = "agents_agent_id_seq", sequenceName = "agents_agent_id_seq", allocationSize = 1)
    private Integer agent_id;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "aadhar_number")
    private String aadhar_number;

    @Column(name = "phone_number")
    private String phone_number;

    @Column(name = "hire_date")
    private LocalDate hire_date;

    @Column(name = "created_at")
    private LocalDateTime created_at;

    @Column(name = "updated_at")
    private LocalDateTime updated_at;

    @Column(name = "password")
    private String password;

    @Column(name = "profession")
    private String profession;

    @Column(name = "available")
    private Boolean available;

    @Column(name = "tos")
    private String tos;

}
