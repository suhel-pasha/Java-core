package com.xworkz.planets.dao;

import java.util.List;

import com.xworkz.planets.dto.PlanetDTO;

public interface PlanetDAO {
	
	boolean save(PlanetDTO planetDTO);
	PlanetDTO printPlanetByPosition(int position);
	boolean changeNameByPosition(int position, String name);
	boolean deleteByName(String name);
	boolean addMultiplePlanets(List planets);

}
