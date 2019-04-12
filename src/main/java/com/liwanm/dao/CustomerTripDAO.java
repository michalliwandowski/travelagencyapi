package com.liwanm.dao;

import com.liwanm.model.CustomerTrip;

import java.util.List;

public interface CustomerTripDAO {
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
