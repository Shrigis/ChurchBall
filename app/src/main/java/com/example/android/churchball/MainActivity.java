package com.example.android.churchball;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_team);

        // Find the view pager that will allow the user to swipe between fragments
        final ViewPager viewPager = findViewById(R.id.viewPager);

        // Create an adapter that knows which fragment should be shown on each page
        SimpleFragmentPagerAdapter adapter = new SimpleFragmentPagerAdapter(getSupportFragmentManager());

        final Button teamAButton = findViewById(R.id.team_a_button);
        teamAButton.setSelected(true);
        teamAButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(0, true);
            }
        });

        final Button teamBButton = findViewById(R.id.team_b_button);
        teamBButton.setSelected(false);
        teamBButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(1, true);
            }
        });

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        teamAButton.setSelected(true);
                        teamBButton.setSelected(false);
                        break;
                    case 1:
                        teamBButton.setSelected(true);
                        teamAButton.setSelected(false);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }
}

