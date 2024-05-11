package orbittracker.service;

import orbittracker.repository.satelliteDB;
import orbittracker.model.satellite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

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

    public Optional<satellite> getSat(String s){
        return db.findById(s);
    }


    public Map<String, Map<String, Double>> getPosition(String sat){
        System.out.println("entered map mode");
        Map<String, Map<String, Double>> m = new HashMap<>();
        Map<String, Double> pos = new HashMap<>();
        Optional<satellite> s = db.findById(sat.strip());
        System.out.println(s.isPresent());//checking if sat is being returned properly
        //Need to strip the input properly cause when input comes in JSON format with spaces the satellite is not found.
        //Also could change structure of the hashmap to maybe accept more values/different values
        //Check this part properly

        pos.put("Longitude", s.get().getInc());
        pos.put("Latitude", s.get().getV0()); //testing with hardcoded values to check
        m.put(sat, pos);
        return m;
    }

}
