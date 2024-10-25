package com.example.microServices.table;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "History")
public class History {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String date;
    private int pacientId;
    private int hospitalId;
    private int doctorId;
    private String room;
    private String data;

    public History(int id, String date, int pacientId, int hospitalId, int doctorId, String room, String data) {
        this.id = id;
        this.date = date;
        this.pacientId = pacientId;
        this.hospitalId = hospitalId;
        this.doctorId = doctorId;
        this.room = room;
        this.data = data;
    }

    public History() {
    }

    @Override
    public String toString() {
        return "History{" +
                "id=" + id +
                ", date=" + date +
                ", pacientId=" + pacientId +
                ", hospitalId=" + hospitalId +
                ", doctorId=" + doctorId +
                ", room='" + room + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
