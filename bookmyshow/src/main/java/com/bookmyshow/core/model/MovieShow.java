package com.bookmyshow.core.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="movieshows")
public class MovieShow extends  Auditable {
    //attributes

    @Getter @Setter
    private Date timingFrom;
    @Getter @Setter
    private Date timingTo;


    //relationships
    @OneToMany(mappedBy = "show")
    private List<Booking> bookings = new ArrayList<>();

    @ManyToOne
    @Getter @Setter
    private  Auditorium auditorium;

    @ManyToOne
    @Setter @Getter
    private Movie movie;
}
