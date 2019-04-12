package com.liwanm.dao;

import com.liwanm.model.Trip;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TripDAOImp implements TripDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public long save(Trip trip) {
        sessionFactory.getCurrentSession().save(trip);
        return trip.getId();
    }

    @Override
    public Trip get(long id) {
        return sessionFactory.getCurrentSession().get(Trip.class, id);
    }


    public List<Trip> list() {
        List<Trip> list = sessionFactory.getCurrentSession().createQuery("from Trip").list();
        return list;
    }

    @Override
    public void update(long id, Trip trip) {
        Session session = sessionFactory.getCurrentSession();
        Trip oldTrip = session.byId(Trip.class).load(id);
        oldTrip.setOrigin(trip.getOrigin());
        oldTrip.setDestination(trip.getDestination());
        oldTrip.setFromDate(trip.getFromDate());
        oldTrip.setToDate(trip.getToDate());
        oldTrip.setPrice(trip.getPrice());
        oldTrip.setTravelType(trip.getTravelType());
        session.flush();
    }

    @Override
    public void delete(long id) {
        Session session = sessionFactory.getCurrentSession();
        Trip trip = session.byId(Trip.class).load(id);
        session.delete(trip);
    }
}

