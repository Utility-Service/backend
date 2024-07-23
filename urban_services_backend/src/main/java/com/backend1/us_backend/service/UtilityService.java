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
    private UtilityRepository utilityRepository; // making an object from built-in jpa reposiotry

    // service function/method for without parameter
    public List<UtilityDetails> getAllUtilities() { // service function that interact with db via jpaObject

        List<Utility> utilities = utilityRepository.findAll(); // list/arr data store all rows
        List<UtilityDetails> utilityDetailsList = new ArrayList<>();

        utilities.forEach(item -> utilityDetailsList.add(convertUtilityToUtilityDetails(item)));
        return utilityDetailsList;
    }

    // service function/method for custom parameter
    public List<UtilityDetails> getUtilitiesByType(String typeofservice) {
        List<Utility> utilities = utilityRepository.findByTypeOfService(typeofservice); // list/arr data store all rows
        List<UtilityDetails> utilityDetailsList = new ArrayList<>();

        utilities.forEach(item -> utilityDetailsList.add(convertUtilityToUtilityDetails(item)));
        return utilityDetailsList;
    }

    // additional custom function
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
