package com.company.condingtestLV1;

public class 나머지가1 {
    public static void main(String[] args) {
//        System.out.println(12 % 10);
        System.out.println(Solution.solution(10));
    }

    static class Solution {
        public static int solution(int n) {
            int answer = 1;
            for(int i = 1; i <= n; i++){
                if (n % i == 1) {
                    answer = i;
                    break;
                }
            }
            return answer;
        }
    }
}
