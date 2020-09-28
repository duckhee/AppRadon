package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.myapplication.vo.RadonFanControllerVO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BluetoothListViewActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemClickListener {
    /** variable ListView */
    ListView listView;
    /** Custom Adapter */
    BluetoothListAdapter bluetoothListAdapter;
    List<RadonFanControllerVO> lists;
    /** Intent setting done */
    Intent intent;
    String ssid = "";
    String pw = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bluetooth_list_view);
        listView = (ListView)findViewById(R.id.BluetoothList);
        /** make Sample List */
        lists = Sample();
        /** Custom Adapter View */
        bluetoothListAdapter = new BluetoothListAdapter(this, R.layout.bluetoothlist_cell, lists);
        /** listView Type custom */
        listView.setAdapter(bluetoothListAdapter);
        listView.setOnItemClickListener(this);
        intent = getIntent();
        ssid = intent.getStringExtra("ssid");
        pw = intent.getStringExtra("password");
        System.out.println("test ssid ::::::: "+ssid);
        System.out.println("test pw ::::::: "+pw);
        if(ssid != null || pw != null){
            Toast.makeText(this, "ssid : " + ssid + ", pw : " + pw, Toast.LENGTH_SHORT).show();
            finish();
        }

    }

    /** this is back main activity */
    public void ViewBackMove(View view) {
        /** Activity finish */
        this.finish();
    }

    /** click Event */
    @Override
    public void onClick(View view) {

    }

    public List<RadonFanControllerVO> Sample(){
        ArrayList<RadonFanControllerVO> list = new ArrayList<>();

        list.add(new RadonFanControllerVO("test", 1, "test", false));
        list.add(new RadonFanControllerVO("test", 1, "test", false));
        list.add(new RadonFanControllerVO("test", 1, "test", false));
        list.add(new RadonFanControllerVO("test", 1, "test", false));
        list.add(new RadonFanControllerVO("test", 1, "test", false));
        list.add(new RadonFanControllerVO("test", 1, "test", false));
        list.add(new RadonFanControllerVO("test", 1, "test", false));
        list.add(new RadonFanControllerVO("test", 1, "test", false));
        list.add(new RadonFanControllerVO("test", 1, "test", false));
        list.add(new RadonFanControllerVO("test", 1, "test", false));
        list.add(new RadonFanControllerVO("test", 1, "test", false));

        return list;

    }

    /** listView Item click moving Detail View */
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int index, long id) {
        Toast.makeText(this, "Item Click " + index, Toast.LENGTH_SHORT).show();
        /** get Item RadonFanControllerVo Object */
        RadonFanControllerVO radonFanControllerVO = lists.get(index);
        /** Make Intent Object set BluetoothList Detail Activity */
        Intent intent = new Intent(this, BluetoothList_Detail.class);
        /** Intent add Data Object */
        intent.putExtra("dto",  radonFanControllerVO);
        /** moving view */
        startActivityForResult(intent, 1234);
        //finish();

    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1234 && resultCode == RESULT_OK){
            Toast.makeText(this, "test", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "test", Toast.LENGTH_SHORT).show();
        }
    }
}