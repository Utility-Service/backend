package com.backend1.us_backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend1.us_backend.entity.Utility;
import com.backend1.us_backend.models.UtilityDetails;
import com.backend1.us_backend.repository.UtilityRepository;

@Service
public class UtilityService {

    @Autowired
    private UtilityRepository utilityRepository;    //making an object from built-in jpa reposiotry

    public List<UtilityDetails> getAllUtilities() { //service function that interact with db via jpaObject

        List<Utility> allServices = utilityRepository.findAll();    //list/arr data store all rows
        List<UtilityDetails> utilityDetailsList = new ArrayList<>();

        allServices.forEach(item -> utilityDetailsList.add(convertUtilityToUtilityDetails(item)));
        return utilityDetailsList;
    }

    private UtilityDetails convertUtilityToUtilityDetails(Utility utility) {

        UtilityDetails utilityDetails = new UtilityDetails();
        utilityDetails.setId(utility.getId());
        utilityDetails.setName(utility.getName());
        utilityDetails.setDesc(utility.getDescription());
        utilityDetails.setType_of_service(utility.getTypeOfService());
        utilityDetails.setPictures(utility.getPictures());
        return utilityDetails;
    }
}
