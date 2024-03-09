package orbittracker;

import orbittracker.models.JulianDate;
import orbittracker.models.Satellite;
import orbittracker.services.JulianDateService;
import orbittracker.services.SatelliteService;
import orbittracker.services.impl.JulianDateServiceImpl;
import orbittracker.services.impl.SatelliteServiceImpl;

//@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		//SpringApplication.run(JulianDateApplication.class, args);

		SatelliteService satelliteService = new SatelliteServiceImpl();
		JulianDateService julianDateService = new JulianDateServiceImpl();

		//DbProperties db = new DbProperties("jdbc:postgresql://localhost:5432/satellites", "postgres","1797");
		//db.setUrl("jdbc:postgresql://localhost:5432/satellites");
		//db.setUsername("postgres");
		//db.setPassword("1797");
		//julianDateService.getJD(new JulianDate(1, 23,2,2024));

		satelliteService.addSatellite(new Satellite("IRS P6", 98.5525, 276.0870, 0.00563,
				303.7850, 55.928, 14.341));
		satelliteService.addSatellite(new Satellite("IRS P5", 97.873, 257.9920, 0.001044,
				51.2651, 308.8671, 14.787));
		satelliteService.addSatellite(new Satellite("CARTOSAT 2AT", 97.82, 218.5088, 0.002763,
				45.0401, 315.1040, 14.8374));
		satelliteService.addSatellite(new Satellite("CARTOSAT 2BT", 97.82, 218.5088, 0.002763,
				45.0401, 315.1040, 14.8374));

		System.out.println(julianDateService.getJD(new JulianDate(1L, 2024, 2, 23)));
		System.out.println(satelliteService.getAllSats());
		System.out.println(satelliteService.getSat("CARTOSAT 2AT"));

	}

}
