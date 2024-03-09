package orbittracker.services;

import orbittracker.models.JulianDate;

// Add @Service annotation when enabling SpringApplication
public interface JulianDateService {

    double getJD(JulianDate date);

}
