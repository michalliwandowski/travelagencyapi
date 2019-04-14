package com.liwanm.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "CustomerTrip")
@Table(name = "CUSTOMER_TRIP")
public class CustomerTrip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CUSTOMER_ID", nullable = false)
    private Long idCustomer;

    @Column(name = "TRIP_ID", nullable = false)
    private Long idTrip;

    @Column(name = "IS_PAID", nullable = false)
    private boolean isPaid;

    @CreationTimestamp()
    @Column(name = "TRANSACTION_DATE", nullable = false)
    private Date date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Long idCustomer) {
        this.idCustomer = idCustomer;
    }

    public Long getIdTrip() {
        return idTrip;
    }

    public void setIdTrip(Long idTrip) {
        this.idTrip = idTrip;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return "CustomerTripService{" +
=======
        return "CustomerTrip{" +
>>>>>>> 9d7b7cdddf400b2496ea8aedbf7be022c170e95b
                "id=" + id +
                ", idCustomer=" + idCustomer +
                ", idTrip=" + idTrip +
                ", isPaid=" + isPaid +
                ", date=" + date +
                '}';
    }
}
