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

<<<<<<< HEAD
    //Get list of Trips
=======
    //Get list of Customers
>>>>>>> 9d7b7cdddf400b2496ea8aedbf7be022c170e95b
    @GetMapping(value = "/api/trip")
    public ResponseEntity<List<Trip>> list() {
        List<Trip>customers = tripService.list();
        return ResponseEntity.ok().body(customers);
    }

<<<<<<< HEAD
    //Save the Trip
=======
    //Save the Customer
>>>>>>> 9d7b7cdddf400b2496ea8aedbf7be022c170e95b
    @PostMapping(value = "/api/trip")
    public ResponseEntity<?> save(@RequestBody Trip trip) {
        long id = tripService.save(trip);
        return ResponseEntity.ok().body("Trip with id "+id+" created.");
    }

<<<<<<< HEAD
    //Get a single Trip
=======
    //Get a single customer
>>>>>>> 9d7b7cdddf400b2496ea8aedbf7be022c170e95b
    @GetMapping(value = "/api/trip/{id}")
    public ResponseEntity<Trip> get(@PathVariable("id") long id) {
        Trip trip = tripService.get(id);
        return ResponseEntity.ok().body(trip);
    }

<<<<<<< HEAD
    //Update Trip
=======
    //Update customer
>>>>>>> 9d7b7cdddf400b2496ea8aedbf7be022c170e95b
    @PutMapping(value = "/api/trip/{id}")
    public ResponseEntity<?> get(@PathVariable("id") long id, @RequestBody Trip trip) {
        tripService.update(id, trip);
        return ResponseEntity.ok().body("Trip with id "+id+" updated.");
    }

<<<<<<< HEAD
    //Delete Trip
=======
    //Update customer
>>>>>>> 9d7b7cdddf400b2496ea8aedbf7be022c170e95b
    @DeleteMapping(value = "/api/trip/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") long id) {
        tripService.delete(id);
        return ResponseEntity.ok().body("Trip with id "+id+" deleted.");
    }
}
