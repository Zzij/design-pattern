package com.zz.design.adapter.classadapter;

public class VoltageAdapter extends Voltage220 implements Voltage5 {
    @Override
    public int output5V() {
        int dst = output220() / 44;
        return dst;
    }
}
