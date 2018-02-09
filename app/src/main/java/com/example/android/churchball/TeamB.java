package com.example.android.churchball;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TeamB extends AppCompatActivity implements TeamBFragment.OnFragmentInteractionListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_layout, TeamBFragment.newInstance(1, "Team B"))
                .commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}