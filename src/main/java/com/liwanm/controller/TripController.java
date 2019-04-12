package com.liwanm.controller;

import com.liwanm.model.Trip;
import com.liwanm.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class TripController {

    @Autowired
    private TripService tripService;

    //Get list of Customers
    @GetMapping(value = "/api/trip")
    public ResponseEntity<List<Trip>> list() {
        List<Trip>customers = tripService.list();
        return ResponseEntity.ok().body(customers);
    }

    //Save the Customer
    @PostMapping(value = "/api/trip")
    public ResponseEntity<?> save(@RequestBody Trip trip) {
        long id = tripService.save(trip);
        return ResponseEntity.ok().body("Trip with id "+id+" created.");
    }

    //Get a single customer
    @GetMapping(value = "/api/trip/{id}")
    public ResponseEntity<Trip> get(@PathVariable("id") long id) {
        Trip trip = tripService.get(id);
        return ResponseEntity.ok().body(trip);
    }

    //Update customer
    @PutMapping(value = "/api/trip/{id}")
    public ResponseEntity<?> get(@PathVariable("id") long id, @RequestBody Trip trip) {
        tripService.update(id, trip);
        return ResponseEntity.ok().body("Trip with id "+id+" updated.");
    }

    //Update customer
    @DeleteMapping(value = "/api/trip/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") long id) {
        tripService.delete(id);
        return ResponseEntity.ok().body("Trip with id "+id+" deleted.");
    }
}
