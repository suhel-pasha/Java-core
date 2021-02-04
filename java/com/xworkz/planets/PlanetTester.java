package com.xworkz.planets;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.planets.dao.PlanetDAO;
import com.xworkz.planets.dao.PlanetDAOImpl;
import com.xworkz.planets.dto.PlanetDTO;
import com.xworkz.planets.service.PlanetService;
import com.xworkz.planets.service.PlanetServiceImpl;

public class PlanetTester {
	public static void main(String[] args) {
		List<PlanetDTO> solarSystem = new ArrayList<PlanetDTO>();
		
		PlanetDAO planetDAO = new PlanetDAOImpl(solarSystem);
		
		PlanetService planetService = new PlanetServiceImpl(planetDAO);
		
		PlanetDTO planet1 = new PlanetDTO("Earth", 3, true);
		PlanetDTO planet2 = new PlanetDTO("Jupiter", 5, false);
		PlanetDTO planet3 = new PlanetDTO("Uranus", 7, false);
		
		//creation
		
		planetService.validateAndSave(planet1);
		planetService.validateAndSave(planet2);
		planetService.validateAndSave(planet3);
		
		
		//read
		
		System.out.println(planetService.validateAndPrintbyPosition(3));
		
		//update
		
		planetService.validateAndUpdateNameByPosition(5, "Neptune");
		
		//delete
		
		planetService.validateAndDeleteByName("Neptune");
		
		//save with a list
		
		List<PlanetDTO> planets2 = new ArrayList<PlanetDTO>();
		PlanetDTO planet4 = new PlanetDTO("Venus", 2, false);
		PlanetDTO planet5 = new PlanetDTO("Mercury", 1, false);
		
		planets2.add(planet4);
		planets2.add(planet5);
		
		planetService.validateAndSaveMultiplePlanets(planets2);
		
		
	}

}
