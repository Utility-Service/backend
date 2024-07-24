package com.backend1.us_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend1.us_backend.entity.Customer;

@Repository
public interface AgentRepository extends JpaRepository<Agent, Integer> {

}
