package orbittracker.models;

import org.springframework.stereotype.Component;

// This class gets its data from TLE files after decoding it
@Component
public class Satellite {
    private String name;
    private double in;    // inclination
    private double raan;  // Ascension node (right angle)
    private double e;     // eccentricity
    private double omega; // Argument of Perigee
    private double v0;    // true anomaly = mean anomaly
    private double n0;    // mean motion

    public Satellite() {
    }

    public Satellite(String name, double in, double raan, double e, double omega, double v0, double n0) {
        this.name = name;
        this.in = in;
        this.raan = raan;
        this.e = e;
        this.omega = omega;
        this.v0 = v0;
        this.n0 = n0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getIn() {
        return in;
    }

    public void setIn(double in) {
        this.in = in;
    }

    public double getRaan() {
        return raan;
    }

    public void setRaan(double raan) {
        this.raan = raan;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public double getOmega() {
        return omega;
    }

    public void setOmega(double omega) {
        this.omega = omega;
    }

    public double getV0() {
        return v0;
    }

    public void setV0(double v0) {
        this.v0 = v0;
    }

    public double getN0() {
        return n0;
    }

    public void setN0(double n0) {
        this.n0 = n0;
    }

    @Override
    public String toString() {
        return "Satellite{" +
                "name='" + name + '\'' +
                ", in=" + in +
                ", raan=" + raan +
                ", e=" + e +
                ", omega=" + omega +
                ", v0=" + v0 +
                ", n0=" + n0 +
                '}';
    }
}
