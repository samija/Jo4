package com.example.share_menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.Toast;

public class travling extends Activity {

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
		listDataHeader.add("Best place to stay after death.");
		listDataHeader.add("God’s most high security for human beings");
		listDataHeader.add("The way to get eternal life.");
             listDataHeader.add("God’s Aim for human beings ");


		
		
		

		// Adding child data
		List<String> top250 = new ArrayList<String>();
top250.add("How does it Is it boring to be in a bus (plane, train) for a long time? Do you realize how boring it is to stay in a single place for a long time? What will you do to avoid staying in this kind of situation? "+"\n(Comment: Ask him/her what they will do if the place stated above is hell.’ And in hell he lift up his eyes, being in torments, and seeth Abraham afar off, and Lazarus in his bosom”)"+"\n Luk 16 vs 23)");
		

		List<String> nowShowing = new ArrayList<String>();
		nowShowing.add("Do you know how much unreliable it is to be in a vehicle or plane on an unreliable hands.  Do you know that there is reliable hand that can protect and lead in the all journeys of life ?"+"\n(Comment: Tell him/her How much God cares for him/her. He that dwelled in the secret place of the most High shall abide under the shadow of the Almighty \n Psalm chapter 91 vs 1)");
		
		List<String> three = new ArrayList<String>();
three.add("Oh dud your car is so fast and comfortable to take us to the place, and how about this will it be able to take us to heaven driving like this or do you know other options?\n(Tell him  about eternal life that can he/she got through Jesus )“And I give unto them eternal life; and they shall never perish \n  John chapter 10 :28 ");


		List<String> sec = new ArrayList<String>();
sec.add("You are now going to the place(tell the place he/she I going) what you will do if this car will be crashed,what you would do ?\n(Tell him  about eternal life that can he/she got through Jesus ) “For he saith, I have heard thee in a time accepted, and in the day of salvation have I succoured thee: behold, now is the accepted time; behold, now is the day of salvation  \n  2 Corinthians 6 :2 ");

		
		
		

		
		
		

		listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
		listDataChild.put(listDataHeader.get(1), nowShowing);
		listDataChild.put(listDataHeader.get(2), three);
		listDataChild.put(listDataHeader.get(3), sec); // Header, Child data
	
	}
}

