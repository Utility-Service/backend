package com.backend1.us_backend.models;

import org.hibernate.type.descriptor.jdbc.TimeAsTimestampWithTimeZoneJdbcType;

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

    private TimeAsTimestampWithTimeZoneJdbcType created_at;

    private TimeAsTimestampWithTimeZoneJdbcType updated_at;

    private String password;

}
