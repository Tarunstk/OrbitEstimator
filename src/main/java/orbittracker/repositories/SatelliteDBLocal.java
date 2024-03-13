package orbittracker.repositories;

import orbittracker.models.Satellite;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SatelliteDBLocal {
    private static final List<Satellite> satellites = new ArrayList<>();

    public List<Satellite> getSatellites() {
        return satellites;
    }

    public void addSatellite(Satellite satellite) {
        satellites.add(satellite);
    }

    public Satellite getSatellite(String satellite) {
        Satellite currentSatellite = new Satellite();
        for (Satellite satellite1 : satellites) {
            if (satellite.equals(satellite1.getName())) {
                currentSatellite = satellite1;
            }
        }
        return currentSatellite;
    }

    public List<Satellite> getStartingMatches(String partialName) {
        List<Satellite> matchingSatellites = new ArrayList<>();
        for (Satellite satellite : satellites) {
            if (satellite.getName().startsWith(partialName)) {
                matchingSatellites.add(satellite);
            }
        }
        return matchingSatellites;
    }

}
