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

public class event extends Activity {

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
		listDataHeader.add("Celebration with our heavenly family");
		listDataHeader.add("Joy in the kingdom of God");		
		





		
		

		// Adding child data
		List<String> celebrate = new ArrayList<String>();
		celebrate.add("It is lovely to share love and celebrate with your family. What do you feel if you are invited to celebrate with heavenly family? What will you do? (comment: tell him/her about the love that you have experienced with your spiritual family\n ‘Truly our fellowship is with the Father, and with his Son Jesus Christ.\n’1 John 1 v 3)");
		

		List<String> enjoy = new ArrayList<String>();
		enjoy.add("I remember the joy and fun I had when I play with my friends. Do you know how much joy the kingdom of God can give? (Tell him/her about the joy and peace that is in heaven.\n’ For the kingdom of God is not meat and drink; but righteousness, and peace, and joy in the Holy Ghost.’ \nRom 14 v 17)");
		List<String> burial = new ArrayList<String>();
		burial.add("Before  several years I used to think about the time I am going to die, because every body is mortal. Have you ever thought about life after death. Where do you think your are going. (Tell him/her about Gods promises about the life after death and the importance of  the  work of Jesus. \n‘Jesus saith unto him, I am the way, the truth, and the life: no man cometh unto the Father, but by me.\n John 14 v 6 ");

	

		listDataChild.put(listDataHeader.get(0), celebrate ); // Header, Child data
		listDataChild.put(listDataHeader.get(1), enjoy );
		listDataChild.put(listDataHeader.get(1), burial );

		
		}
}

