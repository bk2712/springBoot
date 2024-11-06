package com.quickPostgresql.learningPostgres.service.implementation;


import com.quickPostgresql.learningPostgres.model.VendorProperties;
import com.quickPostgresql.learningPostgres.repositories.VendorRepo;
import com.quickPostgresql.learningPostgres.service.VendorServiceCalls;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorServiceCallsImpl implements VendorServiceCalls{

    VendorRepo vendorRepo;
    public VendorServiceCallsImpl(VendorRepo vendorRepo) {
        this.vendorRepo = vendorRepo;
    }
    @Override
    public String createVendors(VendorProperties vendorProperties) {
        vendorRepo.save(vendorProperties);
        return "Saved Successfully";
    }

    @Override
    public VendorProperties getVendorDetails(long id) {
        return vendorRepo.getById(id);
    }

    @Override
    public List<VendorProperties> getAllVendorDetails() {
        return vendorRepo.findAll();
    }
}
