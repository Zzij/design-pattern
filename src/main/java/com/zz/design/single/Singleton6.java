package com.zz.design.single;


public class Singleton6 {

    public static void main(String[] args) {
        Singleton006 instance1 = Singleton006.getInstance();
        Singleton006 instance2 = Singleton006.getInstance();
        System.out.println(instance1 == instance2);
    }
}


/**
 * 饿汉式  双重检查（线程安全的）
 *
 * 1) Double-Check概念是多线程开发中常使用到的，如代码中所示，我们进行了两 次if (singleton == null)检查，这样就可以保证线程安全了。
 * 2) 这样，实例化代码只用执行一次，后面再次访问时，判断if (singleton == null)， 直接return实例化对象，也避免的反复进行方法同步.
 * 3) 线程安全；延迟加载；效率较高
 * 4) 结论：在实际开发中，推荐使用这种单例设计模式

 */
class Singleton006 {

    private static volatile Singleton006 instance;

    private Singleton006(){}

    public static synchronized Singleton006 getInstance(){

        if(instance == null){
            synchronized (Singleton006.class){
                if(instance == null){
                    instance = new Singleton006();
                }
            }
        }
        return instance;
    }

}
