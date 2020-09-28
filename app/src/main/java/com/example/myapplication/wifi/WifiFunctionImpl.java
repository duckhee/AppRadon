package com.example.myapplication.wifi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;

import java.util.List;

public class WifiFunctionImpl implements WifiFunction {

    private WifiManager wifiManager;

    private BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            final String action = intent.getAction();
            if(action.equals(wifiManager.SCAN_RESULTS_AVAILABLE_ACTION)){
                wifiManager.startScan();
            }else if(action.equals(wifiManager.NETWORK_STATE_CHANGED_ACTION)){

            }
        }
    };

    @Override
    public List<String> Scan(Context context) {
        wifiManager = (WifiManager)context.getSystemService(Context.WIFI_SERVICE);
        return null;
    }


}
