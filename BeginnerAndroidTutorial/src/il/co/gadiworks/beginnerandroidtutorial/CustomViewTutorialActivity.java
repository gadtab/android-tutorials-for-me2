package il.co.gadiworks.beginnerandroidtutorial;

import android.os.Bundle;
import android.app.Activity;

public class CustomViewTutorialActivity extends Activity {
	
	DrawingTheBallView v;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		v = new DrawingTheBallView(this);
		
		setContentView(v);
	}

}
