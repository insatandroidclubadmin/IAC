package com.challenge.iac;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;



public class PDFActivity extends Activity {
	WebView gdocs;
	String URLmag;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Bundle extras = getIntent().getExtras();
		URLmag = extras.getString("maglink");
		setContentView(R.layout.pdf);		
		gdocs = (WebView)findViewById(R.id.gdocs);
		gdocs.getSettings().setJavaScriptEnabled(true);
		gdocs.loadUrl("http://docs.google.com/viewer?url="+URLmag);
	}
}
