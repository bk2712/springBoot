package com.quickPostgresql.learningPostgres.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.quickPostgresql.learningPostgres.model.VendorProperties;
import com.quickPostgresql.learningPostgres.service.VendorServiceCalls;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
@RequestMapping("/cloudVendor")
public class VendorServiceApi {

    VendorServiceCalls vendorServiceCalls;

    public VendorServiceApi(VendorServiceCalls vendorServiceCalls) {
        this.vendorServiceCalls = vendorServiceCalls;
    }

    @GetMapping("{id}")
    public VendorProperties getApi(@PathVariable("id") long id){
        return vendorServiceCalls.getVendorDetails(id);
    }

    @PostMapping
    public String postDetails(@RequestBody VendorProperties newDetails){
        System.out.println("Address Details: " + newDetails.getAddressDetails());
        vendorServiceCalls.createVendors(newDetails);
        return "Details Created Successfully!";


    }

}
