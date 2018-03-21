package com.example.disasterisk.settingstest;

import android.os.Bundle;
import android.app.Activity;
import android.preference.PreferenceActivity;
import android.view.Menu;

public class preferences extends PreferenceActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

}
