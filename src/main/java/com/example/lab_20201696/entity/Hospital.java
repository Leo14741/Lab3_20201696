package com.example.lab_20201696.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "hospital")
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int hospitalId;
    @Column(name="nombre")
    private String nombreH;
    @Column(name="direccion")
    private int direccionH;
    @Column(name="telefono")
    private String telefonoH;
}
