package com.zz.design.factory.abstractfactory.pizza;

public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("LD奶酪pizza");
    }
}
