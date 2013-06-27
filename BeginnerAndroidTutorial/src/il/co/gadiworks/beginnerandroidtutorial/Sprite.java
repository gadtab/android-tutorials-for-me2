package il.co.gadiworks.beginnerandroidtutorial;

import il.co.gadiworks.beginnerandroidtutorial.SurfaceViewActivity.OurView;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;

public class Sprite {
	int x, y;
	int xSpeed, ySpeed;
	int height, width;
	Bitmap b;
	OurView ov;
	int currentFrame = 0;
	int direction = 2;

	public Sprite(OurView ourView, Bitmap blob) {
		b = blob;
		ov = ourView;
		height = b.getHeight() / 4; // 4 rows
		width = b.getWidth() / 3; // 3 columns
		x = y = 0;
		xSpeed = 5;
		ySpeed = 0;
	}

	public void draw(Canvas c) {
		update();
		int srcX = currentFrame * width;
		int srcY = direction * height;
		Rect src = new Rect(srcX, srcY, srcX + width, srcY + height);
		Rect dst =  new Rect(x, y, x + width, y + height);
		c.drawBitmap(b, src, dst, null);
	}

	private void update() {
		// 0 = down
		// 1 = left
		// 2 = right
		// 3 = up
		
		// facing down
		if (x > ov.getWidth() - width - xSpeed) {
			xSpeed = 0;
			ySpeed = 5;
			direction = 0;
		}
		
		// facing left
		if (y > ov.getHeight() - height - ySpeed) {
			xSpeed = -5;
			ySpeed = 0;
			direction = 1;
		}
		
		// facing up
		if (x + xSpeed < 0) {
			x = 0;
			xSpeed = 0;
			ySpeed = -5;
			direction = 3;
		}
		
		// facing right
		if (y + ySpeed < 0) {
			y = 0;
			xSpeed = 5;
			ySpeed = 0;
			direction = 2;
		}
		
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		currentFrame = ++currentFrame % 3;
		x += xSpeed;
		y += ySpeed;
	}
}
