package com.liwanm.dao;

import com.liwanm.model.Trip;
import java.util.List;

public interface TripDAO {
    //Save the record
    long save(Trip trip);

    //Get a single record
    Trip get(long id);

    //Get all the records
    List<Trip> list();

    //Update the record
    void update(long id, Trip trip);

    //Delete a record
    void delete(long id);
}
