package com.zz.design.adapter.interfaceadapter;

public class Client {
    public static void main(String[] args) {
        AbstractListener abstractListener = new AbstractListener() {
            @Override
            public void listener1() {
                System.out.println("自定义的listener1");
            }
        };

        abstractListener.listener1();
        abstractListener.listener2();
    }
}
