package com.zz.design.factory.simple;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("GreekPizza 准备中");
    }
}
