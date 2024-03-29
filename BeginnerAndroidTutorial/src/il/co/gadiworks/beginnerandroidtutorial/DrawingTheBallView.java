package il.co.gadiworks.beginnerandroidtutorial;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

public class DrawingTheBallView extends View{

	Bitmap bball;
	int x, y;
	
	public DrawingTheBallView(Context context) {
		super(context);
		
		bball = BitmapFactory.decodeResource(getResources(), R.drawable.blueball);
		x = y = 0;
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		
		Rect ourRect = extractedRect();
		
		ourRect.set(0, 0, canvas.getWidth(), canvas.getHeight()/2);
		
		Paint blue = extractedPaint();
		blue.setColor(Color.BLUE);
		blue.setStyle(Paint.Style.FILL);
		
		canvas.drawRect(ourRect, blue);
		
		if (x < canvas.getWidth()) {
			x += 10;
		}
		else {
			x = 0;
		}
		
		if (y < canvas.getHeight()) {
			y += 10;
		}
		else {
			y = 0;
		}
		
		canvas.drawBitmap(bball, x, y, extractedPaint());
		invalidate();
	}

	private Paint extractedPaint() {
		return new Paint();
	}

	private Rect extractedRect() {
		return new Rect();
	}
	
}
