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
		entries.add(new HeroResponse("Magic is an abomination", ANTIMAGE, R.raw.anti_magicuser_01));
		entries.add(new HeroResponse("I don't like magic", ANTIMAGE, R.raw.anti_mage_dont_like_magic));
		entries.add(new HeroResponse("Is this your card", ANTIMAGE, R.raw.anti_mage_is_this_your_card));
		entries.add(new HeroResponse("This is a team game?", REPORTER, R.raw.reporter_this_is_a_team_game));
		entries.add(new HeroResponse("Magic paper", REPORTER, R.raw.reporter_magic_paper));
		entries.add(new HeroResponse("Hello, I'm Ymir the tusk.", TUSK, R.raw.tusk_hello));
		entries.add(new HeroResponse("Shoot him!", ENIGMA, R.raw.engima_enemy_closing_in));
		entries.add(new HeroResponse("Activate! Blink! Go!", ENIGMA, R.raw.engima_blink));
		entries.add(new HeroResponse("Nyctasha", BANE, R.raw.bane_nyctasha));
		entries.add(new HeroResponse("Engima in the jungle.", ENIGMA, R.raw.enigma_in_the_jungle));
		entries.add(new HeroResponse("Grand Magus.", RUBICK, R.raw.rubick_grand_magus));
		entries.add(new HeroResponse("Got 'em", RUBICK, R.raw.rubick_got_em));
		entries.add(new HeroResponse("What are you hookin' me for?", PUDGE, R.raw.pudge_creep_hook));
		entries.add(new HeroResponse("Missing middle!", PUDGE, R.raw.pudge_lane_missing_02));
		entries.add(new HeroResponse("Keep doin' what you're doin'", ENIGMA, R.raw.enigma_rubick_keep_doing));
		entries.add(new HeroResponse("Rubick, you're a crazy f*, aren't you", ENIGMA, R.raw.engima_rubick_crazy));
		entries.add(new HeroResponse("F* your shit, I'm a siege creep.", REPORTER, R.raw.reporter_siege_creep));
		entries.add(new HeroResponse("Really good hooker", RUBICK, R.raw.rubick_good_hooker));
		entries.add(new HeroResponse("Haha you're stunned!", ENIGMA, R.raw.enigma_haha_stunned));
		entries.add(new HeroResponse("Cleanup time!", ANTIMAGE, R.raw.anti_mage_cleanup_time));
		entries.add(new HeroResponse("I have finished farming.", ANTIMAGE, R.raw.anti_mage_finished_farming));
		entries.add(new HeroResponse("The art of echo-location", FACELESS_VOID, R.raw.void_echo_location));
		entries.add(new HeroResponse("Accept this and move on", RUBICK, R.raw.rubick_accept_and_move_on));
		entries.add(new HeroResponse("Gank some fools", ENIGMA, R.raw.engima_gank_some_fools));
		entries.add(new HeroResponse("Gee, I love living!", CREEP, R.raw.creep_love_living));
		entries.add(new HeroResponse("Steroid creeps", ANTIMAGE, R.raw.anti_mage_steroid_creeps));
		return entries;
		
	}

}
