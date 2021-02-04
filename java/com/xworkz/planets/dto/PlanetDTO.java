package com.xworkz.planets.dto;

public class PlanetDTO {
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param position the position to set
	 */
	public void setPosition(int position) {
		this.position = position;
	}
	/**
	 * @param humanExistence the humanExistence to set
	 */
	public void setHumanExistence(boolean humanExistence) {
		this.humanExistence = humanExistence;
	}
	private String name;
	private int position;
	private boolean humanExistence;
	public PlanetDTO(String name, int position, boolean humanExistence) {
		super();
		this.name = name;
		this.position = position;
		this.humanExistence = humanExistence;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the position
	 */
	public int getPosition() {
		return position;
	}
	/**
	 * @return the humanExistence
	 */
	public boolean isHumanExistence() {
		return humanExistence;
	}
	@Override
	public String toString() {
		return "Planet [name=" + name + ", position=" + position + ", humanExistence=" + humanExistence + "]";
	}
	
	
	
	

}
