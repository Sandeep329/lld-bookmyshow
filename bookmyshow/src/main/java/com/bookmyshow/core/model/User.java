package com.bookmyshow.core.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User extends Auditable{
    @Email
    @NotBlank
    @Column(unique = true)
    @Getter @Setter
    private String email;
    private String hashedPassword;

    @ManyToMany
    private List<Role> roles = new ArrayList<>();

    @OneToOne
    private Profile profile;
}
