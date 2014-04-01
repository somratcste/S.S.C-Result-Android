package com.examplesscresult.sscresult;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;

public class Splash extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.new_splash);
		Thread tr= new Thread(){
			public void run() {
				try {
					sleep(1800);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					Intent i= new Intent(Splash.this,MainActivity.class);
					startActivity(i);
				}
			};
			
		};
		tr.start();
		
	}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}

}