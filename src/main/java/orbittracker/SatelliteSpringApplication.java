package com.example.src.main.java.orbittracker;

import com.example.src.main.java.orbittracker.model.satellite;
import com.example.src.main.java.orbittracker.service.julianDateService;
import com.example.src.main.java.orbittracker.service.satelliteService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import java.util.List;

@SpringBootApplication
public class SatelliteSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SatelliteSpringApplication.class, args);
		satelliteService service = context.getBean(satelliteService.class);
		//service.addSatellite(new satellite("IRS P12", 98.5525, 276.0870, 0.00563, 303.7850, 55.928, 14.341));
		julianDateService service1 = context.getBean(julianDateService.class);
		System.out.println(service1.getJD());
		List<satellite> satellites = service.getAllSats();
		for (satellite sats : satellites){
			System.out.println(sats);
		}

		//julianDateService d = new julianDateService();
		//System.out.println(d.getJD());
		/*s.addSatellite(new satellite("IRS P6", 98.5525, 276.0870, 0.00563, 303.7850, 55.928, 14.341));
		s.addSatellite(new satellite("IRS P5", 97.873, 257.9920, 0.001044, 51.2651, 308.8671, 14.787));
		s.addSatellite(new satellite("CARTOSAT 2AT", 97.82, 218.5088, 0.002763, 45.0401,315.1040 , 14.8374));
		s.addSatellite(new satellite("CARTOSAT 2BT", 97.82, 218.5088, 0.002763, 45.0401,315.1040 , 14.8374));
		System.out.println(d.getJD(new julianDate(1L, 2024,2,23)));
		System.out.println(s.getAllSats());
		System.out.println(s.getSat("CARTOSAT 2AT"));
		 */


	}

}
