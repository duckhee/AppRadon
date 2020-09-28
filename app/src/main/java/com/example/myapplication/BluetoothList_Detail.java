package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.vo.RadonFanControllerVO;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BluetoothList_Detail extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    /** Device Name Filed variable */
    TextView deviceName;
    /** Wifi List Spinner */
    Spinner spinner;
    /** Wifi List Spinner Adapter */
    ArrayAdapter arrayAdapter;
    /** Wifi List Set Variable */
    List list;
    /** selected wifi name */
    String wifiName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bluetoothlist__detail);
        /** get before Activity info */
        Intent intent = getIntent();
        /** get Device Info */
        RadonFanControllerVO radonFanControllerVO = (RadonFanControllerVO)intent.getSerializableExtra("dto");
        /** get Device Detail View Device Name Filed */
        deviceName = (TextView)findViewById(R.id.DeviceDetailName);
        deviceName.setText(radonFanControllerVO.getSerialNumber());
        /** get Sample List */
        list = Sample();
        /** get Wifi List Spinner */
        spinner = (Spinner)findViewById(R.id.WifiSettingId);
        /** make new adapter select box wifi list select box */
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        /** set select box drop down style */
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        /** spinner add wifi list */
        spinner.setAdapter(arrayAdapter);
        /** select spinner item event registe */
        spinner.setOnItemSelectedListener(this);

    }


    private List<String> Sample(){
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("wifi name1");
        arrayList.add("wifi name2");
        arrayList.add("wifi name3");
        arrayList.add("wifi name4");
        arrayList.add("wifi name5");
        arrayList.add("wifi name6");
        arrayList.add("wifi name7");


        return  arrayList;

    }
    /** Back to the Activity */
    public void ViewBackMove(View view) {
        this.finish();
    }

    public void SettingBtnClick(View view){
        if(wifiName != null) {
            /** get wifi setting password */
            EditText WifiSettingPw = (EditText) findViewById(R.id.WifiSettingPw);
            /** get now intent activity */
            Intent intent = getIntent();
            /** send wifi name */
            intent.putExtra("ssid", wifiName);
            /** send Password */
            intent.putExtra("password", WifiSettingPw.getText());

            setResult(RESULT_OK, intent);
            this.finish();
        }else{
            Toast.makeText(this, "Select Wifi First", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        /** get select position spinner data */
        wifiName = adapterView.getItemAtPosition(i).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        wifiName = "";
    }
}