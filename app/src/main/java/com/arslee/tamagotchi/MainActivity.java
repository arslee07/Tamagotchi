package com.arslee.tamagotchi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    SharedPreferences general_prefs;
    ArrayList<Tamagotchi> t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        general_prefs = getSharedPreferences("general", MODE_PRIVATE);

        int lastID = general_prefs.getInt("lastCreatedTamagotchiID", 0);
        t = new ArrayList<>(lastID);

        for(int i = 0; i < lastID+1; i++) {
            SharedPreferences tPrefs = getSharedPreferences("tamagotchi" + i, MODE_PRIVATE);
            t.add(new Tamagotchi(i, tPrefs));
        }
    }
}