package orbittracker.services;

import orbittracker.models.Satellite;

import java.util.List;

// Add @Service annotation when enabling SpringApplication
public interface SatelliteService {

    void addSatellite(Satellite s);

    List<Satellite> getAllSats();

    Satellite getSat(String s);
}
