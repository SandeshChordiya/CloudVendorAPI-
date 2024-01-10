package com.example.CloudVendorAPI.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.CloudVendorAPI.Model.CloudVendor;
import com.example.CloudVendorAPI.Repository.CloudVendorRepository;

@Service
public class CloudVendorService {
    CloudVendorRepository cloudVendorRepository;

    public CloudVendorService(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    public String createCloudVendor(CloudVendor cloudVendor){
        cloudVendorRepository.save(cloudVendor);
        return "Vendor has been Successfully Added";
    }
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Vendor has been Successfully Updated";
    }
    public String deleteCloudVendor(String vendorId) {
        cloudVendorRepository.deleteById(vendorId);
        return "Vendor has been Successfully Deleted";
    }
    public CloudVendor getCloudVendor(String vendorId) {
        return cloudVendorRepository.findById(vendorId).get();
    }
    public List<CloudVendor> getAllCloudVendor() {
        return cloudVendorRepository.findAll();
    }
    
} 