package com.example.pictime;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;

public class MySurfaceView extends SurfaceView implements Callback , Runnable{

	private SurfaceHolder sfh;
	private Paint paint;
	private Thread th;
	private boolean flag;
	private Canvas canvas;
	Bitmap pic;
	public MySurfaceView(Context context) {
		super(context);
		sfh = this.getHolder();
		sfh.addCallback(this);
		paint = new Paint();
		paint.setColor(Color.BLACK);
		pic = BitmapFactory.decodeResource(getResources(), R.drawable.pic2);
		setFocusable(true);
	}

	@Override
	public void run() {
		long start = 0;
		long end = 0;
		start = System.currentTimeMillis();
		this.myDraw();
		end = System.currentTimeMillis();
		System.out.println("ºÄÊ±£º "+ (end - start));
	}

	@Override
	public void surfaceChanged(SurfaceHolder holder, int format, int width,
			int height) {
	}

	@Override
	public void surfaceCreated(SurfaceHolder holder) {
		th = new Thread(this);
		th.start();
	}
	public void myDraw(){
		canvas = sfh.lockCanvas();
		if(canvas != null){
			canvas.drawBitmap(pic, 0, 0, paint);
		}
		sfh.unlockCanvasAndPost(canvas);
	}

	@Override
	public void surfaceDestroyed(SurfaceHolder holder) {
	}

}
