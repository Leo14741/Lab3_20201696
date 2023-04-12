package com.example.lab_20201696.repository;

import com.example.lab_20201696.entity.Doctor;
import com.example.lab_20201696.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface HospitalRepository extends JpaRepository<Hospital, Integer> {
    @Query(nativeQuery = true,value = "select * from hospital where do = ?1")
    List<Hospital> buscarPorNombre(String nombre);


}
