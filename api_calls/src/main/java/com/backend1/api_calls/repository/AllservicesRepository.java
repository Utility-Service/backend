package com.backend1.api_calls.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend1.api_calls.entity.Allservice;

@Repository
public interface AllservicesRepository extends JpaRepository<Allservice, Integer> {
    
}
