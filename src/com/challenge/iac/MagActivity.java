package com.challenge.iac;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;


public class MagActivity extends Activity implements OnClickListener {
	String[] mag = { "2011-2012/magazines/issue01.pdf",
			"2011-2012/magazines/issue02.pdf",
			"2011-2012/magazines/specialissue01.pdf",
			"2012-2013/magazines/IAC-MAG-JANV-2013.pdf" };
	ImageView mag1, mag2, mag3, mag4;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mag);
		mag1 = (ImageView) findViewById(R.id.mag1);
		mag2 = (ImageView) findViewById(R.id.mag2);
		mag3 = (ImageView) findViewById(R.id.mag3);
		mag4 = (ImageView) findViewById(R.id.mag4);
		mag1.setOnClickListener(this);
		mag2.setOnClickListener(this);
		mag3.setOnClickListener(this);
		mag4.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		String maglink = "http://insatandroidclub.org/downloads/";
		switch (v.getId()) {
		case R.id.mag1:
			maglink += mag[0];
			break;
		case R.id.mag2:
			maglink += mag[1];
			break;
		case R.id.mag3:
			maglink += mag[2];
			break;
		case R.id.mag4:
			maglink += mag[3];
			break;
		}
		Intent i = new Intent(MagActivity.this, PDFActivity.class);
		i.putExtra("maglink", maglink);
		startActivity(i);
	}
}
