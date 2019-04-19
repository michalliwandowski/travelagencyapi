package com.liwanm.service;

import com.liwanm.model.Customer;

import java.util.List;

public interface CustomerService {
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
