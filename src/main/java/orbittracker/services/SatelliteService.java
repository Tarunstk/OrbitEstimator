package orbittracker.services;

import orbittracker.models.Satellite;

import java.util.List;

public interface SatelliteService {

    void addSatellite(Satellite satellite);

    List<Satellite> getAllSats();

    Satellite getSat(String satellite);

    List<Satellite> getStartingMatches(String name);
}
