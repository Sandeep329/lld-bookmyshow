package com.bookmyshow.core.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="bookings")
public class Booking extends Auditable{

    @Getter @Setter
    private double totalPrice = 0;
    //relationships
    @ManyToOne
    @Getter @Setter
    private MovieShow show;

    @OneToMany
    @Setter @Getter
    private List<ShowSeats> seats = new ArrayList<>();

    @OneToMany
    @Setter @Getter
    private List<Transactions> transactions = new ArrayList<>();

    @ManyToOne
    @Setter @Getter
    private Coupon coupon;

    @ManyToOne
    @Getter @Setter
    private User user;
}
