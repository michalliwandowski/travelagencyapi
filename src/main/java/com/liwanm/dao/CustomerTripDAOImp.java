package com.liwanm.dao;

import com.liwanm.model.CustomerTrip;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class CustomerTripDAOImp implements CustomerTripDAO {


    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public long save(CustomerTrip customerTrip) {
        sessionFactory.getCurrentSession().save(customerTrip);
        return customerTrip.getId();
    }

    @Override
    public CustomerTrip get(long id) { return sessionFactory.getCurrentSession().get(CustomerTrip.class, id); }

    @Override
    public List<CustomerTrip> list() {
        List<CustomerTrip> list = sessionFactory.getCurrentSession().createQuery("from CustomerTrip").list();
        return list;
    }

    @Override
    public void update(long id, CustomerTrip customerTrip) {
        Session session=sessionFactory.getCurrentSession();
        CustomerTrip oldCustomerTrip = session.byId(CustomerTrip.class).load(id);
        oldCustomerTrip.setPaid(customerTrip.isPaid());
        session.flush();
    }

    @Override
    public void delete(long id) {
        Session session = sessionFactory.getCurrentSession();
        CustomerTrip customerTrip = session.byId(CustomerTrip.class).load(id);
        session.delete(customerTrip);
    }
}
