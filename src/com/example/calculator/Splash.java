package com.example.calculator;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity {

	
	MediaPlayer oursong; 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		//The setContentView links the XML layout to the Java code.
		
		
		oursong = MediaPlayer.create(Splash.this, R.raw.eso_en_4);
		oursong.start();
		
		Thread timer = new Thread() { 
			
			public void run() {
				
				try { 
				
					sleep(10000);
					
				} catch (InterruptedException e) {
					
					e.printStackTrace();
					
				}
					finally { 
						Intent openStartingPoint = new Intent("com.example.calculator.MENU");
						startActivity(openStartingPoint);
					}
				
			}
		
		};
		timer.start();	
	}

	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
		oursong.release();
		
	}
	
	
	
	
	
	

}
