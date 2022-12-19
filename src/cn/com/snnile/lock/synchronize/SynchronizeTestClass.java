package cn.com.snnile.lock.synchronize;

// 普通方法添加synchronized，锁的是当前实例对象
public class SynchronizeTestClass {

    public synchronized void testMethod(String name) {
        System.out.println(name + "开始执行");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
        System.out.println(name + "执行完毕");
    }

    public static void main(String[] args) {
        // 两个实例，因为synchronized修饰的为普通方法，所以不会按顺序执行
//        SynchronizeTestClass t1 = new SynchronizeTestClass();
//        SynchronizeTestClass t2 = new SynchronizeTestClass();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                t1.testMethod("线程1");
//            }
//        }).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                t2.testMethod("线程2");
//            }
//        }).start();

        // 一个实例，可以按顺序执行
        SynchronizeTestClass t3 = new SynchronizeTestClass();
        new Thread(new Runnable() {
            @Override
            public void run() {
                t3.testMethod("线程3");
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                t3.testMethod("线程4");
            }
        }).start();

    }

}
