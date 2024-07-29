package com.backend1.us_backend.DTO;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class UtilityDetails {

    private Integer id;

    private String name;

    private String desc;

    private String type_of_service;

    private String pictures;

    private BigDecimal price;
}
