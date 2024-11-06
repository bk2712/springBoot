package com.quickPostgresql.learningPostgres.repositories;

import com.quickPostgresql.learningPostgres.model.VendorProperties;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepo extends JpaRepository<VendorProperties, Long> {

}
