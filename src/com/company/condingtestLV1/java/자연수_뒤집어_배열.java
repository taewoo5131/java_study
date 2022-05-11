package com.company.condingtestLV1.java;

import java.util.Stack;

/**
 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
 * 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
 *
 * 제한 조건
 * n은 10,000,000,000이하인 자연수입니다.
 */
public class 자연수_뒤집어_배열 {
    public static void main(String[] args) {
        Solution.solution(12345);
    }
    static class Solution{
        static int[] solution(long n) {
            String str = String.valueOf(n);
            int[] answer = new int[str.length()];
            Stack stack = new Stack();

            for (int i = str.length() - 1; i > -1 ; i--) {
                char c = str.charAt(i);
                stack.push(c);
            }
            int idx = 0;
            for(Object each : stack){
                answer[idx] = Integer.parseInt(String.valueOf(each));
                idx++;
            }
            return answer;
        }
    }
}
