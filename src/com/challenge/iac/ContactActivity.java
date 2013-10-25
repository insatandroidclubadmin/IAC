package com.challenge.iac;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class ContactActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.contact);
		
		ImageButton siteweb = (ImageButton) findViewById(R.id.siteweb);
		siteweb.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(Intent.ACTION_VIEW);
				Uri u = Uri.parse("http://www.androidinsatclub.org");
				i.setData(u);
				startActivity(i);
			}
		});
		
		ImageButton facebook = (ImageButton) findViewById(R.id.facebook);
		facebook.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(Intent.ACTION_VIEW);
				Uri u = Uri.parse("http://www.facebook.com/CLUB.ANDROID.INSAT");
				i.setData(u);
				startActivity(i);
			}
		});
		
		ImageButton twitter = (ImageButton) findViewById(R.id.twitter);
		twitter.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(Intent.ACTION_VIEW);
				Uri u = Uri.parse("http://www.twitter.com/IAC_INSAT");
				i.setData(u);
				startActivity(i);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.contact, menu);
		return true;
	}

}
