package com.example.lab_20201696.repository;

import com.example.lab_20201696.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
    @Query(nativeQuery = true,value = "select * from doctor where do = ?1")
    List<Doctor> buscarPorNombre(String nombre);


}
