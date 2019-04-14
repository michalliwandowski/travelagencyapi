package com.liwanm.controller;

import com.liwanm.model.CustomerTrip;
import com.liwanm.service.CustomerTripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin("*")
@RestController
public class CustomerTripController {
    @Autowired
    private CustomerTripService customerTripService;

    //Get list of Customers
    @GetMapping(value = "/api/customertrip")
    public ResponseEntity<List<CustomerTrip>> list() {
        List<CustomerTrip> customers = customerTripService.list();
        return ResponseEntity.ok().body(customers);
    }

    //Save the Customer
    @PostMapping(value = "/api/customertrip")
    public ResponseEntity<?> save(@RequestBody CustomerTrip customerTrip) {
        long id = customerTripService.save(customerTrip);
        return ResponseEntity.ok().body("Customer-Trip transaction with id " + id + " created.");
    }

    //Get a single customer
    @GetMapping(value = "/api/customertrip/{id}")
    public ResponseEntity<CustomerTrip> get(@PathVariable("id") long id) {
        CustomerTrip customerTrip = customerTripService.get(id);
        return ResponseEntity.ok().body(customerTrip);
    }

    //Update customer
    @PutMapping(value = "/api/customertrip/{id}")
    public ResponseEntity<?> get(@PathVariable("id") long id, @RequestBody CustomerTrip customerTrip) {
        customerTripService.update(id, customerTrip);
        return ResponseEntity.ok().body("Customer-Trip transaction with id " + id + " updated.");
    }

    //Update customer
    @DeleteMapping(value = "/api/customertrip/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") long id) {
        customerTripService.delete(id);
        return ResponseEntity.ok().body("Customer-Trip transaction with id " + id + " deleted.");
    }
}
