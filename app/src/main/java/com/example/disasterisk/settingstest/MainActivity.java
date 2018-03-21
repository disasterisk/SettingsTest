package com.example.disasterisk.settingstest;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        boolean result = true;
        switch (item.getItemId()){
            case R.id.settings:
                Intent intent = new Intent(this, preferences.class);
                this.startActivity(intent);
                break;
            case R.id.about:
                readSettings();
                break;
            default:
                result = false;
                break;
        }
        return result;
    }
    public void readSettings() {
        //read the value (stored in key value pair)
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        String setting1 = prefs.getString("prefName", "Person A");

        Toast.makeText(this, setting1, Toast.LENGTH_LONG).show();

    }
}
