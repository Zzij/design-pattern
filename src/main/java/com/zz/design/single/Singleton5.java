package com.zz.design.single;


public class Singleton5 {

    public static void main(String[] args) {
        Singleton005 instance1 = Singleton005.getInstance();
        Singleton005 instance2 = Singleton005.getInstance();
        System.out.println(instance1 == instance2);
    }
}


/**
 * 饿汉式（线程不安全的）
 *
 * 1) 这种方式，本意是想对第四种实现方式的改进，因为前面同步方法效率太低， 改为同步产生实例化的的代码块
 * 2) 但是这种同步并不能起到线程同步的作用。跟第3种实现方式遇到的情形一 致，
 *      假如一个线程进入了if (singleton == null)判断语句块，还未来得及往下执行，
 *      另一个线程也通过了这个判断语句，这时便会产生多个实例
 * 3) 结论：在实际开发中，不能使用这种方式

 */
class Singleton005 {

    private static Singleton005 instance;

    private Singleton005(){}

    public static synchronized Singleton005 getInstance(){

        if(instance == null){
            synchronized (Singleton005.class){
                instance = new Singleton005();
            }
        }
        return instance;
    }

}
