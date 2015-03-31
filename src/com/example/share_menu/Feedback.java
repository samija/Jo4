package com.example.share_menu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Feedback extends Activity {
	   /** Called when the activity is first created. */
		private static Feedback lastPausedActivity = null;
	   @Override
	   public void onCreate(Bundle savedInstanceState) {
	       super.onCreate(savedInstanceState);
	       setContentView(R.layout.feedback);
	      
	       final EditText edittextEmailAddress = (EditText)findViewById(R.id.email_address);
	       final EditText edittextEmailSubject = (EditText)findViewById(R.id.email_subject);
	       final EditText edittextEmailText = (EditText)findViewById(R.id.email_text);
	       Button buttonSendEmail_intent = (Button)findViewById(R.id.sendemail_intent);
	      
	       buttonSendEmail_intent.setOnClickListener(new Button.OnClickListener(){

	  @Override
	  public void onClick(View arg0) {
	   // TODO Auto-generated method stub

	   String emailAddress = edittextEmailAddress.getText().toString();
	   String emailSubject = edittextEmailSubject.getText().toString();
	   String emailText = edittextEmailText.getText().toString();

	   String emailAddressList[] = {emailAddress};
	  
	   Intent intent = new Intent(Intent.ACTION_SEND); 
	   intent.setType("plain/text");
	   intent.putExtra(Intent.EXTRA_EMAIL, emailAddressList);  
	   intent.putExtra(Intent.EXTRA_SUBJECT, emailSubject); 
	   intent.putExtra(Intent.EXTRA_TEXT, emailText); 
	   startActivity(Intent.createChooser(intent, "Choice App t send email:"));
	  
	  }});
	   }
	@Override
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
		    	Intent i = new Intent(Feedback.this, MainActivity.class);
		   	 
		  	  startActivity(i);
		        return true;
		    case R.id.about:
		        // Single menu item is selected do something
		        // Ex: launching new activity/screen or show alert message
		    	Intent i2 = new Intent(Feedback.this, About.class);
		   	 
		  	  startActivity(i2);
		        return true;
		    case R.id.contact:
		        // Single menu item is selected do something
		        // Ex: launching new activity/screen or show alert message
		    	Intent i3 = new Intent(Feedback.this, Feedback.class);
		   	 
		  	  startActivity(i3);
		        return true;
		    case R.id.like:
			    // Single menu item is selected do something
			    // Ex: launching new activity/screen or show alert message
				Intent d = new Intent(Feedback.this, Like.class);
				 
				  startActivity(d);
		
		    return true;}
			return true;}}
