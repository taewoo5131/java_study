package com.company.condingtestLV1.java;

/**
 * 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수,
 * solution을 완성하세요. 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
 */
public class 문자열다루기기본 {
    public static void main(String[] args) {
        boolean result = Solution.solution("12a3");
        System.out.println(result);
    }

    public static class Solution{
        public static boolean solution(String s) {
            boolean answer = false;
            char[] arr = s.replace(" ","").toCharArray();
            if (arr.length > 0 || arr.length < 9) {
                if (arr.length == 4 || arr.length == 6) {
                    for (int i = 0; i < arr.length; i++) {
                        boolean digit = Character.isDigit(arr[i]);
                        System.out.println(digit + " ---");
                        if (!digit) {
                            return false;
                        }
                        answer = true;
                    }
                }
            }

            return answer;
        }
    }
}
