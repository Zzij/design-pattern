package com.zz.design.factory.abstractfactory.pizza;

public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("bj奶酪pizza准备中");
    }
}
