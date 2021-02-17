package com.zz.design.adapter.objectadapter;


public class Phone {

    public void charging(IVoltage5 voltage5){
        if(voltage5.output5() == 5){
            System.out.println("电压5v可以充电");
        }else{
            System.out.println("电压不对 不能充电");
        }

    }
}
