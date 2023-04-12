package com.example.lab_20201696.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "doctor")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int doctorId;
    @Column(name="nombre")
    private String nombreDoc;
    @Column(name="especialidad")
    private int edadDoc;


}
