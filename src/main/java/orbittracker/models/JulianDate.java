package orbittracker.models;

import org.springframework.stereotype.Component;

@Component
public class JulianDate {
    private Long id;
    private double year;
    private double month;
    private double day;

    public JulianDate() {
    }

    public JulianDate(Long id, double year, double month, double day) {
        this.id = id;
        this.year = year;
        this.month = month;
        this.day = day;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "JulianDate{" +
                "id=" + id +
                ", year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
