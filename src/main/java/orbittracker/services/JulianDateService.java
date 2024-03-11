package orbittracker.services;

import orbittracker.models.JulianDate;

public interface JulianDateService {

    Double getJD(JulianDate date);

    void addJD(JulianDate date);
}
