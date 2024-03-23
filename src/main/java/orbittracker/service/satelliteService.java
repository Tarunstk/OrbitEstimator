package com.example.src.main.java.orbittracker.service;

import com.example.src.main.java.orbittracker.repository.satelliteDB;
import com.example.src.main.java.orbittracker.model.satellite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class satelliteService {
    //List<satellite> sats = new ArrayList<>();
    @Autowired
    satelliteDB db;
    //@Autowired
   // julianDateService jd;
    public void addSatellite(satellite s){
        //sats.add(s);
        db.save(s);
    }
    public List<satellite> getAllSats() {
        //jd.getJD();
        return db.findAll();
        //return sats;
    }
    /*public satellite getSat(String s){
        satellite sat = new satellite();
        for(satellite slist : sats){
            if(slist.getName().equals(s)){
                sat = slist;
            }
        }return sat;
    }

     */


    //public
}
