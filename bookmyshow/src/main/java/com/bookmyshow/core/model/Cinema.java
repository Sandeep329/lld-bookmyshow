package com.bookmyshow.core.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cinema")
public class Cinema extends  Auditable{

    //attributes
    @Getter @Setter
    private boolean hasParking = true;
    @Getter @Setter @NotNull
    private String address;

    @Getter @Setter @NotNull
    private String name;

    //relationships
    @ManyToOne
    @Getter @Setter
    private City city;

    @OneToMany(mappedBy = "cinema")
    @Setter @Getter
    private List<Auditorium> halls = new ArrayList<>();

}
