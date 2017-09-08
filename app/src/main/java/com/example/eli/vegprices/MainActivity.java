package com.example.eli.vegprices;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;
import android.util.Log;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView mListView;
    private static final String TAG = "log_massage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "MainActivity:: onCreate  1");
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.lvAllVegs);
        Veg.Init();

        ArrayList<Veg> vegList = Veg.getDummyVegs("recipes.json", this);

        AllVegAdapter adapter = new AllVegAdapter(this,vegList );
        mListView.setAdapter(adapter);

        Log.i(TAG, "MainActivity:: onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "MainActivity::  onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "MainActivity::  onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "MainActivity::  onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "MainActivity::  onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "MainActivity::  onResume");
    }

//test 1 rami push
////test2
}