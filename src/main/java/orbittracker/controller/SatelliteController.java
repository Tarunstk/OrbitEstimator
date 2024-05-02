package com.example.src.main.java.orbittracker.controller;

import com.example.src.main.java.orbittracker.model.satellite;
import com.example.src.main.java.orbittracker.service.satelliteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/home")
public class SatelliteController {
    @Autowired
    private satelliteService ss;

    //get all satellites
    @GetMapping("/satellites")
    public List<satellite> getAllSatellites(){
        return ss.getAllSats();
    }
    @PostMapping("/addSatellite")
    public satellite addSatellite(@RequestBody satellite sat){
        ss.addSatellite(sat);
        System.out.println("Added");
        return sat;
    }
    @GetMapping("/getSatellite")
    public Optional<satellite> getSatellite(@RequestBody String s){
       return ss.getSat(s);
    }

    @GetMapping("/getPosition")
    public Map<String, Map<String, Double>> getPosition(@RequestBody String s){
        System.out.println("fetching...");
        return ss.getPosition(s);
    }


}
