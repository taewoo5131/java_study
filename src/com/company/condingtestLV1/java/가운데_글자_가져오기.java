package com.company.condingtestLV1.java;

/**
 * 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
 *
 * 재한사항
 * s는 길이가 1 이상, 100이하인 스트링입니다.
 */
public class 가운데_글자_가져오기 {
    public static void main(String[] args) {
        StringBuilder result = Solution.solution("abcd");
        System.out.println(result);
    }
    static class Solution{
        static StringBuilder solution(String s) {
            StringBuilder answer = new StringBuilder();
            if (s.length() > 0 || s.length() < 101) {
                // 짝수
                if (s.length() % 2 == 0) {
                    answer.append(s.charAt(s.length() / 2 - 1));
                    answer.append(s.charAt(s.length() / 2));
                // 홀수
                }else{
                    answer.append(s.charAt(s.length() / 2));
                }
            }
            return answer;
        }
    }
}
