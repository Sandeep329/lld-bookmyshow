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
@Table(name = "auditoriums")
public class Auditorium extends Auditable{

    //attributes
    private String name;
    private boolean hasAirConditioning;
    private boolean supports3D;
    private int numOfExits;
    private int numOfEmergencyExits;

    //relationships
    @ManyToOne
    @Setter @Getter
    private Cinema cinema;

    @OneToMany(mappedBy = "auditorium")
    @Setter @Getter
    private List<AudiSeat> seats = new ArrayList<>();

    @OneToMany(mappedBy = "auditorium")
    @Getter @Setter
    private List<MovieShow> shows = new ArrayList<>();
}
