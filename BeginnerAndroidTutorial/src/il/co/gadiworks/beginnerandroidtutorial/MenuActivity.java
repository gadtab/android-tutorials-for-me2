package il.co.gadiworks.beginnerandroidtutorial;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity extends Activity {
	private Button btnRadioButtons, btnListView, btnBackground,
			btnCustomViewTutorial, btnSurfaceView, btnVideoViewTutorial;
	private MediaPlayer buttonSound;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);

		// setting up the button sound
		buttonSound = MediaPlayer.create(this, R.raw.button_sound);

		// setting up the button references
		btnRadioButtons = (Button) findViewById(R.id.btnRadioButtons);
		btnListView = (Button) findViewById(R.id.btnListView);
		btnBackground = (Button) findViewById(R.id.btnBackground);
		btnCustomViewTutorial = (Button) findViewById(R.id.btnCustomViewTutorial);
		btnSurfaceView = (Button) findViewById(R.id.btnSurfaceView);
		btnVideoViewTutorial = (Button) findViewById(R.id.btnVideoViewTutorial);

		btnRadioButtons.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				buttonSound.start();
				startActivity(new Intent(
						"il.co.gadiworks.beginnerandroidtutorial.RADIOBUTTONS"));
			}
		});

		btnListView.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				buttonSound.start();
				startActivity(new Intent(
						"il.co.gadiworks.beginnerandroidtutorial.LISTVIEW"));
			}
		});

		btnBackground.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				buttonSound.start();
				startActivity(new Intent(
						"il.co.gadiworks.beginnerandroidtutorial.BACKGROUND"));
			}
		});

		btnCustomViewTutorial.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				buttonSound.start();
				startActivity(new Intent(
						"il.co.gadiworks.beginnerandroidtutorial.CUSTOMVIEW"));
			}
		});

		btnSurfaceView.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				buttonSound.start();
				startActivity(new Intent(
						"il.co.gadiworks.beginnerandroidtutorial.SURFACEVIEW"));
			}
		});

		btnVideoViewTutorial.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				buttonSound.start();
				startActivity(new Intent(
						"il.co.gadiworks.beginnerandroidtutorial.VIDEOVIEW"));
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);

		// Inflate the menu; this adds items to the action bar if it is present.
		MenuInflater menuInflater = getMenuInflater();
		menuInflater.inflate(R.menu.menu, menu);

		return true;
	}

	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.menuSweet:
			startActivity(new Intent(
					"il.co.gadiworks.beginnerandroidtutorial.SWEET"));

			return true;
		case R.id.menuToast:
			Toast toast = Toast.makeText(MenuActivity.this, "This is a toast",
					Toast.LENGTH_LONG);
			toast.show();

			return true;
		}

		return false;
	}
}
