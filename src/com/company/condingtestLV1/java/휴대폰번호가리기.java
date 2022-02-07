package com.company.condingtestLV1.java;

/**
 * 프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
 * 전화번호가 문자열 phone_number로 주어졌을 때,
 * 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
 */
public class 휴대폰번호가리기 {
    public static void main(String[] args) {
        Solution.solution("01033334444");
    }
    private static class Solution {
        public static String solution(String param) {
            StringBuilder sb = new StringBuilder(param);
            for (int i = 0; i < param.length(); i++) {
                if (param.length() == 4) {
                    break;
                }
                sb.setCharAt(i, '*');
                if (i == param.length() - 5) {
                    break;
                }
            }
            return sb.toString();
        }
    }
}
