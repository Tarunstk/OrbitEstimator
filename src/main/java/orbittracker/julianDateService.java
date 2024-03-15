package com.example.src.main.java.orbittracker;

import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
@Component
public class julianDateService {
    private double Y;
    private double M;
    private double D;
    private double H;
    private double Min;
    private double S;
    String timeday;

    public double getJD(){
        double A,B,JD;
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date day = new Date();
        timeday = df.format(day);
        Y = Double.parseDouble(timeday.substring(0,4));
        M = Double.parseDouble(timeday.substring(5,7));
        D = Double.parseDouble(timeday.substring(8,10));
        H = Double.parseDouble(timeday.substring(11,13));
        Min = Double.parseDouble(timeday.substring(14,16));
        S = Double.parseDouble(timeday.substring(17,19));
        System.out.println(timeday);
        System.out.println(Y);
        System.out.println(M);
        System.out.println(D);
        System.out.println(H);
        System.out.println(Min);
        System.out.println(S);
            A = Y/100;
            B = 2 - A + (A/4);
            JD = (365.25 * (Y + 4716)) + (30.6001 * (M + 1)) + ((D
                    + (H/24 + Min/1440 + S/86400)) + B) - 1524.5; //subtract by 0.222222225 for preciise fractional part of the day
            return JD;

    }

}
