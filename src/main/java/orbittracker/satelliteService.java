package com.example.src.main.java.orbittracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;
@Component
public class satelliteService {

    @Autowired
    satelliteDB db;
    @Autowired
    julianDateService jd;
    public void addSatellite(satellite s){
        db.save(s);
    }
    public List<satellite> getAllSats() {
        jd.getJD();
        return db.findAll();
    }
}
