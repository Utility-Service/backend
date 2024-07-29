package com.backend1.us_backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend1.us_backend.DTO.CustomerDetails;
import com.backend1.us_backend.entity.Customer;
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

    public Customer addCustomer(CustomerDetails customerDetails) {
        Customer customer = new Customer();
        customer.setFirst_name(customerDetails.getFirst_name());
        customer.setLast_name(customerDetails.getLast_name());
        customer.setEmail(customerDetails.getEmail());
        customer.setPhone_number(customerDetails.getPhone_number());
        customer.setAddress(customerDetails.getAddress());
        customer.setCity(customerDetails.getCity());
        customer.setState(customerDetails.getState());
        customer.setZip_code(customerDetails.getZip_code());
        customer.setCreated_at(customerDetails.getCreated_at());
        customer.setUpdated_at(customerDetails.getUpdated_at());
        customer.setPassword(customerDetails.getPassword());

        customerRepository.save(customer);
        return customer;
    }

    public Customer loginCustomer(CustomerDetails customerDetails) {
        Customer customer = customerRepository.findByEmail(customerDetails.getEmail());
        if(customer == null) {
            return null;
        }
        if(customer.getPassword().equals(customerDetails.getPassword())) {
            return customer;
        }
        return null;
    } 
}
