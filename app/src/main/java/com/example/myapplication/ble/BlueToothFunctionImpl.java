package com.example.myapplication.ble;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.widget.ArrayAdapter;


import java.util.List;
import java.util.Set;


public class BlueToothFunctionImpl implements BlueToothFunction{

    private ArrayAdapter arrayAdapter;
    /** Check bluetooth support */
    private BluetoothAdapter BleAdapter = BluetoothAdapter.getDefaultAdapter();
    @Override
    public boolean BLEConnection(BluetoothVO device) {
        return false;
    }

    @Override
    public boolean BLEDisConnection(BluetoothVO device) {
        return false;
    }

    @Override
    public List<BluetoothVO> GetBLEList() {
        /** Bluetooth using possible Test */
        if(BleAdapter == null || !BleAdapter.isEnabled()){
            System.out.println("BLUE Tooth Function :::: can not using bluetooth");
            return null;
        }

        return null;
    }

    @Override
    public BluetoothVO GetBleInfo(BluetoothVO device) {

        return null;
    }
}
