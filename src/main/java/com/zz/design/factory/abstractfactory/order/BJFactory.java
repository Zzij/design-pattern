package com.zz.design.factory.abstractfactory.order;

import com.zz.design.factory.abstractfactory.pizza.BJCheesePizza;
import com.zz.design.factory.abstractfactory.pizza.BJGreekPizza;
import com.zz.design.factory.abstractfactory.pizza.Pizza;

public class BJFactory implements AbstractFactory {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("greek")){
            pizza = new BJGreekPizza();
        }else if(type.equals("cheese")){
            pizza = new BJCheesePizza();
        }
        return pizza;
    }
}
