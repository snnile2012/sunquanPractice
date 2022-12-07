package cn.com.snnile.designpattern.singleton;

// 懒汉单例
public class LazySingleton {

    private LazySingleton(){};

    // 懒汉单例instance需要添加volatile关键字的原因是防止指令重排序：
    // 详见：https://codingxxm.gitee.io/2020/04/11/DCL%E5%8D%95%E4%BE%8B%E4%B8%BA%E4%BB%80%E4%B9%88%E8%A6%81%E4%BD%BF%E7%94%A8volatile%E5%85%B3%E9%94%AE%E5%AD%97/
    private static volatile LazySingleton instance = null;

    // 懒汉模式需要添加DCL(DOUBLE-CHECKED LOCKING) 双重锁校验 防止多线程情况下new出多个对象实例
    public static LazySingleton getInstance() {
        // 如果不加volatile，由于指令重排序，会出现引用已经指向内存地址，但实际上该内存地址还未被赋值的情况，导致NPE问题
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

}
