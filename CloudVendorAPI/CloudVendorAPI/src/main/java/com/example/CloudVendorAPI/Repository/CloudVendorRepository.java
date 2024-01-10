package com.example.CloudVendorAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CloudVendorAPI.Model.CloudVendor;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {
    
}
