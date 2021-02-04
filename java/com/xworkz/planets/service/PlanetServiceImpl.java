package com.xworkz.planets.service;

import java.util.List;

import com.xworkz.planets.dao.PlanetDAO;
import com.xworkz.planets.dto.PlanetDTO;

public class PlanetServiceImpl implements PlanetService {
	
	PlanetDAO planetDAO;
	public PlanetServiceImpl(PlanetDAO planetDAO) {
		this.planetDAO = planetDAO;
	}

	@Override
	public boolean validateAndSave(PlanetDTO planetDTO) {
		
		System.out.println("invoked validate and save method");
		if(planetDTO!=null) {
			if(planetDTO.getName()!=null && planetDTO.getPosition()>0 && planetDTO.getPosition()<9) {
				System.out.println("The Position and name is valid , invoking save method");
				planetDAO.save(planetDTO);
			}
		}
		return false;
	}

	@Override
	public PlanetDTO validateAndPrintbyPosition(int position) {
		if(position>0 && position<9) {
			System.out.println("The position is valid , searching for the planet..");
			return this.planetDAO.printPlanetByPosition(position);
		}
		System.out.println("Sorry, the position is invalid");
		return null;
	}

	@Override
	public boolean validateAndUpdateNameByPosition(int position, String name) {
		if(position>0 && position<9 && name!=null) {
			System.out.println("The name and position are valid , searching for the planet now");
			planetDAO.changeNameByPosition(position, name);
			return true;
		}
		System.out.println("Sorry the parameters are not valid");
		return false;
	}

	@Override
	public boolean validateAndDeleteByName(String name) {
		if(name!= null) {
			System.out.println("Name is valid , searching the planet now");
			planetDAO.deleteByName(name);
		}
		return false;
	}

	@Override
	public boolean validateAndSaveMultiplePlanets(List<PlanetDTO> planets) {
		int count = 0;
		if(planets.size()>0) {
			System.out.println("The list is not empty,adding planets to ");
			for (PlanetDTO planetDTO : planets) {
				if(planetDTO.getName()!=null && planetDTO.getPosition()>0 && planetDTO.getPosition()<9) {
					continue;
				}
				else 
					count++;
				
			}
			if(count==0) {
				System.out.println("The planets inside the list are valid, now adding them to our list");
				planetDAO.addMultiplePlanets(planets);
				return true;
			}
			else {
				System.out.println("The list contains invalid data");
				return false;
			}
		}
		System.out.println("The list is empty");
		return false;
	
	}

}
