package de.jakobkarolus.dotabuttons.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

import de.jakobkarolus.dotabuttons.R;
import de.jakobkarolus.dotabuttons.model.HeroResponse;

import static de.jakobkarolus.dotabuttons.model.Heros.*;

/**
 * loads the available hero respoonses
 * 
 * @author Jakob
 *
 */
public class HeroResponseParser {
	
	public static final String HERO_RESPONSE_FILE = "res/hero_responses.txt";
	
	/**
	 * loads hero responses (hard-coded)
	 * 
	 * @return
	 * @throws FileNotFoundException
	 */
	public static List<HeroResponse> loadHeroResponseData() throws FileNotFoundException{
		
		List<HeroResponse> entries = new Vector<HeroResponse>(); 
		
		entries.add(new HeroResponse("You can keep your magic", TINKER, R.raw.tink_ability_laser_01));
		
		return entries;
		
	}

}
