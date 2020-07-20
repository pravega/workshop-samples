package com.dellemc.oe.readers.model;

import org.apache.flink.table.shaded.org.joda.time.DateTime;
//import org.joda.time.DateTime;

import java.io.Serializable;

public class HvacData implements Serializable {
    // BuildingID,BuildingMgr,BuildingAge,HVACproduct,Country
    // Building_ID,DateTime,TargetTemp,ActualTemp,System,SystemAge
   // org.apache.flink.table.shaded.org.joda.time.DateTime, TargetTemp , ActualTemp,SystemAge,Building_ID ,  (TargetTemp - ActualTemp )  as diff , (CASE WHEN (TargetTemp-ActualTemp)>5 THEN 'HOT' WHEN (TargetTemp-ActualTemp)<-5 THEN 'COLD' ELSE 'NORMAL' END) AS temp_range,(CASE WHEN (TargetTemp-ActualTemp)>5 THEN 1 WHEN (TargetTemp-ActualTemp)<-5 THEN 1 ELSE 0 END) AS extreme_temp
    public String DateTime;
    public int TargetTemp;
    public int ActualTemp;
    //public int System;
    public int SystemAge;
    public int Building_ID;
    public int diff;
    public String temp_range;
    public int extreme_temp;


    @Override
    public String toString() {
        return "HvacData{" +
                "DateTime='" + DateTime + '\'' +
                ", TargetTemp='" + TargetTemp + '\'' +
                ", ActualTemp='" + ActualTemp + '\'' +
               // ", System='" + System + '\'' +
                ", SystemAge='" + SystemAge + '\'' +
                ", Building_ID='" + Building_ID + '\'' +
                ", diff='" + diff + '\'' +
                ", temp_range='" + temp_range + '\'' +
                ", extreme_temp='" + extreme_temp + '\'' +
                '}';
    }
}
