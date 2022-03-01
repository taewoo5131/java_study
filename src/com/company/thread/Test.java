package com.company.thread;

public class Test implements Runnable{
    private int seq = 0;
    private String name = "";

    public Test() {
    }

    public Test(int seq , String name) {
        this.seq = seq;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            synchronized (Test.class) {


            System.out.println(this.name+" thread !!!"+this.seq);
            Thread.sleep(100);
            }
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.testThread();
        System.out.println("main end!!!");
    }

    private void testThread() {
        for (int i = 0; i < 10; i++) {
//            Test test = new Test(i);
            Thread test = new Thread(new Test(i,"A"));
            Thread test2 = new Thread(new Test(i, "B"));
            Thread test3 = new Thread(new Test(i, "C"));
//            Thread



            try {
                test.start();
                test.join();
                test2.start();
                test2.join();
                test3.start();
                test3.join();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
