package com.challenge.iac;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.challenge.carousel.Carousel;
import com.challenge.carousel.CarouselAdapter;
import com.challenge.carousel.CarouselAdapter.OnItemClickListener;
import com.challenge.parsing.ArticleList;
import com.challenge.parsing.PalmresActivity;

public class MainActivity extends Activity {
	/** Called when the activity is first created. */

	Intent Atelier;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		Carousel carousel = (Carousel) findViewById(R.id.carousel);
		carousel.setOnItemClickListener(new OnItemClickListener() {

			public void onItemClick(CarouselAdapter<?> parent, View view,
					int position, long id) {

				switch (position) {
				case 0:
					try {
						Atelier = new Intent(MainActivity.this,
								IACActivity.class);
						break;
					} catch (Exception e) {
						Toast.makeText(MainActivity.this, "Desol�",
								Toast.LENGTH_SHORT).show();
					}

				case 1:
					try {
						Atelier = new Intent(MainActivity.this,
								ArticleList.class);
						break;
					} catch (Exception e) {
						Toast.makeText(MainActivity.this, "Desole",
								Toast.LENGTH_SHORT).show();
					}

				case 2:
					try {
						Atelier = new Intent(MainActivity.this,
								AtelierActivity.class);
						break;
					} catch (Exception e) {
						Toast.makeText(MainActivity.this, "Desole",
								Toast.LENGTH_SHORT).show();
					}
				case 3:
					try {
						Atelier = new Intent(MainActivity.this,
								ContactActivity.class);
						break;
					} catch (Exception e) {
						Toast.makeText(MainActivity.this, "Desole",
								Toast.LENGTH_SHORT).show();
					}
				case 4:
					try {
						Atelier = new Intent(MainActivity.this,
								GalleryActivity.class);
						break;
					} catch (Exception e) {
						Toast.makeText(MainActivity.this, "Desole",
								Toast.LENGTH_SHORT).show();
					}

				case 5:
					try {
						Atelier = new Intent(MainActivity.this,
								MagActivity.class);
						break;
					} catch (Exception e) {
						Toast.makeText(MainActivity.this, "Desole",
								Toast.LENGTH_SHORT).show();
					}
				case 6:
					try {
						Atelier = new Intent(MainActivity.this,
								PalmresActivity.class);
						break;
					} catch (Exception e) {
						Toast.makeText(MainActivity.this, "Desole",
								Toast.LENGTH_SHORT).show();
					}

				}
				startActivity(Atelier);
			}

			// }

		});
	}

	// carousel.setOnItemSelectedListener(new OnItemSelectedListener(){

	// public void onItemSelected(CarouselAdapter<?> parent, View view,
	// int position, long id) {

	// final TextView txt = (TextView)(findViewById(R.id.selected_item));

	public void onNothingSelected(CarouselAdapter<?> parent) {

	}

}
