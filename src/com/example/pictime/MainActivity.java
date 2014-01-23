package com.example.pictime;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
public class MainActivity extends Activity {

	private final static int HEAP_SIZE = 6* 1024* 1024 ;  
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		VMRuntime.getRuntime().setMinimumHeapSize(HEAP_SIZE);  
		setContentView(new MySurfaceView(this));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
