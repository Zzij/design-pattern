package com.zz.design.adapter.interfaceadapter;


/**
 * 抽象方法默认实现 接口方法，具体的类需要，再去重写对应方法
 */
public abstract class AbstractListener implements IListener {

    @Override
    public void listener1() {
        System.out.println("默认实现listener1");
    }

    @Override
    public void listener2() {
        System.out.println("默认实现listener2");
    }

    @Override
    public void listener3() {
        System.out.println("默认实现listener3");
    }

    @Override
    public void listener4() {
        System.out.println("默认实现listener4");
    }
}
