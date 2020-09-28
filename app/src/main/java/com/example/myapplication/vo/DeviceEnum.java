package com.example.myapplication.vo;

public enum DeviceEnum {

    RADONFANCONTROLLER("RadonFanController"),
    RADONCOUBE("RadonCube");

    private String StrValue;

    DeviceEnum(String StrValue){
        this.StrValue = StrValue;
    }

    public void SetStrValue(String Value){
        this.StrValue = Value;
    }

    public String GetStrValue(){
        return StrValue;
    }

}
