package de.jakobkarolus.dotabuttons;

import java.util.List;
import java.util.Vector;

import de.jakobkarolus.dotabuttons.layout.CustomizedArrayAdapter;
import de.jakobkarolus.dotabuttons.model.ListEntry;
import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.os.Build;

public class DotaButtons extends ListActivity {
	
	private CustomizedArrayAdapter buttons;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//create some items
		ListEntry first = new ListEntry("Anti-Mage", R.drawable.antimage_icon);
		ListEntry second = new ListEntry("Puck", R.drawable.puck_icon);
		List<ListEntry> entries = new Vector<ListEntry>();
		entries.add(first);
		entries.add(second);
		
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

}
