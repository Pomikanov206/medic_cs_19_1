package org.example.medic_cs_19_1.controller;

import org.example.medic_cs_19_1.model.DatabaseSimulation;
import org.example.medic_cs_19_1.model.Disease;
import org.example.medic_cs_19_1.model.Patient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class DoctorController {
    DatabaseSimulation databaseSimulation = new DatabaseSimulation();

    @GetMapping("/patient")
    public String showPatient(@RequestParam(name="id", required=false) int id, Model model) {
        Patient p = databaseSimulation.findById(id);
        model.addAttribute("patient", p);
        return "patient";
    }

    @GetMapping("/patients")
    public String showAllPatients(Model model) {
        model.addAttribute("patients", databaseSimulation.findAll());
        return "patients";
    }

    @GetMapping("/p/{id}/add-disease")
    public String addDisease(@PathVariable String id, Model model) {
        model.addAttribute("disease", new Disease());
        model.addAttribute("patientId", id);
        return "add-disease";
    }

    @PostMapping("/p/{id}/add-disease")
    public String addDisease(@PathVariable String id, Disease disease, Model model){
        databaseSimulation.saveDisease(Integer.parseInt(id),disease);
        return "patients";
    }
}
