package com.example.myapplication.ble;

import java.util.List;

public interface BlueToothFunction {
    
    /** Blue tooth Connection */
    public boolean BLEConnection(BluetoothVO device);
    /** Blue tooth disconnection */
    public boolean BLEDisConnection(BluetoothVO device);
    /** Blue tooth list */
    public List<BluetoothVO> GetBLEList();
    /** Blue tooth get Information */
    public BluetoothVO GetBleInfo(BluetoothVO device);



}
