package com.example.src.main.java.orbittracker;

public class julianDateService {
    private double Y;
    private double M;
    private double D;
    public double getJD(julianDate date){
            double A,B,JD;
            Y = date.getYear();
            M = date.getMonth();
            D = date.getDay();
            A = Y/100;
            B = 2 - A + (A/4);
            JD = (365.25 * (Y + 4716)) + (30.6001 * (M + 1)) + (D + B) - 1524.5;
            return JD;

    }

}
