package com.challenge.iac;


import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class SplashScreen extends Activity {
	ImageView splash;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_screen);
		splash = (ImageView) findViewById(R.id.logo);
		splash.setImageBitmap(null);
		splash.setBackgroundResource(R.anim.anim_splash);
		final AnimationDrawable Animation = (AnimationDrawable) splash
				.getBackground();
		splash.post(new Runnable() {
			public void run() {
				if (Animation != null)
					Animation.start();
			}
		});
		splash.postDelayed(new Runnable() {

			@Override
			public void run() {
				Animation.stop();
				SplashScreen.this.finish();
				Intent mainMenu = new Intent(SplashScreen.this, MainActivity.class);
				startActivity(mainMenu);
			}
		}, 3050);
	}
}
