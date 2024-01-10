package com.example.CloudVendorAPI.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CloudVendorAPI.Model.CloudVendor;
import com.example.CloudVendorAPI.Service.CloudVendorService;


@RestController
@RequestMapping("cloudvendor")
public class CloudVendorController {
    CloudVendorService cloudVendorService;    

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @GetMapping(path = "/hellovendor")
    public String helloVendor() {
        return "Hello Vendor";
    }
    // Get a Single Cloud Vendor
    @GetMapping(path = "/getvendor/{vendorId}")
    public CloudVendor getCloudVendor(@PathVariable String vendorId) {
        if(vendorId == cloudVendorService.getCloudVendor(vendorId).getVendorId()) {
            return cloudVendorService.getCloudVendor(vendorId);
        } else {
            return null;
        }
    }

    // Get all Cloud Vendor
    @GetMapping(path = "/getallvendors")
    public List<CloudVendor> getAllVendors() {
        return cloudVendorService.getAllCloudVendor();
    }

    // Create a Vendor
    @PostMapping(path = "/createvendor")
    public String createCloudVendor(@RequestBody CloudVendor cloudVendor) {
        cloudVendorService.createCloudVendor(cloudVendor);
        return "Your Vendor has been Created!";
    }

    // Update a Vendor
    @PutMapping(path = "/updatevendor")
    public String updateCloudVendor(@RequestBody CloudVendor updatedVendor){
        cloudVendorService.updateCloudVendor(updatedVendor);
        return "Your Vendor has been Updated!";
    }

    // Delete a Vendor
    @DeleteMapping(path = "/deletevendor/{vendorId}")
    public String deleteCloudVendor(@PathVariable String vendorId) {
        cloudVendorService.deleteCloudVendor(vendorId);
        return "Your Vendor has been Deleted!";
    }
}
