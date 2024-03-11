package orbittracker;

import orbittracker.models.JulianDate;
import orbittracker.models.Satellite;
import orbittracker.services.JulianDateService;
import orbittracker.services.SatelliteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AddingDataOnStartup implements ApplicationRunner {

    private final SatelliteService satelliteService;
    private final JulianDateService julianDateService;

    @Autowired
    public AddingDataOnStartup(SatelliteService satelliteService, JulianDateService julianDateService) {
        this.satelliteService = satelliteService;
        this.julianDateService = julianDateService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // Initialize data and store it in the repository
        satelliteService.addSatellite(new Satellite("IRS P6", 98.5525, 276.0870, 0.00563,
                303.7850, 55.928, 14.341));
        satelliteService.addSatellite(new Satellite("IRS P5", 97.873, 257.9920, 0.001044,
                51.2651, 308.8671, 14.787));
        satelliteService.addSatellite(new Satellite("CARTOSAT 2AT", 97.82, 218.5088, 0.002763,
                45.0401, 315.1040, 14.8374));
        satelliteService.addSatellite(new Satellite("CARTOSAT 2BT", 97.82, 218.5088, 0.002763,
                45.0401, 315.1040, 14.8374));

        julianDateService.addJD(new JulianDate(1L, 2024, 2, 23));
    }
}
