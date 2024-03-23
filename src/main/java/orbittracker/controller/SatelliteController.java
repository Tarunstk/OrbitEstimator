package com.example.src.main.java.orbittracker.controller;

import com.example.src.main.java.orbittracker.model.satellite;
import com.example.src.main.java.orbittracker.service.satelliteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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


}
