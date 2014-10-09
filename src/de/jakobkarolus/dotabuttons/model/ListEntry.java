package de.jakobkarolus.dotabuttons.model;


/**
 * An entry of DotaButtons
 * 
 * @author Jakob
 *
 */
public class ListEntry {

	private String name;
	private int image;
	
	
	public ListEntry(String name, int image) {
		super();
		this.name = name;
		this.image = image;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getImage() {
		return image;
	}


	public void setImage(int image) {
		this.image = image;
	}


	@Override
	public String toString() {
		return name;
	}
	
	
	
	
}
