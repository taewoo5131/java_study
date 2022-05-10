package com.company.condingtestLV1.java;

/**
 * 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
 * 예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다.
 * 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
 *
 * 제한 조건
 * 공백은 아무리 밀어도 공백입니다.
 * s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
 * s의 길이는 8000이하입니다.
 * n은 1 이상, 25이하인 자연수입니다.
 */
public class 시저암호 {
    public static void main(String[] args) {
        Solution.solution("z", 1);
    }
    static class Solution{
        static StringBuffer solution(String s, int n) {
            String alphabet = "abcdefghijklmnopqrstuvwxyz";
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == ' ') {
                    stringBuffer.append(' ');
                    continue;
                }
                boolean isUpper = Character.isUpperCase(c) ? true : false ;
                int test = alphabet.indexOf(Character.toLowerCase(c)) + n >= 26 ? alphabet.indexOf(Character.toLowerCase(c)) + n - 26 : alphabet.indexOf(Character.toLowerCase(c)) + n;
                if (isUpper) {
                    stringBuffer.append(Character.toUpperCase(alphabet.charAt(test)));
                } else {
                    stringBuffer.append(alphabet.charAt(test));
                }
            }
            System.out.println(stringBuffer);

            return stringBuffer;
        }
    }
}
