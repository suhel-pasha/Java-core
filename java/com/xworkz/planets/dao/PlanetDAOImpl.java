package com.xworkz.planets.dao;

import java.util.Iterator;
import java.util.List;

import com.xworkz.planets.dto.PlanetDTO;

public class PlanetDAOImpl implements PlanetDAO {
	
	List<PlanetDTO> planets;
	public PlanetDAOImpl(List list) {
		this.planets = list;
	}
	

	@Override
	public boolean save(PlanetDTO planetDTO) {
		
		boolean saved = planets.add(planetDTO);
		System.out.println("Added: "+saved);
		return saved;
	}


	@Override
	public PlanetDTO printPlanetByPosition(int position) {
		for (PlanetDTO planetDTO : planets) {
			if(planetDTO.getPosition()==position) {
				System.out.println("Found the Planet");
				return planetDTO;
			}
		}
		System.out.println("Planet not available in the data base");
		return null;
	}


	@Override
	public boolean changeNameByPosition(int position,String name) {
		for (PlanetDTO planetDTO : planets) {
			if(planetDTO.getPosition()==position) {
				System.out.println("Found the planet,changing the name..");
				planetDTO.setName(name);
				System.out.println("The name updated to :"+planetDTO.getName());
                return true;
			}
		}
		return false;
	}


	@Override
	public boolean deleteByName(String name) {
		Iterator<PlanetDTO> iterator=planets.iterator();
		while (iterator.hasNext()) {
			PlanetDTO planetDTO = iterator.next();
			if(planetDTO.getName().equals(name)) {
				iterator.remove();
				System.out.println("Found the planet and deleted it!!");
				return true;
			}
			
		}
		return false;
	}


	@Override
	public boolean addMultiplePlanets(List planets) {
		this.planets.addAll(planets);
		System.out.println("Successfully added the list elements");
		return true;
	}

}
