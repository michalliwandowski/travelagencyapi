package com.liwanm.service;

import com.liwanm.dao.CustomerTripDAO;
import com.liwanm.model.CustomerTrip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CustomerTripServiceImp implements CustomerTripService {

    @Autowired
    CustomerTripDAO customerTripDAO;

    @Override
    @Transactional
    public long save(CustomerTrip customerTrip) {
        return customerTripDAO.save(customerTrip);
    }

    @Override
    @Transactional
    public CustomerTrip get(long id) {
        return customerTripDAO.get(id);
    }

    @Override
    @Transactional
    public List<CustomerTrip> list() {
        return customerTripDAO.list();
    }

    @Override
    @Transactional
    public void update(long id, CustomerTrip customerTrip) {
        customerTripDAO.update(id, customerTrip);
    }

    @Override
    @Transactional
    public void delete(long id) {
        customerTripDAO.delete(id);
    }
}
