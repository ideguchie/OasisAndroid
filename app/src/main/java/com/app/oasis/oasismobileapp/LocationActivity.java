package com.app.oasis.oasismobileapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class LocationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_location, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            case R.id.action_settings:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    //Called when Renton button is clicked to open Renton Activity
    public void openRenton(View view) {
        Intent intent = new Intent(this, RentonActivity.class);
        startActivity(intent);
    }

    //Called when Seattle button is clicked to open Seattle Activity
    public void openSeattle(View view) {
        Intent intent = new Intent(this, SeattleActivity.class);
        startActivity(intent);
    }

    //Called when UW button is clicked to open UW Activity
    public void openUW(View view) {
        Intent intent = new Intent(this, UWActivity.class);
        startActivity(intent);
    }

}
