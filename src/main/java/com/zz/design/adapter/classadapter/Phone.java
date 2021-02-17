package com.zz.design.adapter.classadapter;

public class Phone {

    public void charging(Voltage5 voltage5){
        if(voltage5.output5V() == 5){
            System.out.println("电压5v可以充电");
        }else{
            System.out.println("电压不对 不能充电");
        }

    }
}
