package com.zz.design.factory.abstractfactory.order;

import com.zz.design.factory.abstractfactory.pizza.LDCheesePizza;
import com.zz.design.factory.abstractfactory.pizza.LDGreekPizza;
import com.zz.design.factory.abstractfactory.pizza.Pizza;

public class LDFactory implements AbstractFactory {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("greek")){
            pizza = new LDGreekPizza();
        }else if(type.equals("cheese")){
            pizza = new LDCheesePizza();
        }
        return pizza;
    }
}
