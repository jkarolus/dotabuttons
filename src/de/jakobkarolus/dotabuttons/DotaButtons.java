package de.jakobkarolus.dotabuttons;

import java.io.IOException;
import java.util.List;

import android.app.ListActivity;
import android.content.res.AssetFileDescriptor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;
import de.jakobkarolus.dotabuttons.io.HeroResponseParser;
import de.jakobkarolus.dotabuttons.layout.CustomizedArrayAdapter;
import de.jakobkarolus.dotabuttons.model.HeroResponse;


/**
 * custom {@link ListActivity} that provides access to our hero responses
 * 
 * @author Jakob
 *
 */
public class DotaButtons extends ListActivity{
	
	private static final String TAG = DotaButtons.class.getName();
	
	private CustomizedArrayAdapter buttons;
	private MediaPlayer player;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
        
		//load entries and associate with ArrayAdapter
		List<HeroResponse> entries = HeroResponseParser.loadHeroResponseData();
		buttons =  new CustomizedArrayAdapter(this, R.layout.dota_buttons_list_entry, entries);
		//getListView().setAdapter(buttons);
		setListAdapter(buttons);

		
		//init MediaPlayer
		player = new MediaPlayer();
		player.setAudioStreamType(AudioManager.STREAM_MUSIC);
		player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
			
			@Override
			public void onCompletion(MediaPlayer mp) {
				releasePlayer();
			}
		});
		player.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
			
			@Override
			public void onPrepared(MediaPlayer mp) {
				mp.start();
			}
		});
		
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
		
		//cancel previous playback
		releasePlayer();
		
		//initialize player with new HeroResponse and start playing
		 try {
	            AssetFileDescriptor afd = getApplicationContext().getResources().openRawResourceFd(entry.getSoundFile());
	            if (afd == null){
	            	Toast.makeText(getApplicationContext(), "Couldn't decode media file", Toast.LENGTH_SHORT).show();
	            	return;
	            }

	            player.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
	            afd.close();
	            player.prepareAsync();	            
	            
	        } catch (IOException ex) {
	            Log.d(TAG, "create failed:", ex);
	            // fall through
	        } catch (IllegalArgumentException ex) {
	            Log.d(TAG, "create failed:", ex);
	           // fall through
	        } catch (SecurityException ex) {
	            Log.d(TAG, "create failed:", ex);
	            // fall through
	        }
		
	}
	
	/**
	 * resets the player upon finishing a playback or when interrupted
	 * 
	 */
	private void releasePlayer(){
		player.reset();
	}

}
