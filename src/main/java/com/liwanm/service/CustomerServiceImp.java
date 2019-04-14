package com.liwanm.service;

import com.liwanm.dao.CustomerDAO;
import com.liwanm.model.Customer;
<<<<<<< HEAD
import com.liwanm.model.Trip;
=======
>>>>>>> 9d7b7cdddf400b2496ea8aedbf7be022c170e95b
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CustomerServiceImp implements CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

    @Override
    @Transactional
    public long save(Customer customer) {
        return customerDAO.save(customer);
    }

    @Override
    @Transactional
    public Customer get(long id) {
        return customerDAO.get(id);
    }

    @Override
    @Transactional
    public List<Customer> list() {
        return customerDAO.list();
    }

    @Override
    @Transactional
    public void update(long id, Customer customer) {
        customerDAO.update(id, customer);
    }

    @Override
    @Transactional
    public void delete(long id) {
        customerDAO.delete(id);
    }
<<<<<<< HEAD

    @Override
    public List<Trip> getTrips() {
        return null;
    }
=======
>>>>>>> 9d7b7cdddf400b2496ea8aedbf7be022c170e95b
}
