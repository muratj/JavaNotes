package com.murat.Threads;

public class MultiThreads {
    public static void main(String[] args) throws InterruptedException {
        // Multi thread runs multiple code at the same time. Result will be reached faster
        // Use synchronized keyword in the method

        Counter c = new Counter();
        Thread t1 = new Thread(){
            public void run() {
                for (int i = 0; i<2000000; i++){
                    System.out.println("t1: "+c.count);
                    c.increment();
                }
            }
        };
        Thread t2 = new Thread(){
            public void run() {
                for (int i = 0; i<2000000; i++){
                    System.out.println("t2: "+c.count);
                    c.increment();
                }
            }
        };

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);

    }
}

class Counter {
    int count = 0;
    public synchronized void increment() {
        count++;
    }
}
