package com.fluentnet.lifecycleevents;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	public static final String TAG = "LifeCycleEvents";
	private int onCreate = 0;
	private int onRestart = 0;
	private int onStart = 0;
	private int onPause = 0;
	private int onResume = 0;
	private int onDestroy = 0;
	private int onRotate = 0;
	private int paused = 0;
	private Button mResetButton;
	private Button mExitButton;
	private String mHeaderString;
	TextView myCreate;
	TextView myRestart;
	TextView myStart;
	TextView myPause;
	TextView myResume;
	TextView myDestroy;
	TextView myRotate;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		 if (savedInstanceState != null) {
			 onCreate = savedInstanceState.getInt("onCreate");
			 onRestart = savedInstanceState.getInt("onRestart");
			 onStart = savedInstanceState.getInt("onStart");
			 onPause = savedInstanceState.getInt("onPause");
			 onResume = savedInstanceState.getInt("onResume");
			 onDestroy = savedInstanceState.getInt("onDestroy");
			 onRotate = savedInstanceState.getInt("onRotate" );
		}		
		
		onCreate++;
		Log.i( TAG, "onCreate " + String.valueOf( onCreate ));
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);
		
		mResetButton = ( Button ) findViewById(R.id.reset_button1);

		mResetButton.setOnClickListener( new View.OnClickListener() { 
			@Override public void onClick( View v) { 
				Log.i( TAG, "onCreate"+" Got Button Press");
				onReset( v );
				}
			});

		Log.i( TAG, "onCreate "+ String.valueOf( onCreate ) + " " + String.valueOf( onRestart )
				+ " " + String.valueOf( onStart ) + " " + String.valueOf( onPause ) + " " + String.valueOf( onResume )
				+ " " + String.valueOf( onDestroy ) + " " + String.valueOf( onRotate ) );		
		
	}

	@Override
	protected void onRestart() {
		onRestart++;
		Log.i(TAG, "onRestart "+String.valueOf( onRestart ));		
		super.onRestart();
		setContentView(R.layout.activity_main);

/*		
		Log.i( TAG, "onRestart "+String.valueOf( onCreate ) + " " + String.valueOf( onRestart )
				+ " " + String.valueOf( onStart ) + " " + String.valueOf( onPause ) + " " + String.valueOf( onResume )
				+ " " + String.valueOf( onDestroy ) + " " + String.valueOf( onRotate ) );		
*/
	}
	
	@Override
	protected void onStart() {
		onStart++;
		Log.i(TAG, "onStart "+String.valueOf( onStart ));
		super.onStart();
		setContentView(R.layout.activity_main);

/*		
		Log.i( TAG, "onStart "+String.valueOf( onCreate ) + " " + String.valueOf( onRestart )
				+ " " + String.valueOf( onStart ) + " " + String.valueOf( onPause ) + " " + String.valueOf( onResume )
				+ " " + String.valueOf( onDestroy ) + " " + String.valueOf( onRotate ) );		
*/
	}
	
	@Override
	protected void onPause() {
		onPause++;
		Log.i( TAG,"onPause "+String.valueOf( onPause ));
		super.onPause();
		setContentView(R.layout.activity_main);

		
		Log.i(TAG,"onPause "+String.valueOf( onCreate ) + " " + String.valueOf( onRestart )
				+ " " + String.valueOf( onStart ) + " " + String.valueOf( onPause ) + " " + String.valueOf( onResume )
				+ " " + String.valueOf( onDestroy ) + " " + String.valueOf( onRotate ) );		
	}	
	
	@Override
	protected void onResume() {
		onResume++;
		Log.i(TAG,"onResume "+String.valueOf( onResume ));
		super.onResume();
		setContentView(R.layout.activity_main);
		
		myResume = ( TextView ) this.findViewById(R.id.tc_onResume);
		myResume.setText(String.valueOf( onResume ));

		myCreate = ( TextView ) this.findViewById(R.id.tc_onCreate);		
		myCreate.setText(String.valueOf( onCreate ));
		
		myCreate = ( TextView ) this.findViewById(R.id.tc_onCreate);
		myCreate.setText(String.valueOf( onCreate ));
		
		myRestart = ( TextView ) this.findViewById(R.id.tc_onRestart);
		myRestart.setText(String.valueOf( onRestart ));		
	
		myStart = ( TextView ) this.findViewById(R.id.tc_onStart);
		myStart.setText(String.valueOf( onRestart ));			
		
		myPause = ( TextView ) this.findViewById(R.id.tc_onPause );
		myPause.setText(String.valueOf( onPause ));			
		
		myResume = ( TextView ) this.findViewById(R.id.tc_onResume);
		myResume.setText(String.valueOf( onResume ));	
		 
		myDestroy = ( TextView ) this.findViewById(R.id.tc_onDestroy );
		myDestroy.setText(String.valueOf( onDestroy ));	
		
		myRotate = ( TextView ) this.findViewById(R.id.tc_onRotate);
		myRotate.setText(String.valueOf( onRotate ));					
		
		Log.i(TAG, "onResume "+String.valueOf( onCreate ) + " " + String.valueOf( onRestart )
				+ " " + String.valueOf( onStart ) + " " + String.valueOf( onPause ) + " " + String.valueOf( onResume )
				+ " " + String.valueOf( onDestroy ) + " " + String.valueOf( onRotate ) );		
		
	}	
	
	@Override
	public void onDestroy() {
		onDestroy++;
		Log.i(TAG, "onDestroy "+String.valueOf( onDestroy ));
		super.onDestroy();

/*		
		Log.i(TAG,"onDestroy "+String.valueOf( onCreate ) + " " + String.valueOf( onRestart )
				+ " " + String.valueOf( onStart ) + " " + String.valueOf( onPause ) + " " + String.valueOf( onResume )
				+ " " + String.valueOf( onDestroy ) + " " + String.valueOf( onRotate ) );		
*/
	}	

	protected void onRotate() {
		onRotate++;
		Log.i( TAG, "onRotate "+ String.valueOf( onRotate ));
		setContentView(R.layout.activity_main);

		Log.i( TAG, "onRotate "+ String.valueOf( onCreate ) + " " + String.valueOf( onRestart )
				+ " " + String.valueOf( onStart ) + " " + String.valueOf( onPause ) + " " + String.valueOf( onResume )
				+ " " + String.valueOf( onDestroy ) + " " + String.valueOf( onRotate ) );		
	}

	public void onReset( View button){
		
		Log.i( TAG, "onReset "+"zeroing variables " + String.valueOf( onCreate ) + " " + String.valueOf( onRestart )
				+ " " + String.valueOf( onStart ) + " " + String.valueOf( onPause ) + " " + String.valueOf( onResume )
				+ " " + String.valueOf( onDestroy ) + " " + String.valueOf( onRotate ) );

		setContentView(R.layout.activity_main);
		
		onCreate = 0;
		myCreate = ( TextView ) this.findViewById(R.id.tc_onCreate);
		myCreate.setText(String.valueOf( onCreate ));
		
		onRestart = 0;
		myRestart = ( TextView ) this.findViewById(R.id.tc_onRestart);
		myRestart.setText(String.valueOf( onRestart ));		

		
		onStart = 0;
		myStart = ( TextView ) this.findViewById(R.id.tc_onStart);
		myStart.setText(String.valueOf( onRestart ));			

		
		onPause = 0;
		myPause = ( TextView ) this.findViewById(R.id.tc_onPause );
		myPause.setText(String.valueOf( onPause ));			
		
		onResume = 0;
		myResume = ( TextView ) this.findViewById(R.id.tc_onResume);
		myResume.setText(String.valueOf( onResume ));	
		
		onDestroy = 0; 
		myDestroy = ( TextView ) this.findViewById(R.id.tc_onDestroy );
		myDestroy.setText(String.valueOf( onDestroy ));	
		
		onRotate = 0;
		myRotate = ( TextView ) this.findViewById(R.id.tc_onRotate);
		myRotate.setText(String.valueOf( onRotate ));			

	
	}
	

	public void onExit( View button){
		
		Log.i( TAG, "onExit "+"exiting " + String.valueOf( onCreate ) + " " + String.valueOf( onRestart )
				+ " " + String.valueOf( onStart ) + " " + String.valueOf( onPause ) + " " + String.valueOf( onResume )
				+ " " + String.valueOf( onDestroy ) + " " + String.valueOf( onRotate ) );

		setContentView(R.layout.activity_main);
		System.exit(0);	
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	/*
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		 super.onRestoreInstanceState(savedInstanceState);

			Log.i( TAG, "onRestoreInstanceState "+"Restoring state");
			Log.i( TAG, "onRestoreInstanceState "+String.valueOf( onCreate ) + " " + String.valueOf( onRestart )
					+ " " + String.valueOf( onStart ) + " " + String.valueOf( onPause ) + " " + String.valueOf( onResume )
					+ " " + String.valueOf( onDestroy ) + " " + String.valueOf( onRotate ) );
		}
*/		
	
	protected void onSaveInstanceState(Bundle outState) {
		 super.onSaveInstanceState(outState);
		 outState.putInt("onCreate", onCreate );
		 outState.putInt("onRestart", onRestart);
		 outState.putInt("onStart", onStart);
		 outState.putInt("onPause", onPause);
		 outState.putInt("onResume", onResume);
		 outState.putInt("onDestroy", onDestroy);
		 outState.putInt("onRotate", onRotate );
/*		 
		Log.i(TAG, "onSaveInstanceState "+String.valueOf( onCreate ) + " " + String.valueOf( onRestart )
					+ " " + String.valueOf( onStart ) + " " + String.valueOf( onPause ) + " " + String.valueOf( onResume )
					+ " " + String.valueOf( onDestroy ) + " " + String.valueOf( onRotate ) );
*/
		 
		 Log.i(TAG,"Saved state");
		}
	
	@Override
	public void onConfigurationChanged(Configuration newConfig)
		{
	    super.onConfigurationChanged(newConfig);		
		Log.d(TAG, "onConfigurationChanged config changed");

	    // Checks the orientation of the screen
	    if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) 
	    {
	    	onRotate++;
	        Toast.makeText(this, "landscape", Toast.LENGTH_SHORT).show();
	        Log.d( TAG, "onConfigurationChanged landscape");
	    } 
	    else 
	    {	
	    	if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT)
	    	{
	    		onRotate++;	
	    		Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();
	    		Log.d( TAG, "onConfigurationChanged portrait");
	    	}
	    }
	    
		setContentView(R.layout.activity_main);
		
		myResume = ( TextView ) this.findViewById(R.id.tc_onResume);
		myResume.setText(String.valueOf( onResume ));

		myCreate = ( TextView ) this.findViewById(R.id.tc_onCreate);		
		myCreate.setText(String.valueOf( onCreate ));
		
		myCreate = ( TextView ) this.findViewById(R.id.tc_onCreate);
		myCreate.setText(String.valueOf( onCreate ));
		
		myRestart = ( TextView ) this.findViewById(R.id.tc_onRestart);
		myRestart.setText(String.valueOf( onRestart ));		
	
		myStart = ( TextView ) this.findViewById(R.id.tc_onStart);
		myStart.setText(String.valueOf( onRestart ));			
		
		myPause = ( TextView ) this.findViewById(R.id.tc_onPause );
		myPause.setText(String.valueOf( onPause ));			
		
		myResume = ( TextView ) this.findViewById(R.id.tc_onResume);
		myResume.setText(String.valueOf( onResume ));	
		 
		myDestroy = ( TextView ) this.findViewById(R.id.tc_onDestroy );
		myDestroy.setText(String.valueOf( onDestroy ));	
		
		myRotate = ( TextView ) this.findViewById(R.id.tc_onRotate);
		myRotate.setText(String.valueOf( onRotate ));					
		
		Log.i(TAG, "onConfigurationChanged "+String.valueOf( onCreate ) + " " + String.valueOf( onRestart )
				+ " " + String.valueOf( onStart ) + " " + String.valueOf( onPause ) + " " + String.valueOf( onResume )
				+ " " + String.valueOf( onDestroy ) + " " + String.valueOf( onRotate ) );		    
	    
		
	}	
	
}
