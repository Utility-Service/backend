package com.backend1.us_backend.entity;

import org.hibernate.type.descriptor.jdbc.TimeAsTimestampWithTimeZoneJdbcType;

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
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customsers_customer_id_seq")
    @SequenceGenerator(name = "customsers_customer_id_seq", sequenceName = "customsers_customer_id_seq", allocationSize = 1)
    private Integer customer_id;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phone_number;

    @Column(name = "address", columnDefinition = "text")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "zip_code")
    private String zip_code;

    @Column(name = "created_at")
    private TimeAsTimestampWithTimeZoneJdbcType created_at;

    @Column(name = "updated_at")
    private TimeAsTimestampWithTimeZoneJdbcType updated_at;

    @Column(name = "password")
    private String password;

}
