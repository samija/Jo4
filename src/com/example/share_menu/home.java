package com.example.share_menu;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;

public class home extends ListActivity {

String[] elements = {"video", "menu"};

public void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);

      setContentView(R.layout.activity_main); 
     ExpandableListView listview = (  ExpandableListView)findViewById(R.id.lvExp);
     listview.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, elements));
 }

public void onListItemClick(ExpandableListView parent, View v, int position, long id) {

    if ("video".equals(elements[position]))
        {Intent myIntent = new Intent(home.this, MainActivity.class);
        startActivity(myIntent);}
    else if ("menu".equals(elements[position]))
        {Intent myIntent = new Intent(home.this, MainActivity.class);
        startActivity(myIntent);}
    }
}

