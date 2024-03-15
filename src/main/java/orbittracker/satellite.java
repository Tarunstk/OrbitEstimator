package com.example.src.main.java.orbittracker;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//This class gets its data from TLE files after decoding it
@Entity
public class satellite {
    @Id
    private String name;
    private double inc;//inclination
    private double raan;//Ascension node (right angle)
    private double e; //eccentricity
    private double omega;//Argument of Perigee
    private double v0;//true anamoly = mean anamoly
    private double n0;//mean motion

    public satellite() {
    }

    public satellite(String name, double inc, double raan, double e, double omega, double v0, double n0) {
        this.name = name;
        this.inc = inc;
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

    public double getInc() {
        return inc;
    }

    public void setInc(double in) {
        this.inc = inc;
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

    public String toString() {
        return "satelliteData{" +
                "name='" + name + '\'' +
                ", in=" + inc +
                ", raan=" + raan +
                ", e=" + e +
                ", omega=" + omega +
                ", v0=" + v0 +
                ", n0=" + n0 +
                '}';
    }
}
