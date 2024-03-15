package com.example.src.main.java.orbittracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import java.util.List;

@SpringBootApplication
public class SatelliteSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SatelliteSpringApplication.class, args);
		satelliteService service = context.getBean(satelliteService.class);
		List<satellite> satellites = service.getAllSats();
		for (satellite sats : satellites){
			System.out.println(sats);
		}
	}

}
