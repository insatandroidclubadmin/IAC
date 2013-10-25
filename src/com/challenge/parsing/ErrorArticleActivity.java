package com.challenge.parsing;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.challenge.iac.R;

public class ErrorArticleActivity extends Activity implements View.OnClickListener{

	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.error_article);
		Button b = (Button)findViewById(R.id.button1);
		
			b.setOnClickListener(this);				

				
				
			}

	@Override
	public void onClick(View v) {
		Intent intent = new Intent(ErrorArticleActivity.this, ArticleList.class);
		startActivity(intent);
		
	}
		
	}
	
	

