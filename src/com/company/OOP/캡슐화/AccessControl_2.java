package com.company.OOP.캡슐화;

public class AccessControl_2 {
    private int num1, num2;
    private int sum;
    private double avg;

    public AccessControl_2(int num1, int num2) {
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
class test2{
    public static void main(String[] args) {
        AccessControl_2 test1 = new AccessControl_2(10, 20);
        System.out.println(test1.getSum());
        System.out.println(test1.getAvg());
//        System.out.println("접근 불가능 ~~ " + test1.num1 + " / " + test1.num2);
    }
}