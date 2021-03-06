package com.zz.design.factory.abstractfactory.pizza;

/**
 * 看一个披萨的项目：要便于披萨种类的扩展，要便于维护
 * 1) 披萨的种类很多(比如 GreekPizz、CheesePizz 等)
 * 2) 披萨的制作有 prepare，bake, cut, box 3) 完成披萨店订购功能。
 */
public abstract class Pizza {

    protected String name;

    public abstract void prepare();

    public void bake(){
        System.out.println(name + " baking");
    }

    public void cut(){
        System.out.println(name + " cutting");
    }

    public void box(){
        System.out.println(name + " box");
    }

    public void setName(String name) {
        this.name = name;
    }
}
