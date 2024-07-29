package com.backend1.us_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.backend1.us_backend.DTO.UtilityDetails;
import com.backend1.us_backend.service.UtilityService;

@RestController
public class UtilityController {

    @Autowired
    private UtilityService utilityService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/utilities")
    public List<UtilityDetails> getUtilitiesByType(@RequestParam(required = false) String typeofservice) {
        System.out.println("type of service: " + typeofservice);
        if (typeofservice == null) {
            return utilityService.getAllUtilities();
        } else {
            return utilityService.getUtilitiesByType(typeofservice);
        }
    }
}
