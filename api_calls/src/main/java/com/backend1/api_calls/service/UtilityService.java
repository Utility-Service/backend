package com.backend1.api_calls.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend1.api_calls.entity.Allservice;
import com.backend1.api_calls.models.UtilityDetails;
import com.backend1.api_calls.repository.AllservicesRepository;

@Service
public class UtilityService{

    @Autowired
    private AllservicesRepository AllservicesRepository;
    
    public List<UtilityDetails> getUtilities() {

        List<Allservice> allServices = AllservicesRepository.findAll();
        List<UtilityDetails> allservicesDetailsList = new ArrayList<>();

        allServices.forEach(item -> allservicesDetailsList.add(convertAllServicesToAllServicesDetails(item)));
        return allservicesDetailsList;
    }

    
    private UtilityDetails convertAllServicesToAllServicesDetails(Allservice allservice) {

        UtilityDetails allservicesDetails = new UtilityDetails();
        allservicesDetails.setId(allservice.getId());
        allservicesDetails.setName(allservice.getName());
        allservicesDetails.setDesc(allservice.getDesc());
        allservicesDetails.setDisplayName(allservice.getDisplayName());
        allservicesDetails.setPicture(allservice.getPicture());
        return allservicesDetails;
    }
}
