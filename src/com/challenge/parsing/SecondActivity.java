package com.challenge.parsing;

import java.util.HashMap;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.challenge.iac.R;

public class SecondActivity extends Activity {

	static final String KEY_ID = "id";
	static final String KEY_TITLE = "title";
	static final String KEY_ARTIST = "artist";
	static final String KEY_DURATION = "duration";
	static final String KEY_THUMB_URL = "thumb_url";
	private HashMap<String, String> map;
	private ImageLoader imageLoader;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		 imageLoader=new ImageLoader(this.getApplicationContext());
		map=(HashMap)getIntent().getSerializableExtra("map");
		TextView Title = (TextView) findViewById(R.id.textView1);
		TextView Content = (TextView) findViewById(R.id.textView2);
		Title.setText(map.get(KEY_TITLE));
		Content.setText(map.get(KEY_ARTIST));
		
		//ImageView thumb_image1=(ImageView)findViewById(R.id.list_image1); // thumb image
		 
		 //imageLoader.DisplayImage(song.get(CustomizedListView.KEY_THUMB_URL), thumb_image1);
	}
	
}
