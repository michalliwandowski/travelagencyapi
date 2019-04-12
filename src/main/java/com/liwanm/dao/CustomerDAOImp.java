package com.liwanm.dao;

import com.liwanm.model.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDAOImp implements CustomerDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public long save(Customer customer) {
        sessionFactory.getCurrentSession().save(customer);
        return customer.getId();
    }

    @Override
    public Customer get(long id) {
        return sessionFactory.getCurrentSession().get(Customer.class, id);
    }

    @Override
    public List<Customer> list() {
        List<Customer> list = sessionFactory.getCurrentSession().createQuery("from Customer").list();
        return list;
    }

    @Override
    public void update(long id, Customer customer) {
        Session session=sessionFactory.getCurrentSession();
        Customer oldCustomer = session.byId(Customer.class).load(id);
        oldCustomer.setAddress(customer.getAddress());
        oldCustomer.setLastName(customer.getLastName());
        oldCustomer.setName(customer.getName());
        session.flush();
    }

    @Override
    public void delete(long id) {
        Session session = sessionFactory.getCurrentSession();
        Customer customer = session.byId(Customer.class).load(id);
        session.delete(customer);
    }
}
