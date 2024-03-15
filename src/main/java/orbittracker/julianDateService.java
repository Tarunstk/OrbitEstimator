package com.example.src.main.java.orbittracker;

import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
public class julianDateService {
    private double Y;
    private double M;
    private double D;
    private double H;
    private double Min;
    private double S;
    String timeday;

    public double getJD(julianDate date){
            double A,B,JD;
            DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date day = new Date();
            timeday = df.format(day);
            System.out.println(timeday);
            Y = date.getYear();
            M = date.getMonth();
            D = date.getDay();
            H = date.getHour();
            Min = date.getMinute();
            S = date.getSeconds();
            A = Y/100;
            B = 2 - A + (A/4);
            JD = (365.25 * (Y + 4716)) + (30.6001 * (M + 1)) + ((D + (H/24 + Min/1440 + S/86400)) + B) - 1524.5;
            return JD;

    }

}
