package orbittracker.services.impl;

import orbittracker.models.JulianDate;
import orbittracker.services.JulianDateService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JulianDateServiceImpl implements JulianDateService {
    private static final List<JulianDate> julianDateList = new ArrayList<>();

    @Override
    public Double getJD(JulianDate date) {
        if (date == null) {
            date = julianDateList.getFirst();
        }

        double A, B, JD;

        double y = date.getYear();
        double m = date.getMonth();
        double d = date.getDay();

        A = y / 100;
        B = 2 - A + (A / 4);
        JD = (365.25 * (y + 4716)) + (30.6001 * (m + 1)) + (d + B) - 1524.5;

        return JD;
    }

    @Override
    public void addJD(JulianDate date) {
        JulianDate julianDate = new JulianDate(1L, 2024, 2, 23);
        julianDateList.add(julianDate);
    }

}
