package orbittracker.services.impl;

import orbittracker.models.JulianDate;
import orbittracker.services.JulianDateService;

public class JulianDateServiceImpl implements JulianDateService {

    @Override
    public double getJD(JulianDate date) {
        double A, B, JD;

        double y = date.getYear();
        double m = date.getMonth();
        double d = date.getDay();

        A = y / 100;
        B = 2 - A + (A / 4);
        JD = (365.25 * (y + 4716)) + (30.6001 * (m + 1)) + (d + B) - 1524.5;

        return JD;
    }

}
