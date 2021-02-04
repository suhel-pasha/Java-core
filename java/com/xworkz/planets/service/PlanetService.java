package com.xworkz.planets.service;

import java.util.List;

import com.xworkz.planets.dto.PlanetDTO;

public interface PlanetService {
	
	boolean validateAndSave(PlanetDTO planetDTO);
	PlanetDTO validateAndPrintbyPosition(int position);
	boolean validateAndUpdateNameByPosition(int position,String name);
    boolean validateAndDeleteByName(String name);
    
    boolean validateAndSaveMultiplePlanets(List<PlanetDTO> planets);

}
