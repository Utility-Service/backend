package com.backend1.us_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend1.us_backend.models.AgentDetails;
import com.backend1.us_backend.service.AgentService;

@RestController
public class AgentController {

    @Autowired
    private AgentService agentService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/admin/agents")
    public List<AgentDetails> getAllAgents() {
        return agentService.getAllAgents();
    }
}
