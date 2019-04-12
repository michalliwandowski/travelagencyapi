package com.liwanm.controller;

import com.liwanm.model.Customer;
import com.liwanm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    //Get list of Customers
    @GetMapping(value = "/api/customer")
    public ResponseEntity<List<Customer>> list() {
        List<Customer>customers = customerService.list();
        return ResponseEntity.ok().body(customers);
    }

    //Save the Customer
    @PostMapping(value = "/api/customer")
    public ResponseEntity<?> save(@RequestBody Customer customer) {
        long id = customerService.save(customer);
        return ResponseEntity.ok().body("Customer with id "+id+" created.");
    }

    //Get a single customer
    @GetMapping(value = "/api/customer/{id}")
    public ResponseEntity<Customer> get(@PathVariable("id") long id) {
        Customer customer = customerService.get(id);
        return ResponseEntity.ok().body(customer);
    }

    //Update customer
    @PutMapping(value = "/api/customer/{id}")
    public ResponseEntity<?> get(@PathVariable("id") long id, @RequestBody Customer customer) {
        customerService.update(id, customer);
        return ResponseEntity.ok().body("Customer with id "+id+" updated.");
    }

    //Update customer
    @DeleteMapping(value = "/api/customer/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") long id) {
        customerService.delete(id);
        return ResponseEntity.ok().body("Customer with id "+id+" deleted.");
    }
}
