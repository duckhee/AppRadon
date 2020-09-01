package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /** Get Button Object */
    //Button ConnBle;
    //Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /** Get View Value */
        Button ConnBle = (Button)findViewById(R.id.BtnConBle);
        Button Login = (Button)findViewById((R.id.BtnLogin));
        /** Click listener add */
        ConnBle.setOnClickListener(this);
        Login.setOnClickListener(this);
    }

    /** Click Event Listener */
    @Override
    public void onClick(View view) {
        /** Get Button Click Id */
        int Btn = view.getId();
        switch(Btn){
            /** moving Bluetooth Device Search List Intent */
            case R.id.BtnConBle:
                Toast.makeText(this, "Conn Ble Click", Toast.LENGTH_SHORT).show();
                Intent ConBle = new Intent(this, BluetoothListViewActivity.class);
                startActivity(ConBle);
                break;
            /** moving Login Page Intent */
            case R.id.BtnLogin:
                Toast.makeText(this, "Login Click", Toast.LENGTH_SHORT).show();
                break;
            /** Message Alert Wrong Click */
            default:
                Toast.makeText(this, "wrong Click", Toast.LENGTH_SHORT).show();
        }
    }
}