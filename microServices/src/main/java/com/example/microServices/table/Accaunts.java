package com.example.microServices.table;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Accaunts")

public class Accaunts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String lastName;

    private String firstName;

    @Column(unique = true)
    private String username;

    private String password;

    private String[] roles;

    public Accaunts(String lastName, String firstName, String username, String password, String[] roles) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.username = username;
        this.password = password;
        this.roles = new String[]{"admin","manager","doctor","user"};
        this.roles = roles;
    }

    public Accaunts() {
        roles = new String[]{"admin","manager","doctor","user"};
    }

}
