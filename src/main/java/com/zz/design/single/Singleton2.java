package com.zz.design.single;

public class Singleton2 {

    public static void main(String[] args) {
        Singleton002 instance1 = Singleton002.getInstance();
        Singleton002 instance2 = Singleton002.getInstance();
        System.out.println(instance1 == instance2);
    }
}


/**
 * 饿汉式（静态代码块）
 *
 * 1) 这种方式和上面的方式其实类似，只不过将类实例化的过程放在了静态代码块 中，
 *      也是在类装载的时候，就执行静态代码块中的代码，初始化类的实例。优 缺点和上面是一样的。 (同静态变量一样)
 * 2) 结论：这种单例模式可用，但是可能造成内存浪费

 */
class Singleton002 {

    private static Singleton002 instance;

    static {
        instance = new Singleton002();
    }

    private Singleton002(){}

    public static Singleton002 getInstance(){
        return instance;
    }

}
