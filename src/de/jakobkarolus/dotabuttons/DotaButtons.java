package de.jakobkarolus.dotabuttons;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Vector;

import de.jakobkarolus.dotabuttons.io.HeroResponseParser;
import de.jakobkarolus.dotabuttons.layout.CustomizedArrayAdapter;
import de.jakobkarolus.dotabuttons.model.HeroResponse;
import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.app.ListActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.os.Build;

public class DotaButtons extends ListActivity {
	
	private CustomizedArrayAdapter buttons;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		List<HeroResponse> entries = new Vector<HeroResponse>();
		try {
			entries = HeroResponseParser.loadHeroResponseData();
		} catch (FileNotFoundException e) {
			Toast.makeText(getApplicationContext(), "Cannot find or access Hero response file. Please reinstall!", Toast.LENGTH_LONG).show();
		}
		
		buttons =  new CustomizedArrayAdapter(this, R.layout.dota_buttons_list_entry, entries);
		
		getListView().setAdapter(buttons);
		
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dota_buttons, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		
		super.onListItemClick(l, v, position, id);
		HeroResponse entry = (HeroResponse) getListView().getItemAtPosition(position);
		
		MediaPlayer player = MediaPlayer.create(getApplicationContext(), entry.getSoundFile());
		player.start();
		
	}

}
