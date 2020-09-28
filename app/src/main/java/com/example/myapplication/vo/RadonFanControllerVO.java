package com.example.myapplication.vo;

import java.io.Serializable;
import java.util.Date;

public class RadonFanControllerVO implements Serializable {

    /** Fan Controller Name */
    private String Name;
    /** Fan Controller Speed */
    private int Speed;
    /** Fan Serial Number */
    private String SerialNumber;
    /** Fan Speed Auto Setting */
    private boolean auto;
    //TODO
    /** Fan Start or Stop Time ? */
    private Date Time;

    public RadonFanControllerVO(String name, int speed, String serialNumber, boolean auto) {
        Name = name;
        Speed = speed;
        SerialNumber = serialNumber;
        this.auto = auto;

    }

    public void setName(String name) {
        Name = name;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    public void setSerialNumber(String serialNumber) {
        SerialNumber = serialNumber;
    }

    public void setAuto(boolean auto) {
        this.auto = auto;
    }

    public void setTime(Date time) {
        Time = time;
    }

    public String getName() {
        return Name;
    }

    public int getSpeed() {
        return Speed;
    }

    public String getSerialNumber() {
        return SerialNumber;
    }

    public boolean isAuto() {
        return auto;
    }

    public Date getTime() {
        return Time;
    }
}
