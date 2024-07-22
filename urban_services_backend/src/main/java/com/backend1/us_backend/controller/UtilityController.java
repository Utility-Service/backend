package com.backend1.us_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend1.us_backend.models.UtilityDetails;
import com.backend1.us_backend.service.UtilityService;

@RestController

public class UtilityController {

    @Autowired
    private UtilityService utility;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/utilities")
    public List<UtilityDetails> getUtilities() {
        return utility.getUtilities();
    }

}
