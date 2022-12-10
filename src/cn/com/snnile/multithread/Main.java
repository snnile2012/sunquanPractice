package cn.com.snnile.multithread;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Long> list = new ArrayList<>();
        for (long i = 0; i < 10000000; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();
        long sum = 0L;
        for (Long num : list) {
            sum += num;
        }
        System.out.println(sum);
        System.out.println("single thread use time : " + (System.currentTimeMillis() - start));


        CalcRunnable calcRunnable1 = new CalcRunnable();
        CalcRunnable calcRunnable2 = new CalcRunnable();
        Thread thread1 = new Thread(calcRunnable1);
        Thread thread2 = new Thread(calcRunnable2);

        List<Long> list1 = new ArrayList<>();
        List<Long> list2 = new ArrayList<>();
        for (long i = 0; i < 5000000; i++) {
            list1.add(i);
        }
        for (long i = 5000000; i < 10000000; i++) {
            list2.add(i);
        }
        calcRunnable1.setList(list1);
        calcRunnable2.setList(list2);
        start = System.currentTimeMillis();
        thread1.start();
        thread2.start();
        System.out.println("multi thread use time : " + (System.currentTimeMillis() - start));
    }


}
