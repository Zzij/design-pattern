package com.zz.design.factory.abstractfactory.order;

import com.zz.design.factory.abstractfactory.pizza.Pizza;

public interface AbstractFactory {

    Pizza createPizza(String type);
}
