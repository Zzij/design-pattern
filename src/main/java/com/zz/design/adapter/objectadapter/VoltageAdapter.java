package com.zz.design.adapter.objectadapter;

public class VoltageAdapter implements IVoltage5 {

    private Voltage220 voltage220;

    public VoltageAdapter(Voltage220 voltage220) {
        this.voltage220 = voltage220;
    }

    @Override
    public int output5() {
        return voltage220.output220() / 44;
    }
}
