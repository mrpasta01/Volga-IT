package com.example.microServices.table;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Getter
@Setter
@Entity
@Table(name = "Hospital")
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Column(unique = true)
    private String address;

    private String contactPhone;

    private String[] rooms;

    public Hospital() {
    }

    public Hospital(int id, String name, String address, String contactPhone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contactPhone = contactPhone;
        this.rooms = new String[]{};
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contactPhone='" + contactPhone + '\'' +
                ", rooms=" + Arrays.toString(rooms) +
                '}';
    }
}



