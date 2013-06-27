package il.co.gadiworks.beginnerandroidtutorial;

import android.os.Bundle;
import android.app.ListActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewActivity extends ListActivity {
	String[] classNames = {"MenuActivity", "RadioButtonsActivity", "SplashActivity", 
			"SweetActivity", "BackgroundActivity", "CustomViewTutorialActivity",
			"SurfaceViewActivity", "VideoViewTutorialActivity"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, classNames));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.list_view, menu);
		return true;
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		
		String openClass = classNames[position];
		try {
			Class<?> selected = Class.forName("il.co.gadiworks.beginnerandroidtutorial." + openClass);
			Intent selectedIntent = new Intent(this, selected);
			startActivity(selectedIntent);
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
	
	
	
}
