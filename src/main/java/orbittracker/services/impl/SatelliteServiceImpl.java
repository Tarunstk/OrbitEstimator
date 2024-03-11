package orbittracker.services.impl;

import orbittracker.models.Satellite;
import orbittracker.repositories.SatelliteDBLocal;
import orbittracker.services.SatelliteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SatelliteServiceImpl implements SatelliteService {

//   final SatelliteDB db = SatelliteDB.getInstance(); Substituted with actual db impl

    private final SatelliteDBLocal satelliteDBLocal;

    @Autowired
    public SatelliteServiceImpl(SatelliteDBLocal satelliteDBLocal) {
        this.satelliteDBLocal = satelliteDBLocal;
    }

    @Override
    public void addSatellite(Satellite satellite) {
        satelliteDBLocal.addSatellite(satellite);
    }

    @Override
    public List<Satellite> getAllSats() {
        return satelliteDBLocal.getSatellites();
    }

    @Override
    public Satellite getSat(String satellite) {
        return satelliteDBLocal.getSatellite(satellite);
    }

    @Override
    public List<Satellite> getStartingMatches(String partialName) {
        return satelliteDBLocal.getStartingMatches(partialName);
    }

}
