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
		this.setDrawingCacheEnabled(true);
		sfh = this.getHolder();
		sfh.addCallback(this);
		paint = new Paint();
		paint.setColor(Color.BLACK);
		pic = BitmapFactory.decodeResource(getResources(), R.drawable.picjpeg);
		setFocusable(true);
	}

	@Override
	public void run() {
		long start = 0;
		long end = 0;
		while(true){
			start = System.currentTimeMillis();
			this.myDraw();
			end = System.currentTimeMillis();
//			System.out.println("耗时： "+ (end - start)+"图片宽："+pic.getWidth()+"图片高："+pic.getHeight());
//			System.out.println("耗时： "+ (end - start)+" freeMemory: "+Runtime.getRuntime().freeMemory()+" maxMemory: "+Runtime.getRuntime().maxMemory());
		}
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
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			canvas.drawBitmap(pic, 0, 0, paint);
			System.out.println("加速？："+canvas.isHardwareAccelerated());
		}
		sfh.unlockCanvasAndPost(canvas);
	}

	@Override
	public void surfaceDestroyed(SurfaceHolder holder) {
	}

}
