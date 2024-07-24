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

    public List<AgentDetails> getAllAgents() { // service function that interact with db via jpaObject
        List<Agent> agents = AgentRepository.findAll(); // list/arr data store all rows
        List<AgentDetails> AgentDetailsList = new ArrayList<>();
        agents.forEach(item -> AgentDetailsList.add(convertAgentToAgentDetails(item)));
        return agentDetailsList;
    }

    private AgentDetails convertAgentToAgentDetails(Agent agent) {
        AgentDetails agentDetails = new AgentDetails();
        agentDetails.setFirst_name(agent.getFirst_name());
        agentDetails.setAgent_id(agent.getAgent_id());
        agentDetails.setLast_name(agent.getLast_name());
        agentDetails.setEmail(agent.getEmail());
        agentDetails.setPhone_number(agent.getPhone_number());
        agentDetails.setAddress(agent.getAddress());
        agentDetails.setCity(agent.getCity());
        agentDetails.setState(agent.getState());
        agentDetails.setUpdated_at(agent.getUpdated_at());
        agentDetails.setCreated_at(agent.getCreated_at());
        agentDetails.setPassword(agent.getPassword());
        return agentDetails;

}
