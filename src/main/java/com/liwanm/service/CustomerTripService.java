package com.liwanm.service;

import com.liwanm.model.CustomerTrip;

import java.util.List;

public interface CustomerTripService {

    //Save the record
    long save(CustomerTrip customerTrip);

    //Get a single record
    CustomerTrip get(long id);

    //Get all the records
    List<CustomerTrip> list();

    //Update the record
    void update(long id, CustomerTrip customerTrip);

    //Delete a record
    void delete(long id);
}
