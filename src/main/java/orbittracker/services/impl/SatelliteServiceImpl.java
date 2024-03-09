package orbittracker.services.impl;

import orbittracker.models.Satellite;
import orbittracker.repositories.SatelliteDB;
import orbittracker.services.SatelliteService;

import java.util.ArrayList;
import java.util.List;

public class SatelliteServiceImpl implements SatelliteService {

    List<Satellite> sats = new ArrayList<>();
    SatelliteDB db = SatelliteDB.getInstance();

    @Override
    public void addSatellite(Satellite s) {
        sats.add(s); //ideally to be fetched from db
        db.save(s);
    }

    @Override
    public List<Satellite> getAllSats() {
        //ideally to be fetched from db
        return sats;
    }

    @Override
    public Satellite getSat(String s) {
        //ideally to be fetched from db

        Satellite sat = new Satellite();
        for (Satellite slist : sats) {
            if (slist.getName().equals(s)) {
                sat = slist;
            }
        }
        return sat;
    }

}
