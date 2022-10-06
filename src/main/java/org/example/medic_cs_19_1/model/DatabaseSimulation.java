package org.example.medic_cs_19_1.model;

import java.util.ArrayList;
import java.util.List;

public class DatabaseSimulation {
    List<Patient> patients = new ArrayList<>();
    public DatabaseSimulation() {
        patients.add(new Patient(1,"Пупкин 1", "457534","Нігояна", null));
        patients.add(new Patient(2,"Петров", "123123","Яворницького", null));
        patients.add(new Patient(3,"Шевченко", "123","Покровьский", null));
        patients.add(new Patient(4,"Іванов", "123","Нігояна", null));
    }

    public List<Patient> findAll() {
        return patients;
    }

    public Patient findById(int id) {
        for(Patient p : patients)
            if(id == p.getId())
                return p;
        return null;
    }

    public Patient findByName(String name) {
        for(Patient p : patients)
            if(name == p.getName())
                return p;
        return null;
    }
}
