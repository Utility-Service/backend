package com.backend1.us_backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend1.us_backend.entity.Customer;
import com.backend1.us_backend.models.CustomerDetails;
import com.backend1.us_backend.repository.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<CustomerDetails> getAllCustomers() { // service function that interact with db via jpaObject
        List<Customer> customers = customerRepository.findAll(); // list/arr data store all rows
        List<CustomerDetails> customerDetailsList = new ArrayList<>();
        customers.forEach(item -> customerDetailsList.add(convertCustomerToCustomerDetails(item)));
        return customerDetailsList;
    }

    private CustomerDetails convertCustomerToCustomerDetails(Customer customer) {
        CustomerDetails customerDetails = new CustomerDetails();
        customerDetails.setCustomer_id(customer.getCustomer_id());
        customerDetails.setFirst_name(customer.getFirst_name());
        customerDetails.setLast_name(customer.getLast_name());
        customerDetails.setEmail(customer.getEmail());
        customerDetails.setPhone_number(customer.getPhone_number());
        customerDetails.setAddress(customer.getAddress());
        customerDetails.setCity(customer.getCity());
        customerDetails.setState(customer.getState());
        customerDetails.setCreated_at(customer.getCreated_at());
        customerDetails.setUpdated_at(customer.getUpdated_at());
        customerDetails.setPassword(customer.getPassword());
        return customerDetails;

    }

}
