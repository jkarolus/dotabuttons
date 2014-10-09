package de.jakobkarolus.dotabuttons.layout;

import java.util.List;

import de.jakobkarolus.dotabuttons.R;
import de.jakobkarolus.dotabuttons.model.ListEntry;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * an {@link ArrayAdapter} tailored to our DotaButtons list format
 * 
 * @author Jakob
 *
 */
@SuppressLint("InflateParams")
public class CustomizedArrayAdapter extends ArrayAdapter<ListEntry>{

	public CustomizedArrayAdapter(Context context, int resource,
			List<ListEntry> objects) {
		super(context, resource, objects);
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		View v = convertView;
		
		if(v== null){
			LayoutInflater vi;
			vi = LayoutInflater.from(getContext());
			v = vi.inflate(R.layout.dota_buttons_list_entry, null);
		}
		
		ListEntry item = getItem(position);
		
		if(item != null){
			
			ImageView image = (ImageView) v.findViewById(R.id.image);
			TextView name = (TextView) v.findViewById(R.id.name);
			
			if(image != null)
				image.setImageResource(item.getImage());
			
			if(name != null)
				name.setText(item.getName());
		}
		
		return v;
		
	}

}
