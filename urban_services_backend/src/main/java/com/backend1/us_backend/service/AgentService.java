package com.backend1.us_backend.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend1.us_backend.entity.Agent;
import com.backend1.us_backend.models.AgentDetails;
import com.backend1.us_backend.repository.AgentRepository;

@Service
public class AgentService {

    @Autowired
    private AgentRepository agentRepository;

    public List<AgentDetails> getAllAgents() {
        List<Agent> agents = agentRepository.findAll();
        List<AgentDetails> agentDetailsList = new ArrayList<>();
        agents.forEach(item -> agentDetailsList.add(convertAgentToAgentDetails(item)));
        return agentDetailsList;
    }

    private AgentDetails convertAgentToAgentDetails(Agent agent) {
        AgentDetails agentDetails = new AgentDetails();
        agentDetails.setAgent_id(agent.getAgent_id());
        agentDetails.setFirst_name(agent.getFirst_name());
        agentDetails.setLast_name(agent.getLast_name());
        agentDetails.setAadhar_number(agent.getAadhar_number());
        agentDetails.setPhone_number(agent.getPhone_number());
        agentDetails.setHire_date(agent.getHire_date());
        agentDetails.setCreated_at(agent.getCreated_at());
        agentDetails.setUpdated_at(agent.getUpdated_at());
        agentDetails.setPassword(agent.getPassword());
        agentDetails.setProfession(agent.getProfession());

        return agentDetails;
    }

}
