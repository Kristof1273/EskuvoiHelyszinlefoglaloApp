package com.example.eskuvoihelyszinlefoglaloapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class loginActivity extends AppCompatActivity {
    private static final int SECRET_KEY = 99;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Bundle bundle = getIntent().getExtras();
        int secret_key = bundle.getInt("SECRET_KEY");
        if(secret_key!=99){
            finish();
        }
    }

    public void navigate_to_register(View view) {
        Intent intent = new Intent(this, RegisterActivity.class);
        intent.putExtra("SECRET_KEY",SECRET_KEY);
        startActivity(intent);
    }


    public void login(View view) {

    }

    public void google_login(View view) {

    }

    public void guest_login(View view) {
    }

}
