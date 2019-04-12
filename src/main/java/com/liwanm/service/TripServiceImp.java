package com.liwanm.service;

import com.liwanm.dao.TripDAO;
import com.liwanm.model.Trip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class TripServiceImp implements TripService {

    @Autowired
    private TripDAO tripDAO;

    @Override
    @Transactional
    public long save(Trip trip) {
        return tripDAO.save(trip);
    }

    @Override
    @Transactional
    public Trip get(long id) {
        return tripDAO.get(id);
    }

    @Override
    @Transactional
    public List<Trip> list() {
        return tripDAO.list();
    }

    @Override
    @Transactional
    public void update(long id, Trip trip) {
        tripDAO.update(id, trip);
    }

    @Override
    @Transactional
    public void delete(long id) {
        tripDAO.delete(id);
    }
}
