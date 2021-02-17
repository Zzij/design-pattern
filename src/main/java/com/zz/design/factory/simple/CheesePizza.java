package com.zz.design.factory.simple;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("这是奶酪披萨，准备中");
    }
}
