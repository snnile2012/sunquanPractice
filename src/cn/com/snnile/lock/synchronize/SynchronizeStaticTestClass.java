package cn.com.snnile.lock.synchronize;

// 静态方法添加synchronized，锁的是当前类
public class SynchronizeStaticTestClass {

    public static synchronized void testMethod(String name) {
        System.out.println(name + "开始执行");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
        System.out.println(name + "执行完毕");
    }

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SynchronizeStaticTestClass.testMethod("线程1");
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                SynchronizeStaticTestClass.testMethod("线程2");
            }
        }).start();

    }

}
