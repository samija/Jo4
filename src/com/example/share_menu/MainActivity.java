package com.example.share_menu;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);
		Button personal = (Button)findViewById(R.id.sceniarios);
		personal.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
		Intent per = new Intent(MainActivity.this,senarios.class);
		startActivity(per);
		
				
			}
		});
		Button para = (Button)findViewById(R.id.Parables);
		para.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
		Intent per = new Intent(MainActivity.this,parables.class);
		startActivity(per);
		
				
			}
		});
		Button story = (Button)findViewById(R.id.story);
		story.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
		Intent per = new Intent(MainActivity.this,ShareMenu.class);
		startActivity(per);
		
				
			}
		});
		Button tips = (Button)findViewById(R.id.tips);
		tips.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
		Intent per = new Intent(MainActivity.this,Tips.class);
		startActivity(per);
		
				
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
	    	Intent i = new Intent(MainActivity.this, MainActivity.class);
	   	 
	  	  startActivity(i);
	        return true;
	    case R.id.about:
	        // Single menu item is selected do something
	        // Ex: launching new activity/screen or show alert message
	    	Intent i2 = new Intent(MainActivity.this, About.class);
	   	 
	  	  startActivity(i2);
	        return true;
	    case R.id.contact:
	        // Single menu item is selected do something
	        // Ex: launching new activity/screen or show alert message
	    	Intent i3 = new Intent(MainActivity.this, Feedback.class);
	   	 
	  	  startActivity(i3);
	        return true;
	    case R.id.like:
		    // Single menu item is selected do something
		    // Ex: launching new activity/screen or show alert message
			Intent d = new Intent(MainActivity.this, Like.class);
			 
			  startActivity(d);
	
	    return true;}
		return true;}}
