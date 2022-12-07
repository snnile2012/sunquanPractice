package cn.com.snnile.designpattern.singleton;

// 饿汉模式单例 天生线程安全
public class HungrySingleton {

    // 单例的构造方法必须是private，防止直接new对象，违反单例模式思想
    private HungrySingleton(){};

    private static final HungrySingleton instance = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return instance;
    }

}
