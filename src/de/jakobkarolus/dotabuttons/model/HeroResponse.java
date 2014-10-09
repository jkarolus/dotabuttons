package de.jakobkarolus.dotabuttons.model;


/**
 * An entry of DotaButtons
 * 
 * @author Jakob
 *
 */
public class HeroResponse {

	private String response;
	private Heros heroName;
	private int soundFile;
	
	
	public HeroResponse(String response, Heros heroName, int soundFile) {
		super();
		this.response = response;
		this.heroName = heroName;
		this.setSoundFile(soundFile);
	}


	public String getResponse() {
		return response;
	}


	public void setResponse(String name) {
		this.response = name;
	}


	public Heros getHero() {
		return heroName;
	}


	public void setHero(Heros heroName) {
		this.heroName = heroName;
	}

	public int getSoundFile() {
		return soundFile;
	}


	public void setSoundFile(int soundFile) {
		this.soundFile = soundFile;
	}
	
	
	
	
}
