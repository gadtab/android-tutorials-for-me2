package il.co.gadiworks.beginnerandroidtutorial;

import java.io.IOException;
import java.io.InputStream;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class BackgroundActivity extends Activity implements OnClickListener {
	private ImageView ivBackground;
	private ImageView ivImage1;
	private ImageView ivImage2;
	private ImageView ivImage3;
	private ImageView ivImage4;
	private ImageView ivImage5;
//	private ImageView ivImage6;
//	private ImageView ivImage7;
//	private ImageView ivImage8;
//	private ImageView ivImage9;
//	private ImageView ivImage10;
//	private ImageView ivImage11;
//	private ImageView ivImage12;
	
	private Button btnSetBackground;
	
	private int imgId;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.background);
		
		imgId = R.drawable.back_clouds_picture;
		
		ivBackground = (ImageView) findViewById(R.id.ivBackground);
		ivImage1 = (ImageView) findViewById(R.id.ivImage1);
		ivImage2 = (ImageView) findViewById(R.id.ivImage2);
		ivImage3 = (ImageView) findViewById(R.id.ivImage3);
		ivImage4 = (ImageView) findViewById(R.id.ivImage4);
		ivImage5 = (ImageView) findViewById(R.id.ivImage5);
//		ivImage6 = (ImageView) findViewById(R.id.ivImage6);
//		ivImage7 = (ImageView) findViewById(R.id.ivImage7);
//		ivImage8 = (ImageView) findViewById(R.id.ivImage8);
//		ivImage9 = (ImageView) findViewById(R.id.ivImage9);
//		ivImage10 = (ImageView) findViewById(R.id.ivImage10);
//		ivImage11 = (ImageView) findViewById(R.id.ivImage11);
//		ivImage12 = (ImageView) findViewById(R.id.ivImage12);
		
		btnSetBackground = (Button) findViewById(R.id.btnSetBackground);
		
		ivImage1.setOnClickListener(this);
		ivImage2.setOnClickListener(this);
		ivImage3.setOnClickListener(this);
		ivImage4.setOnClickListener(this);
		ivImage5.setOnClickListener(this);
//		ivImage6.setOnClickListener(this);
//		ivImage7.setOnClickListener(this);
//		ivImage8.setOnClickListener(this);
//		ivImage9.setOnClickListener(this);
//		ivImage10.setOnClickListener(this);
////		ivImage11.setOnClickListener(this);
//		ivImage12.setOnClickListener(this);
		
		btnSetBackground.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.background, menu);
		return true;
	}

	@SuppressWarnings("deprecation")
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.ivImage1:
			ivBackground.setImageResource(R.drawable.back_clouds_picture);
			imgId = R.drawable.back_clouds_picture;
			break;
			
		case R.id.ivImage2:
			ivBackground.setImageResource(R.drawable.back_dog_animal);
			imgId = R.drawable.back_dog_animal;
			break;
			
		case R.id.ivImage3:
			ivBackground.setImageResource(R.drawable.back_engine_photo);
			imgId = R.drawable.back_engine_photo;
			break;
			
		case R.id.ivImage4:
			ivBackground.setImageResource(R.drawable.back_flowers_image);
			imgId = R.drawable.back_flowers_image;
			break;
			
		case R.id.ivImage5:
			ivBackground.setImageResource(R.drawable.back_forest_wood);
			imgId = R.drawable.back_forest_wood;
			break;
			
//		case R.id.ivImage6:
//			ivBackground.setImageResource(R.drawable.back_fruits_picture);
//			imgId = R.drawable.back_fruits_picture;
//			break;
//			
//		case R.id.ivImage7:
//			ivBackground.setImageResource(R.drawable.back_lake_tree);
//			imgId = R.drawable.back_lake_tree;
//			break;
//			
//		case R.id.ivImage8:
//			ivBackground.setImageResource(R.drawable.back_logs_picture);
//			imgId = R.drawable.back_logs_picture;
//			break;
//			
//		case R.id.ivImage9:
//			ivBackground.setImageResource(R.drawable.back_sculpture_photo);
//			imgId = R.drawable.back_sculpture_photo;
//			break;
//			
//		case R.id.ivImage10:
//			ivBackground.setImageResource(R.drawable.back_stones_background);
//			imgId = R.drawable.back_stones_background;
//			break;
//			
//		case R.id.ivImage11:
//			ivBackground.setImageResource(R.drawable.back_sunshades);
//			imgId = R.drawable.back_sunshades;
//			break;
//			
//		case R.id.ivImage12:
//			ivBackground.setImageResource(R.drawable.back_tree_winter);
//			imgId = R.drawable.back_tree_winter;
//			break;
			
		case R.id.btnSetBackground:
			InputStream is = getResources().openRawResource(imgId);
			Bitmap bmBackground = BitmapFactory.decodeStream(is);
			
			try {
				getApplicationContext().setWallpaper(bmBackground);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			Toast.makeText(BackgroundActivity.this, "Wallpaper Set", Toast.LENGTH_LONG).show();
			break;
		}
	}

}
