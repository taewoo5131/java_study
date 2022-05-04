package com.company.condingtestLV1.java;

/**
 * 문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.
 *
 * 제한 조건
 * s의 길이는 1 이상 5이하입니다.
 * s의 맨앞에는 부호(+, -)가 올 수 있습니다.
 * s는 부호와 숫자로만 이루어져있습니다.
 * s는 "0"으로 시작하지 않습니다.
 */
public class 문자열을정수로 {
    public static void main(String[] args) {
        System.out.println(Solution.solution("-123"));
    }
    static class Solution{
        static int solution(String s) {
            if (s.length() > 0 || s.length() < 6 || s.charAt(0) != '0') {
                int result = Integer.parseInt(s);
                return result;
            }
            return 0;
        }
    }
}
