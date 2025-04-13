package com.example.eskuvoihelyszinlefoglaloapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class VenueActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venue);

        RecyclerView recyclerView = findViewById(R.id.recyclerViewVenues);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Mintaadatok a helyszínekhez
        List<Venue> venues = new ArrayList<>();
        venues.add(new Venue("Rózsakert", R.drawable.rozsakert, "Budapest, Rózsakert utca 5"));
        venues.add(new Venue("Aranyhal tó", R.drawable.aranyhalto, "Szeged, Tisza Lajos utca 10"));
        venues.add(new Venue("Kalocsai Kastély", R.drawable.kalocsai_kastely, "Kalocsa, Kastély utca 2"));
        venues.add(new Venue("Duna Palota", R.drawable.duna_palota, "Budapest, Duna korzó 10"));

        VenueAdapter adapter = new VenueAdapter(venues, this);
        recyclerView.setAdapter(adapter);
    }
}
