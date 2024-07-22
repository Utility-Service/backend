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

    public List<Utility> getAllUtilities() { //service function that interact with db via jpaObject

        List<Utility> allServices = utilityRepository.findAll();    //list/arr data store all rows
        return allServices;
    }
}
