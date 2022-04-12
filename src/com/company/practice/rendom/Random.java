package com.company.practice.rendom;

public class Random {
    java.util.Random random = new java.util.Random();
    public void getRandom() {
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(9) + 1);
        }
    }
}

class test{
    public static void main(String[] args) {
        Random random = new Random();
        random.getRandom();
    }
}
