package com.example.myapplication;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.myapplication.vo.RadonFanControllerVO;

import java.util.List;

public class BluetoothListAdapter extends BaseAdapter {

    Context context;

    int LayoutRes;

    List<RadonFanControllerVO> list;

    LayoutInflater inflater;


    public BluetoothListAdapter(Context context, int layoutRes, List<RadonFanControllerVO> list) {
        this.context = context;
        LayoutRes = layoutRes;
        this.list = list;

        inflater = LayoutInflater.from(context);
    }

    /** get list Item Number */
    @Override
    public int getCount() {
        return list.size();
    }

    /** get List Item Object Value */
    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    /** get List Item Index */
    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Log.e("getView()", "position : "+i);
        if(view == null){
            view = inflater.inflate(LayoutRes, viewGroup, false);
            Log.e("getView()", "convertView == null");
        }
        /** get Serial number textView */
        TextView textView = (TextView)view.findViewById(R.id.productSerial);
        /** get Object Stetting */
        RadonFanControllerVO dto = list.get(i);
        /** textView set Serial Number */
        textView.setText(dto.getSerialNumber());
        return view;
    }
}
