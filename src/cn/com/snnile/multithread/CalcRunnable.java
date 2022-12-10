package cn.com.snnile.multithread;

import java.util.List;

public class CalcRunnable implements Runnable {

    private List<Long> list;

    @Override
    public void run() {
        long sum = 0;
        for (long num : list) {
            sum += num;
        }
        System.out.println(Thread.currentThread().getName() + ": " + sum);
    }

    public List<Long> getList() {
        return list;
    }

    public void setList(List<Long> list) {
        this.list = list;
    }
}
