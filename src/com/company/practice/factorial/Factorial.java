package com.company.practice.factorial;

public class Factorial {
    public void setFactorial(int num) {
        int result = 1;
        for (int i = 1; i < num; i++) {
            result = result * (i + 1);
        }
        System.out.println(result);
    }
}

class test{
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        factorial.setFactorial(5); // 5! = 120
    }
}
