package com.example.share_menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.Toast;

public class shoping extends Activity {

	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// get the listview
		expListView = (ExpandableListView) findViewById(R.id.lvExp);

		// preparing list data
		prepareListData();

		listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

		// setting list adapter
		expListView.setAdapter(listAdapter);

		// Listview Group click listener
		expListView.setOnGroupClickListener(new OnGroupClickListener() {

			@Override
			public boolean onGroupClick(ExpandableListView parent, View v,
					int groupPosition, long id) {
				// Toast.makeText(getApplicationContext(),
				// "Group Clicked " + listDataHeader.get(groupPosition),
				// Toast.LENGTH_SHORT).show();
				return false;
			}
		});

		// Listview Group expanded listener
		expListView.setOnGroupExpandListener(new OnGroupExpandListener() {

			@Override
			public void onGroupExpand(int groupPosition) {
				Toast.makeText(getApplicationContext(),
						listDataHeader.get(groupPosition) + " Expanded",
						Toast.LENGTH_SHORT).show();
			}
		});

		// Listview Group collasped listener
		expListView.setOnGroupCollapseListener(new OnGroupCollapseListener() {

			@Override
			public void onGroupCollapse(int groupPosition) {
				Toast.makeText(getApplicationContext(),
						listDataHeader.get(groupPosition) + " Collapsed",
						Toast.LENGTH_SHORT).show();

			}
		});

		// Listview on child click listener
		expListView.setOnChildClickListener(new OnChildClickListener() {

			@Override
			public boolean onChildClick(ExpandableListView parent, View v,
					int groupPosition, int childPosition, long id) {
				// TODO Auto-generated method stub
				Toast.makeText(
						getApplicationContext(),
						listDataHeader.get(groupPosition)
								+ " : "
								+ listDataChild.get(
										listDataHeader.get(groupPosition)).get(
										childPosition), Toast.LENGTH_SHORT)
						.show();
				return false;
			}
		});
	}

	/*
	 * Preparing the list data
	 */
	private void prepareListData() {
		listDataHeader = new ArrayList<String>();
		listDataChild = new HashMap<String, List<String>>();

		// Adding child data
		listDataHeader.add("All Thing is done!");
		listDataHeader.add("You need to bleive jesus first");
		

		// Adding child data
		List<String> top250 = new ArrayList<String>();
		top250.add("How does it sound if they pay you salary while you spend all the working days at your home?"+"\n(Comment: Tel that Christ finished all what we were supposed to do and pay"+"\n Rom Chapter 4)");
		

		List<String> nowShowing = new ArrayList<String>();
		nowShowing.add("What if you work like this while they didnt hire you and do you think they would pay you at the end of the month ?"+"\n(Comment:Tell that Good works only can not justify us  \n Rom Chapter 4:1-3)");
		
		
		

		listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
		listDataChild.put(listDataHeader.get(1), nowShowing);
	
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
	    	Intent i = new Intent(shoping.this, MainActivity.class);
	   	 
	  	  startActivity(i);
	        return true;
	    case R.id.about:
	        // Single menu item is selected do something
	        // Ex: launching new activity/screen or show alert message
	    	Intent i2 = new Intent(shoping.this, About.class);
	   	 
	  	  startActivity(i2);
	        return true;
	    case R.id.contact:
	        // Single menu item is selected do something
	        // Ex: launching new activity/screen or show alert message
	    	Intent i3 = new Intent(shoping.this, Feedback.class);
	   	 
	  	  startActivity(i3);
	        return true;
	    case R.id.like:
		    // Single menu item is selected do something
		    // Ex: launching new activity/screen or show alert message
			Intent d = new Intent(shoping.this, Like.class);
			 
			  startActivity(d);
	
	    return true;}
		return true;}
}
