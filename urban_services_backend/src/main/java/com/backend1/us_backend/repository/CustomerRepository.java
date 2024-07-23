package com.backend1.us_backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend1.us_backend.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    // List<Customer> findAllByCustomer_id();
}
