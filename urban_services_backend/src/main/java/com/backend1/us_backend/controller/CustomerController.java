package com.backend1.us_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend1.us_backend.service.CustomerService;
import com.backend1.us_backend.models.CustomerDetails;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/admin/customers")
    public List<CustomerDetails> getAllCustomers() {
        return customerService.getAllCustomers();
    }

}
