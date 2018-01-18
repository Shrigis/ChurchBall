package com.example.android.churchball;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TeamA extends AppCompatActivity implements TeamAFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new TeamAFragment())
                .commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri){

    }
}