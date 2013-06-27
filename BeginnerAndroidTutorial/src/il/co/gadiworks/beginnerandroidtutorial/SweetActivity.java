package il.co.gadiworks.beginnerandroidtutorial;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SweetActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sweet);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sweet, menu);
		return true;
	}

}
