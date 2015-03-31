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

public class working extends Activity {

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

		listDataHeader.add("All Thing is Done!");
		listDataHeader.add("You are called for the better life");
		listDataHeader.add("Relationship with God");
		listDataHeader.add("Jesus can help you!");
		listDataHeader.add("Every choice in life has a wage latter");
		listDataHeader.add("born again!");
		listDataHeader.add("Who is your guranty");
		
		

		// Adding child data
		List<String> top250 = new ArrayList<String>();
		top250.add("How does it sound if they pay you salary, while spend all working days at your home this month?\n(For the wages of sin is death; but the gift of God is eternal life through Jesus Christ our Lord “Rom 6 vs 23)");
		List<String> nowShowing = new ArrayList<String>();
		nowShowing.add("What if you will work here like this (as labor, assistant, engineer…) while they didn’t hire you and do you think that they would pay you?\n(Watch therefore, for ye know neither the day nor the hour wherein the Son of man cometh.”Math 25 vs 13).");
		List<String> three = new ArrayList<String>();
		three.add("How is your relation with your administrator? \n(Tell him/her to make your relationship harmonious with  the creature administrator, God! ‘Greater love hath no man than this that a man lay down his life for his friends.’John 15 vs 13)");
	List<String> four = new ArrayList<String>();
		four.add("Last year I have been stressed due to work load, but somebody has helped me, have you ever encountered such type of situations?           \n  (Tell that Jesus Can help them in life situations “Come unto me, all ye that labor and are heavy laden, and I will give you rest.     “     Math 11 vs  28).");
		List<String> five = new ArrayList<String>();
		five.add("What if you have been absent for many days from the work, do you think you will receive salary? (Tell Them That there is a wage for what you chose in life! …For the wages of sin is death; but the gift of God is eternal life through Jesus Christ our Lord   Rom 6 vs 23)");		List<String> sixth= new ArrayList<String>();
		sixth.add("We know that human beings are born once, do you know the men/women that has been born twice  without entering in to his/her mother’s womb?\n(Tell that all people on earth must be born again in his spirit “Jesus answered and said unto him, Verily, verily, I say unto thee, except a man be born again, he cannot see the kingdom of God.” John 3 vs 3)");
		List<String> seven= new ArrayList<String>();
		seven.add("The company (name of the company) will give you pension during your elderly time. But who will be guaranty   for your life, if you unexpected things happen on you?\n(Tell that Jesus is her/his guaranty “Neither is there salvation in any other: for there is none other name under heaven given among men, whereby we must be saved.”  Acts 4:12");
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
	    	Intent i = new Intent(working.this, MainActivity.class);
	   	 
	  	  startActivity(i);
	        return true;
	    case R.id.about:
	        // Single menu item is selected do something
	        // Ex: launching new activity/screen or show alert message
	    	Intent i2 = new Intent(working.this, About.class);
	   	 
	  	  startActivity(i2);
	        return true;
	    case R.id.contact:
	        // Single menu item is selected do something
	        // Ex: launching new activity/screen or show alert message
	    	Intent i3 = new Intent(working.this, Feedback.class);
	   	 
	  	  startActivity(i3);
	        return true;
	    case R.id.like:
		    // Single menu item is selected do something
		    // Ex: launching new activity/screen or show alert message
			Intent d = new Intent(working.this, Like.class);
			 
			  startActivity(d);
	
	    return true;}
		return true;}
}