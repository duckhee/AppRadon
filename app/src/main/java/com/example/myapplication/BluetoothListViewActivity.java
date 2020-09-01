package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class BluetoothListViewActivity extends AppCompatActivity {
    /** variable ListView */
    ListView listView;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bluetooth_list_view);
        intent = getIntent();
    }

    public void ViewBackMove(View view) {
        this.finish();
    }
}