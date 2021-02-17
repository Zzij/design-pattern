package com.zz.design.single;


public class Singleton3 {

    public static void main(String[] args) {
        Singleton003 instance1 = Singleton003.getInstance();
        Singleton003 instance2 = Singleton003.getInstance();
        System.out.println(instance1 == instance2);
    }
}


/**
 * 饿汉式（线程不安全的）
 *
 * 1) 起到了Lazy Loading的效果，但是只能在单线程下使用。
 * 2) 如果在多线程下，一个线程进入了if (singleton == null)判断语句块，还未来得及 往下执行，
 *      另一个线程也通过了这个判断语句，这时便会产生多个实例。所以 在多线程环境下不可使用这种方式
 * 3) 结论：在实际开发中，不要使用这种方式.

 */
class Singleton003 {

    private static Singleton003 instance;


    private Singleton003(){}

    public static Singleton003 getInstance(){

        if(instance == null){
            instance = new Singleton003();
        }
        return instance;
    }

}
