package il.co.gadiworks.beginnerandroidtutorial;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Typeface;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

public class RadioButtonsActivity extends Activity implements OnCheckedChangeListener{
	
	private TextView tvChange;
	private EditText etIn;
	private RadioGroup rgStyle, rgGravity;
	private Button btnGenerate;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.radio_buttons);
		
		tvChange = (TextView) findViewById(R.id.tvChange);
		etIn = (EditText) findViewById(R.id.etIn);
		rgStyle = (RadioGroup) findViewById(R.id.rgStyle);
		rgGravity = (RadioGroup) findViewById(R.id.rgGravity);
		btnGenerate = (Button) findViewById(R.id.btnGenerate);
		
		rgGravity.setOnCheckedChangeListener(this);
		rgStyle.setOnCheckedChangeListener(this);
			
		btnGenerate.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				tvChange.setText(etIn.getText());
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tutorial_one, menu);
		return true;
	}

	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		switch (checkedId) {
		case R.id.rbLeft:
			tvChange.setGravity(Gravity.LEFT);
			break;
		case R.id.rbCenter:
			tvChange.setGravity(Gravity.CENTER);
			break;
		case R.id.rbRight:
			tvChange.setGravity(Gravity.RIGHT);
			break;
		case R.id.rbNormal:
			tvChange.setTypeface(Typeface.defaultFromStyle(Typeface.NORMAL), Typeface.NORMAL);
			break;
		case R.id.rbItalic:
			tvChange.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC), Typeface.ITALIC);
			break;
		case R.id.rbBold:
			tvChange.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD), Typeface.BOLD);
			break;
		}
	}
}
