package com.example.src.main.java.orbittracker;

import java.util.ArrayList;
import java.util.List;

public class satelliteService {
    List<satellite> sats = new ArrayList<>();
    satelliteDB db = new satelliteDB();
    public void addSatellite(satellite s){
        sats.add(s);
        db.save(s);
    }
    public List<satellite> getAllSats(){
        return sats;
    }
    public satellite getSat(String s){
        satellite sat = new satellite();
        for(satellite slist : sats){
            if(slist.getName().equals(s)){
                sat = slist;
            }
        }return sat;
    }


    //public
}
