package com.zz.design.single;


public class Singleton4 {

    public static void main(String[] args) {
        Singleton004 instance1 = Singleton004.getInstance();
        Singleton004 instance2 = Singleton004.getInstance();
        System.out.println(instance1 == instance2);
    }
}


/**
 * 饿汉式（线程安全的）
 *
 * 1) 解决了线程不安全问题
 * 2) 效率太低了，每个线程在想获得类的实例时候，执行getInstance()方法都要进行同步。
 *       而其实这个方法只执行一次实例化代码就够了，后面的想获得该类实例， 直接return就行了。方法进行同步效率太低
 * 3) 结论：在实际开发中，不推荐使用这种方式

 */
class Singleton004 {

    private static Singleton004 instance;

    private Singleton004(){}

    public static synchronized Singleton004 getInstance(){

        if(instance == null){
            instance = new Singleton004();
        }
        return instance;
    }

}
