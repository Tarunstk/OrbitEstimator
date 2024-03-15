package com.example.src.main.java.orbittracker;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

public class julianDate {

    private double year;
    private double month;
    private double day;
    private double hour;
    private double minute;
    private double seconds;

    public julianDate() {
    }

    public julianDate(double year, double month, double day, double hour, double minute, double seconds) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }


    public double getYear() {
        return year;
    }

    public void setYear(double year) {
        this.year = year;
    }

    public double getMonth() {
        return month;
    }

    public void setMonth(double month) {
        this.month = month;
    }

    public double getDay() {
        return day;
    }

    public void setDay(double day) {
        this.day = day;
    }
    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public double getMinute() {
        return minute;
    }

    public void setMinute(double minute) {
        this.minute = minute;
    }

    public double getSeconds() {
        return seconds;
    }

    public void setSeconds(double seconds) {
        this.seconds = seconds;
    }



    @Override
    public String toString() {
        return "julianDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", hour=" + hour +
                ", minute=" + minute +
                ", seconds=" + seconds +
                '}';
    }
}
