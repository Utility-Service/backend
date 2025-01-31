package com.backend1.us_backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend1.us_backend.entity.Agent;

@Repository
public interface AgentRepository extends JpaRepository<Agent, Integer> {
    List<Agent> findByTos(String tos);
}