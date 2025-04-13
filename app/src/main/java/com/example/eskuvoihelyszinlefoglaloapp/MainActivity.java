package com.example.eskuvoihelyszinlefoglaloapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final int SECRET_KEY = 99;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);;
    }

    public void navigate_to_register(View view) {
        Intent intent = new Intent(this, RegisterActivity.class);
        intent.putExtra("SECRET_KEY", SECRET_KEY);
        startActivity(intent);
    }

    public void navigate_to_login(View view) {
        Intent intent = new Intent(this, loginActivity.class);
        intent.putExtra("SECRET_KEY", SECRET_KEY);
        startActivity(intent);
    }

    public void navigate_to_venues(View view) {
        Intent intent = new Intent(this, VenueActivity.class);
        startActivity(intent);
    }

}

