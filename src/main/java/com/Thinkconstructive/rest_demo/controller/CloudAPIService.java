package com.Thinkconstructive.rest_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Thinkconstructive.rest_demo.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")

public class CloudAPIService {
    CloudVendor cloudVendor;
     @GetMapping("{vendorId}")
     public CloudVendor getCloudVendorDetails(String vendorId)
    {
           return cloudVendor;
    }       
           @PostMapping
           public String CreateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
            this.cloudVendor=cloudVendor;
            return "cloud vendor created succesfully";
           }

           @PutMapping
           public String UpdateVendorDetails(@RequestBody CloudVendor cloudVendor){
            this.cloudVendor=cloudVendor;
            return "cloud vendor created succesfully";
           }
    

}
