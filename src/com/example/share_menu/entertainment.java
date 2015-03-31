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

public class entertainment extends Activity {

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
		listDataHeader.add("Heavenly joy");
		listDataHeader.add("relaxation during  stress");		
		listDataHeader.add("above natural laws");
listDataHeader.add("God gave beauty to nature");
listDataHeader.add(" Largest treasure a person could possess");





		
		

		// Adding child data
		List<String> joy = new ArrayList<String>();
		joy.add("I remember the joy and fun I had when I play with my friends.  Have you ever thought about the joy the kingdom of God can give? (Tell him/her about the joy and peace that is in heaven.\n’ For the kingdom of God is not meat and drink; but righteousness, and peace, and joy in the Holy Ghost.’\n( Rom 14 v 17) ");
		

		List<String> relax = new ArrayList<String>();
		relax.add("You can relax here if you are stressed, but how about this can you entertain here if you lose your life in fire or accident or fired from office yesterday? ");
		
				
		List<String> laws= new ArrayList<String>();
		laws.add("On Earth all things are under the law of gravity,however everyday this law is being broken by other law,the law of lift. (Similarly tell him/her that Gods law(the law of the spirit of life) far exceed the law of sin and death. \n'For the law of the Spirit of life in Christ Jesus hath made me free from the law of sin and death'\n Rom 8 v 2)");
		

		List<String> beauty = new ArrayList<String>();
		beauty.add("I think you have realized a lot about the beauty of nature. Could you be certain weather this all appeared in accident.(Tell him/her who the creator is; and how much perfect he is in his works ‘By his (God) spirit he hath garnished the heavens.’ Job 26 v 13) ");
		List<String> possesion = new ArrayList<String>();
		possesion.add("How much is the largest money or treasure in the world that a person could possess? Could it be able as worthy as life?\n(Tell him/her that she was bought by the precious blood of Jesus 'For ye are bought with a price: therefore glorify God in your body, and in your spirit, which are God's'/n 1 Cor 6 v 20)");

		
		

		listDataChild.put(listDataHeader.get(0), joy ); // Header, Child data
		listDataChild.put(listDataHeader.get(1), relax );
		listDataChild.put(listDataHeader.get(2), laws);
		listDataChild.put(listDataHeader.get(3), beauty); // Header, Child data
		listDataChild.put(listDataHeader.get(4), possesion);
		}
}

