package com.liwanm.dao;

import com.liwanm.model.Customer;
import com.liwanm.model.Trip;

import java.util.List;

public interface CustomerDAO {

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
}
