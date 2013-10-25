package com.challenge.iac;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.challenge.parsing.ImageAdapter;

public class GalleryActivity extends Activity {
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.gallerie);

    ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
    ImageAdapter adapter = new ImageAdapter(this);
    viewPager.setAdapter(adapter);
  }

  
}
