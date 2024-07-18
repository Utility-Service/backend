package com.backend1.api_calls.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend1.api_calls.entity.Allservice;
import com.backend1.api_calls.models.AllserviceDetails;
import com.backend1.api_calls.repository.AllservicesRepository;

@Service
public class AllserviceService {

    @Autowired
    private AllservicesRepository AllservicesRepository;
    
    public List<AllserviceDetails> getAllServices() {

        List<Allservice> allServices = AllservicesRepository.findAll();
        List<AllserviceDetails> allservicesDetailsList = new ArrayList<>();

        allServices.forEach(item -> allservicesDetailsList.add(convertAllServicesToAllServicesDetails(item)));
        return allservicesDetailsList;
    }
    private AllserviceDetails convertAllServicesToAllServicesDetails(Allservice allservice) {

        AllserviceDetails allservicesDetails = new AllserviceDetails();
        allservicesDetails.setId(allservice.getId());
        allservicesDetails.setName(allservice.getName());
        allservicesDetails.setDesc(allservice.getDesc());
        allservicesDetails.setDisplayName(allservice.getDisplayName());
        allservicesDetails.setPicture(allservice.getPicture());
        return allservicesDetails;
    }
}
