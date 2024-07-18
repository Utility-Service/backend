package com.backend1.api_calls.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.backend1.api_calls.service.AllserviceService;
import com.backend1.api_calls.models.AllserviceDetails;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class AllservicesController {
    
    @Autowired
    private AllserviceService allserviceService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/allservices")
    public List<AllserviceDetails> fetchAllServices() {
        return allserviceService.getAllServices();
    }
    
}
