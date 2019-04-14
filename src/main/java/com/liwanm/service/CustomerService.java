package com.liwanm.service;

import com.liwanm.model.Customer;
<<<<<<< HEAD
import com.liwanm.model.Trip;
=======
>>>>>>> 9d7b7cdddf400b2496ea8aedbf7be022c170e95b

import java.util.List;

public interface CustomerService {
<<<<<<< HEAD

=======
>>>>>>> 9d7b7cdddf400b2496ea8aedbf7be022c170e95b
    //Save the record
    long save(Customer customer);

    //Get a single record
    Customer get(long id);

    //Get all the records
    List<Customer> list();

    //Update the record
    void update(long id, Customer customer);

    //Delete a record
    void delete(long id);
<<<<<<< HEAD

    //Get all the records
    List<Trip> getTrips();
=======
>>>>>>> 9d7b7cdddf400b2496ea8aedbf7be022c170e95b
}
