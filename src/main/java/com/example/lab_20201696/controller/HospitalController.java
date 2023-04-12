package com.example.lab_20201696.controller;

import com.example.lab_20201696.entity.Doctor;
import com.example.lab_20201696.entity.Hospital;
import com.example.lab_20201696.repository.DoctorRepository;
import com.example.lab_20201696.repository.HospitalRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/hospital")
public class HospitalController {
    final HospitalRepository hospitalRepository;

    public HospitalController(HospitalRepository hospitalRepository) {
        this.hospitalRepository = hospitalRepository;
    }

    @GetMapping(value = {"/list", ""})
    public String listarHospitales(Model model) {
        List<Hospital> lista = hospitalRepository.findAll();
        model.addAttribute("hospitalList", lista);
        return "hospital/list";
    }
}