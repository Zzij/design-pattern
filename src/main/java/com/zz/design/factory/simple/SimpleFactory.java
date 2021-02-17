package com.zz.design.factory.simple;


/**
 * 简单工厂类
 */
public class SimpleFactory {

    public Pizza createPizza(String type){

        System.out.println("简单工厂类");
        Pizza pizza = null;

        if ("greek".equals(type)) {
            pizza = new GreekPizza();
        }else if("cheese".equals(type)){
            pizza = new CheesePizza();
        }
        return pizza;
    }
}
