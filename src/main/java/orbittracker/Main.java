package com.example.src.main.java.orbittracker;

//@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		//SpringApplication.run(JulianDateApplication.class, args);
		satelliteService s = new satelliteService();
		julianDateService d = new julianDateService();
		//dbProperties db = new dbProperties("jdbc:postgresql://localhost:5432/satellites", "postgres","1797");
		//db.setUrl("jdbc:postgresql://localhost:5432/satellites");
		//db.setUsername("postgres");
		//db.setPassword("1797");
		//d.getJD(new julianDate(1, 23,2,2024));
		s.addSatellite(new satellite("IRS P6", 98.5525, 276.0870, 0.00563, 303.7850, 55.928, 14.341));
		s.addSatellite(new satellite("IRS P5", 97.873, 257.9920, 0.001044, 51.2651, 308.8671, 14.787));
		s.addSatellite(new satellite("CARTOSAT 2AT", 97.82, 218.5088, 0.002763, 45.0401,315.1040 , 14.8374));
		s.addSatellite(new satellite("CARTOSAT 2BT", 97.82, 218.5088, 0.002763, 45.0401,315.1040 , 14.8374));
		System.out.println(d.getJD(new julianDate(1L, 2024,2,23)));
		System.out.println(s.getAllSats());
		System.out.println(s.getSat("CARTOSAT 2AT"));



	}

}
