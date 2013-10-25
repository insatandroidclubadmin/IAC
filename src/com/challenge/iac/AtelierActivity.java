package com.challenge.iac;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.challenge.iac.R;

public class AtelierActivity extends Activity {
	ImageView javasdk, reseau, webmobile, gaming, robotique;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		try {
			super.onCreate(savedInstanceState);

			setContentView(R.layout.atelier);
			javasdk = (ImageView) findViewById(R.id.javasdk);
			reseau = (ImageView) findViewById(R.id.reseau);
			webmobile = (ImageView) findViewById(R.id.webmobile);
			gaming = (ImageView) findViewById(R.id.gaming);
			robotique = (ImageView) findViewById(R.id.robotique);
		} catch (Exception e) {
			Toast.makeText(getApplicationContext(), "des donnees",
					Toast.LENGTH_SHORT).show();
		}
	}

	public void atelier(View v) {
		TextView java = (TextView) findViewById(R.id.atelierjava);
		TextView gaaming = (TextView) findViewById(R.id.ateliergaming);
		TextView web = (TextView) findViewById(R.id.atelierwebmobile);
		TextView reso = (TextView) findViewById(R.id.atelierreseau);
		TextView robo = (TextView) findViewById(R.id.atelierrobotique);
		switch (v.getId()) {
		case R.id.javasdk:
			java.setVisibility(TextView.VISIBLE);
			robo.setVisibility(TextView.INVISIBLE);
			web.setVisibility(TextView.INVISIBLE);
			reso.setVisibility(TextView.INVISIBLE);
			gaaming.setVisibility(TextView.INVISIBLE);
			break;
		case R.id.reseau:
			java.setVisibility(TextView.INVISIBLE);
			robo.setVisibility(TextView.INVISIBLE);
			web.setVisibility(TextView.INVISIBLE);
			reso.setVisibility(TextView.VISIBLE);
			gaaming.setVisibility(TextView.INVISIBLE);
			break;
		case R.id.gaming:
			java.setVisibility(TextView.INVISIBLE);
			robo.setVisibility(TextView.INVISIBLE);
			web.setVisibility(TextView.INVISIBLE);
			reso.setVisibility(TextView.INVISIBLE);
			gaaming.setVisibility(TextView.VISIBLE);
			break;
		case R.id.webmobile:
			java.setVisibility(TextView.INVISIBLE);
			robo.setVisibility(TextView.INVISIBLE);
			web.setVisibility(TextView.VISIBLE);
			reso.setVisibility(TextView.INVISIBLE);
			gaaming.setVisibility(TextView.INVISIBLE);
			break;
		case R.id.robotique:
			java.setVisibility(TextView.INVISIBLE);
			robo.setVisibility(TextView.VISIBLE);
			web.setVisibility(TextView.INVISIBLE);
			reso.setVisibility(TextView.INVISIBLE);
			gaaming.setVisibility(TextView.INVISIBLE);
			break;
		}
	}

}
