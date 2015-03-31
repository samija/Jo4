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

public class scool extends Activity {

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

		listDataHeader.add("The Love of God");
		listDataHeader.add("Gods word is true forever!");
		listDataHeader.add("There is a name to bleive first");
		listDataHeader.add("You must be identified");
		listDataHeader.add("You Dont wana cost your life!");
		listDataHeader.add("You Dont wana be delayed!");
		listDataHeader.add("Jesus Can help you");
		
		

		// Adding child data
		List<String> top250 = new ArrayList<String>();
		top250.add("You are studying someone’s theory, do you know that there is Gods theory? (Comment: Tell about the love of God,John3:16)");
		List<String> nowShowing = new ArrayList<String>();
		nowShowing.add("You know many theories that have been amended and modified    do you know w/c theory stays true all the time.(Comment: Tell that the word of God always stays true.\n  24 For all flesh is as grass, and all the glory of man as the flower of grass. The grass withereth, and the flower thereof falleth away:25 But the word of the Lord endureth for ever. And this is the word which by the gospel is preached unto you.~1peter 1:24-25)");
		List<String> three = new ArrayList<String>();
		three.add("This all calculations and studying help you to enter to a big company through vacancy, do you know if there is also subject to study and helps enter heaven?(Tell that Jesus is the only way to Heaven.Acts 4:12 Neither is there salvation in any other: for there is none other name under heaven given among men, whereby we must be saved.");
		List<String> four = new ArrayList<String>();
		four.add("Our school use uniforms to identify as student who belongs here.Do you know that there is also uniform cloths for soul to be identified as who belongs to heaven and who doesn’t.(Tell that  you must believe and confess the lordship of chrit to be saved. Romans 10:10For with the heart man believeth unto righteousness; and with the mouth confession is made unto salvation.For our conversation is in heaven; from whence also we look for the Saviour, the Lord Jesus Christ:)");
		List<String> five = new ArrayList<String>();
		five.add("If you come late for school you know it will cost you this…can you tell me something that costs your life if you arrive late?” \n(Tell that the salvation time is now not tomorrow. For he saith, I have heard thee in a time accepted, and in the day of salvation have I succoured thee: behold, now is the accepted time; behold, now is the day of salvation.)");
		List<String> sixth= new ArrayList<String>();
		sixth.add("You know once if we come late the keeper at the gate won’t allow you to enter to the school for that days only. But do you know a place that once if you have arrived late the keepers will not allow u to enter forever?");
		List<String> seven= new ArrayList<String>();
		seven.add("Oh friend the questions were so hard but thanks to God this book/(friend name) helped me in solving the problem. But do you know a guy or book who can answer all life questions?");
		
		listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
		listDataChild.put(listDataHeader.get(1), nowShowing);
		listDataChild.put(listDataHeader.get(2), three);
		listDataChild.put(listDataHeader.get(3), four);
		listDataChild.put(listDataHeader.get(4), five);
		listDataChild.put(listDataHeader.get(5), sixth);
		listDataChild.put(listDataHeader.get(6), seven);
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
	    	Intent i = new Intent(scool.this, MainActivity.class);
	   	 
	  	  startActivity(i);
	        return true;
	    case R.id.about:
	        // Single menu item is selected do something
	        // Ex: launching new activity/screen or show alert message
	    	Intent i2 = new Intent(scool.this, About.class);
	   	 
	  	  startActivity(i2);
	        return true;
	    case R.id.contact:
	        // Single menu item is selected do something
	        // Ex: launching new activity/screen or show alert message
	    	Intent i3 = new Intent(scool.this, Feedback.class);
	   	 
	  	  startActivity(i3);
	        return true;
	    case R.id.like:
		    // Single menu item is selected do something
		    // Ex: launching new activity/screen or show alert message
			Intent d = new Intent(scool.this, Like.class);
			 
			  startActivity(d);
	
	    return true;}
		return true;}
}