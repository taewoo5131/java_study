package com.company.condingtestLV1;

/**
 * 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수,
 * solution을 완성해 보세요. 배열의 맨 앞에 최대공약수,
 * 그다음 최소공배수를 넣어 반환하면 됩니다.
 * 예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.
 */
public class 최대공약수와_최소공배수 {
    public static void main(String[] args) {
        Solution.solution(2,5);
    }
    private static class Solution {
        public static int[] solution(int n, int m) {
            int[] answer = new int[2];
            int largeParam = n > m ? n : m;
            int smallParam = n > m ? m : n;
            System.out.println(largeParam + "," + smallParam);
            int test = 0;
            while(smallParam > 0){
                test = smallParam;
                // 나머지가 나누는 수가 된다.
                smallParam = largeParam % smallParam;
                // 작은수가 큰 수가 된다.
                largeParam = test;
            }
            // 최대 공약수
            answer[0] = largeParam;
            // 최소 공배수
            answer[1] = n*m/largeParam;
            for (int i = 0; i < 2; i++) {
                System.out.println(answer[i]);
            }
            return answer;
        }
    }
}
