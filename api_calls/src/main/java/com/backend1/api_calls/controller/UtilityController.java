package com.backend1.api_calls.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend1.api_calls.models.UtilityDetails;
import com.backend1.api_calls.service.UtilityService;


@RestController

public class UtilityController {
   
    @Autowired
   private UtilityService utility;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/Utility")
    public List<UtilityDetails> getUtilities() {
       return utility.getUtilities();
   }
   
}


