package com.zz.design.single;


public class Singleton8 {

    public static void main(String[] args) {
        Singleton008 instance1 = Singleton008.INSTANCE;
        Singleton008 instance2 = Singleton008.INSTANCE;
        System.out.println(instance1 == instance2);
    }
}


/**
 * 饿汉式  枚举（线程安全的）
 *
 * 1) 这借助JDK1.5中添加的枚举来实现单例模式。不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象。
 * 2) 这种方式是Effective Java作者Josh Bloch 提倡的方式
 * 3) 结论：推荐使用
 *
 */
enum Singleton008 {

    INSTANCE;
    public void say(){
        System.out.println("say hello");
    }

}
