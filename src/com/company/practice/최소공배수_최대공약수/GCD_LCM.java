package com.company.practice.최소공배수_최대공약수;

public class GCD_LCM {
    public void gcdLcm(int a, int b) {
        int small = a < b ? a : b;
        int largeNum = a > b ? a : b;
        // 같은 수
        if (a == b) {
            System.out.println("최대공약수 : " + 1 + " , 최소공배수 " + a * b);
            return;
        }

        // 최대 공약수
        /**
         * a, b에 대해서 a를 b로 나눈 나머지를 r이라 하면(단, a>b),
         * a와 b의 최대공약수는 b와 r의 최대공약수와 같다. 이 성질에 따라,
         * b를 r로 나눈 나머지 r'를 구하고,
         * 다시 r을 r'로 나눈 나머지를 구하는 과정을 반복하여 나머지가 0이 되었을 때 나누는 수가 a와 b의 최대공약수이다
         */
        int test = 0;
        while(small > 0){
            test = small;
            // 나머지가 나누는 수가 된다.
            small = largeNum % small;
            // 작은수가 큰 수가 된다.
            largeNum = test;
        }
        System.out.println("최대공약수   : " + test);
        // 최소 공배수
        System.out.println("최소공배수   : " + a * b / test);

    }
}

class Test{
    public static void main(String[] args) {
        GCD_LCM gcdLcm = new GCD_LCM();
//        gcdLcm.gcd(3,12);
        gcdLcm.gcdLcm(4,11);
    }
}