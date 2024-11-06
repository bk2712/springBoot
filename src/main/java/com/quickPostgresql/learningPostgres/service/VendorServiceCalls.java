package com.quickPostgresql.learningPostgres.service;

import com.quickPostgresql.learningPostgres.model.VendorProperties;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VendorServiceCalls {
    public String createVendors(VendorProperties vendorProperties);
    public VendorProperties getVendorDetails(long id);
    public List<VendorProperties> getAllVendorDetails();
}
