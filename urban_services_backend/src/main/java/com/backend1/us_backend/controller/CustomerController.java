package com.backend1.us_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.backend1.us_backend.DTO.CustomerDetails;
import com.backend1.us_backend.entity.Customer;
import com.backend1.us_backend.response.LoginResponse;
import com.backend1.us_backend.response.SignupResponse;
import com.backend1.us_backend.service.CustomerService;

import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @CrossOrigin
    @GetMapping("/admin/customers")
    public List<CustomerDetails> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @CrossOrigin
    @PostMapping(path = "/login", consumes = "application/json")
    public LoginResponse loginCustomer(@RequestBody CustomerDetails customerDTO) {
        System.out.println("Login DTO");
        System.out.println(customerDTO);
        
        Customer customer = customerService.loginCustomer(customerDTO);
        LoginResponse loginResponse = new LoginResponse();
        if (customer != null) {
            loginResponse.setMessage("Login successful");
            loginResponse.setCustomer(customer);
        } else {
            loginResponse.setMessage("Login failed");
        }
        return loginResponse;
    }
    
    @CrossOrigin
    @PostMapping(path = "/signup", consumes = "application/json")
    public SignupResponse signupCustomer(@RequestBody CustomerDetails customerDTO) {
        System.out.println(customerDTO);
        Customer customer = customerService.addCustomer(customerDTO);
        
        SignupResponse signupResponse = new SignupResponse();
        if (customer != null) {
            signupResponse.setMessage("Signup successful");
            signupResponse.setCustomer(customer);
        } else {
            signupResponse.setMessage("Signup failed");
        }
        return signupResponse;
    }
}
