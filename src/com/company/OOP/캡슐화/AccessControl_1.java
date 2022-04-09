package com.company.OOP.캡슐화;

/**
 * 캡슐화가 되지 않은 예
 */
public class AccessControl_1 {
    int num1, num2;
    int sum;
    double avg;

    public AccessControl_1(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getSum() {
        this.sum = num1 + num2;
        return this.sum;
    }

    public double getAvg() {
        this.avg = this.sum / 2.0;
        return this.avg;
    }
}

class test1{
    public static void main(String[] args) {
        AccessControl_1 test1 = new AccessControl_1(10, 20);
        System.out.println(test1.getSum());
        System.out.println(test1.getAvg());
        System.out.println("접근 가능 !!! " + test1.num1 + " / " + test1.num2);
    }
}
