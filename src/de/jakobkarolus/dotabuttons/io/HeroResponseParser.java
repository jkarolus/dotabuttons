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
		entries.add(new HeroResponse("Bristles on me back", BRISTLEBACK, R.raw.bristleback_bristles_on_back));
		entries.add(new HeroResponse("Cotton candy", INVOKER, R.raw.invoker_cotton_candy));
		entries.add(new HeroResponse("I don't even know how I got here", GYROCOPTER, R.raw.gyrocopter_how_i_got_here));
		entries.add(new HeroResponse("I was here third!", GYROCOPTER, R.raw.gyrocopter_third));
		entries.add(new HeroResponse("Food to the opposing team", INVOKER, R.raw.invoker_food));
		entries.add(new HeroResponse("No sense at all", BRISTLEBACK, R.raw.bristleback_no_sense_at_all));
		entries.add(new HeroResponse("Gimmie gimmie gimmie", GYROCOPTER, R.raw.gyrocopter_mine));
		entries.add(new HeroResponse("I'll report you", RUBICK, R.raw.rubick_report));
		entries.add(new HeroResponse("Mustache", GYROCOPTER, R.raw.gyrocopter_mustache));
		entries.add(new HeroResponse("Enigma in the jungle 2", ENIGMA, R.raw.engima_jungle_2));
		entries.add(new HeroResponse("New meta", NATURES_PROPHET, R.raw.prophet_new_meta));
		entries.add(new HeroResponse("Game is hard", NATURES_PROPHET, R.raw.prophet_game_is_hard));
		entries.add(new HeroResponse("Pew pew pew", GYROCOPTER, R.raw.gyrocopter_pew_pew_pew));
		entries.add(new HeroResponse("GG branch", INVOKER, R.raw.invoker_gg_branch));
		entries.add(new HeroResponse("Wex exort exort", INVOKER, R.raw.invoker_wex_exort_exort));
		entries.add(new HeroResponse("Keep your eyes peeled", RUBICK, R.raw.rubick_eyes_peeled));
		entries.add(new HeroResponse("Oh my gawd", ENIGMA, R.raw.enigma_omg));
		entries.add(new HeroResponse("Exort exort exort", INVOKER, R.raw.invoker_exort_exort_exort));
		entries.add(new HeroResponse("Biological warfare", INVOKER, R.raw.invoker_biological_warfare));
		entries.add(new HeroResponse("Euls scepter of divinity", INVOKER, R.raw.invoker_euls));
		entries.add(new HeroResponse("I f* love drumming", GYROCOPTER, R.raw.gyrocopter_love_drumming));
		entries.add(new HeroResponse("I'm a mass murderer", GYROCOPTER, R.raw.gyrocopter_mass_murderer));
		entries.add(new HeroResponse("Immortalitah", GYROCOPTER, R.raw.gyrocopter_immortalitah));
		entries.add(new HeroResponse("I've got the aegis, bitches", GYROCOPTER, R.raw.gyrocopter_aegis));
		entries.add(new HeroResponse("Panic drums panic", GYROCOPTER, R.raw.gyrocopter_panic_drums_panic));
		entries.add(new HeroResponse("I don't understand you", GYROCOPTER, R.raw.gyrocopter_language_understand));
		entries.add(new HeroResponse("Oink oink oink", ENIGMA, R.raw.enigma_oink));
		entries.add(new HeroResponse("Nobody temporarily ends my life", GYROCOPTER, R.raw.gyrocopter_temporarily_end_life));
		entries.add(new HeroResponse("Shiny red bullets", GYROCOPTER, R.raw.gyrocopter_red_bullets));
		entries.add(new HeroResponse("Operation SNPUHHPRZ", GYROCOPTER, R.raw.gyrocopter_operation_snpuhhprz));
		entries.add(new HeroResponse("Surprise shitpickle", GYROCOPTER, R.raw.gyrocopter_suprise_shitpickle));
		entries.add(new HeroResponse("More easily overestimate my tankiness", BRISTLEBACK, R.raw.bristleback_overestimate_tankiness));
		entries.add(new HeroResponse("Universe not the same without me", INVOKER, R.raw.invoker_universe_not_the_same));
		entries.add(new HeroResponse("Relocated to a new location", INVOKER, R.raw.invoker_relocate));
		entries.add(new HeroResponse("GG please end quickly", INVOKER, R.raw.invoker_gg_end_quickly));
		entries.add(new HeroResponse("Dota in a nutshell", ENIGMA, R.raw.enigma_dota_nutshell));
		entries.add(new HeroResponse("Arcane boots", RUBICK, R.raw.rubick_arcane_boots));
		entries.add(new HeroResponse("Deafening blast", ENIGMA, R.raw.enigma_def_blast));
		entries.add(new HeroResponse("Manta style", GYROCOPTER, R.raw.gyrocopter_manta_style));
		entries.add(new HeroResponse("Rocket ships", ENIGMA, R.raw.enigma_rocket_ships));
		entries.add(new HeroResponse("Meep mop defense system", RUBICK, R.raw.rubick_meep_mop));
		entries.add(new HeroResponse("Meeega creeps", ENIGMA, R.raw.enigma_mega_creeps));
		entries.add(new HeroResponse("Demon edge, sacred relic", REPORTER, R.raw.reporter_divine_rapier));
		entries.add(new HeroResponse("Throw", GYROCOPTER, R.raw.gyrocopter_throw));
		entries.add(new HeroResponse("The reason I lost", INVOKER, R.raw.invoker_reason_lost));
		entries.add(new HeroResponse("Let's abandon", RUBICK, R.raw.rubick_abandon));
		entries.add(new HeroResponse("Pirate hat", TIDEHUNTER, R.raw.tidehunter_pirate_hat));
		entries.add(new HeroResponse("Octohead, sharkyback and squintbuddy", TIDEHUNTER, R.raw.tidehunter_octohead_sharkybag_squintbuddy));
		entries.add(new HeroResponse("Whitty remark about first blood", JUGGERNAUT, R.raw.juggernaut_first_blood));
		entries.add(new HeroResponse("Look, a tree", TIMBERSAW, R.raw.timbersaw_tree));
		entries.add(new HeroResponse("Eject", TIMBERSAW, R.raw.timbersaw_eject));
		entries.add(new HeroResponse("Axe is axe", AXE, R.raw.axe_interview));
		entries.add(new HeroResponse("Free farmin'", JUGGERNAUT, R.raw.juggernaut_free_farming));
		entries.add(new HeroResponse("Axehole", TERRORBLADE, R.raw.terrorblade_axehole));
		entries.add(new HeroResponse("He was gone just like that", ENIGMA, R.raw.enigma_he_was_gone));
		entries.add(new HeroResponse("Friends help kill Kunkka", TIDEHUNTER, R.raw.tidehunter_kunkka_kill));
		entries.add(new HeroResponse("Tidehunter okay", TIDEHUNTER, R.raw.tidehunter_okay));
		entries.add(new HeroResponse("Who's the carry", TERRORBLADE, R.raw.terrorblade_i_am_the_carry));
		entries.add(new HeroResponse("Badass flaming footsteps", TERRORBLADE, R.raw.terrorblade_badass_footsteps));
		entries.add(new HeroResponse("I can do it, too", TERRORBLADE, R.raw.terrorblade_illusion));
		return entries;
		
	}

}
