package il.co.gadiworks.beginnerandroidtutorial;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoViewTutorialActivity extends Activity {
	private VideoView video;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.video_view_tutorial);
		
		video = (VideoView) findViewById(R.id.video);
		
		String uriString = "android.resource://" + getPackageName() + "/" + R.raw.video1;
		
		video.setVideoURI(Uri.parse(uriString));
		
		
		MediaController mc = new MediaController(this);
		mc.setMediaPlayer(video);
		
		video.setMediaController(mc);
		
		video.start();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.video_view_tutorial, menu);
		return true;
	}

}
