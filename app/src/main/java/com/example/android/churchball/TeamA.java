package com.example.android.churchball;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class TeamA extends AppCompatActivity implements TeamAFragment.OnFragmentInteractionListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_layout, TeamAFragment.newInstance(null, null))
                .commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri){

    }
}