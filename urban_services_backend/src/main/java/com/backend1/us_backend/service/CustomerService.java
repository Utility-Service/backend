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
        System.out.println("****************************************************************************");
        System.out.println("getAllCutomers hitted!");
        System.out.println("****************************************************************************");
        System.out.println("line 24");
        List<Customer> customers = customerRepository.findAll(); // list/arr data store all rows
        System.out.println("line 26");
        List<CustomerDetails> customerDetailsList = new ArrayList<>();
        System.out.println("line 28");
        customers.forEach(item -> customerDetailsList.add(convertCustomerToCustomerDetails(item)));
        System.out.println("line 30");
        return customerDetailsList;
    }

    private CustomerDetails convertCustomerToCustomerDetails(Customer customer) {
        System.out.println("****************************************************************************");
        System.out.println("convert hitted!");
        System.out.println("****************************************************************************");
        CustomerDetails customerDetails = new CustomerDetails();
        customerDetails.setCustomer_id(customerDetails.getCustomer_id());
        customerDetails.setFirst_name(customerDetails.getFirst_name());
        customerDetails.setLast_name(customerDetails.getLast_name());
        customerDetails.setEmail(customerDetails.getEmail());
        customerDetails.setPhone_number(customerDetails.getPhone_number());
        customerDetails.setAddress(customerDetails.getAddress());
        customerDetails.setCity(customerDetails.getCity());
        customerDetails.setState(customerDetails.getState());
        customerDetails.setCreated_at(customerDetails.getCreated_at());
        customerDetails.setUpdated_at(customerDetails.getUpdated_at());
        customerDetails.setPassword(customerDetails.getPassword());

        return customerDetails;

    }

}
