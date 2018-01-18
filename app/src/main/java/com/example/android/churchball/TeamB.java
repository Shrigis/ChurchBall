package com.example.android.churchball;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TeamB extends AppCompatActivity implements TeamAFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new TeamBFragment())
                .commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri){

    }
}