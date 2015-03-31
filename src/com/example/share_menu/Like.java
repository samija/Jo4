package com.example.share_menu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebView;



public class Like extends Activity {
	 
    private WebView webView;
 
    public void onCreate(Bundle savedInstanceState) {
 
        super.onCreate(savedInstanceState);
        setContentView(R.layout.likeview);
 
        webView = (WebView) findViewById(R.id.webView);	     
webView.getSettings().setJavaScriptEnabled(true);	 
        webView.loadUrl("https://www.facebook.com/Jofour");
    }
	
@Override
public boolean onCreateOptionsMenu(Menu menu)
{
    MenuInflater menuInflater = getMenuInflater();
    menuInflater.inflate(R.layout.menu, menu);
    return true;
}
 
}