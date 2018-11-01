package com.tutorialwing.androidfacebooksharemediatutorial;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.facebook.share.Share;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		addShareMediaFragment();

		//Code to show functionality to share media in activity.
		Button showActivity = findViewById(R.id.startActivity);
		showActivity.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(MainActivity.this, ShareMediaActivity.class));
			}
		});
	}

	private void addShareMediaFragment() {
		FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
		fragmentTransaction.add(R.id.facebook_share_button, new ShareMediaFragment());
		fragmentTransaction.commit();
	}
}
