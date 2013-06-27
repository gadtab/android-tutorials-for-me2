package il.co.gadiworks.beginnerandroidtutorial;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class SplashActivity extends Activity {
	private MediaPlayer logoMusic;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		
		logoMusic = MediaPlayer.create(this, R.raw.splash);
		
		logoMusic.start();
		
		Thread logoThread = new Thread() {
			public void run() {
				try {
					sleep(2000);
					Intent menuIntent = new Intent("il.co.gadiworks.beginnerandroidtutorial.MENU");
					startActivity(menuIntent);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					finish();
				}
			}
		};
		
		logoThread.start();
	}

	@Override
	protected void onPause() {
		super.onPause();
		logoMusic.release();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.splash, menu);
		return true;
	}

}
