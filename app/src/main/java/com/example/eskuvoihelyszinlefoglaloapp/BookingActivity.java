package com.example.eskuvoihelyszinlefoglaloapp;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class BookingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        String venueName = getIntent().getStringExtra("VENUE_NAME");
        TextView textSelectedVenue = findViewById(R.id.textSelectedVenue);
        textSelectedVenue.setText("Helyszín: " + venueName);
    }
}
