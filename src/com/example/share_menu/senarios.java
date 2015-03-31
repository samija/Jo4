package com.example.share_menu;



import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class senarios extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sinarios);
		Button reft = (Button) findViewById(R.id.Working);
		reft.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent re  = new Intent(senarios.this, working.class);
				startActivity(re);
				
			}
		});
		Button scool = (Button) findViewById(R.id.scool);
		scool.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent re  = new Intent(senarios.this, scool.class);
				startActivity(re);
				
			}
		});
		Button travling = (Button) findViewById(R.id.Traveling);
		travling.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent re  = new Intent(senarios.this, travling.class);
				startActivity(re);
				
			}
		});
		Button shoping = (Button) findViewById(R.id.Shoping);
		shoping.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent re  = new Intent(senarios.this, shoping.class);
				startActivity(re);
				
			}
		});
		
		Button enter = (Button) findViewById(R.id.Entertainment);
		enter.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent re  = new Intent(senarios.this, entertainment.class);
				startActivity(re);
				
			}
		});
		Button event = (Button) findViewById(R.id.event);
		event.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent re  = new Intent(senarios.this, event.class);
				startActivity(re);
				
			}
		});
		}
		


public boolean onCreateOptionsMenu(Menu menu)
{
    MenuInflater menuInflater = getMenuInflater();
    menuInflater.inflate(R.layout.menu, menu);
    return true;
}
 
/**
 * Event Handling for Individual menu item selected
 * Identify single menu item by it's id
 * */
@Override
public boolean onOptionsItemSelected(MenuItem item)
{
	 switch (item.getItemId())
	    {
	    case R.id.menu:
	        // Single menu item is selected do something
	        // Ex: launching new activity/screen or show alert message
	    	Intent i = new Intent(senarios.this, MainActivity.class);
	   	 
	  	  startActivity(i);
	        return true;
	    case R.id.about:
	        // Single menu item is selected do something
	        // Ex: launching new activity/screen or show alert message
	    	Intent i2 = new Intent(senarios.this, About.class);
	   	 
	  	  startActivity(i2);
	        return true;
	    case R.id.contact:
	        // Single menu item is selected do something
	        // Ex: launching new activity/screen or show alert message
	    	Intent i3 = new Intent(senarios.this, Feedback.class);
	   	 
	  	  startActivity(i3);
	        return true;
	    case R.id.like:
		    // Single menu item is selected do something
		    // Ex: launching new activity/screen or show alert message
			Intent d = new Intent(senarios.this, Like.class);
			 
			  startActivity(d);
	
	    return true;}
		return true;}}

/**
 * Event Handling for Individual menu item selected
 * Identify single menu item by it's id
 * */

