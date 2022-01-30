package com.company.condingtestLV1;

/**
 * 대문자와 소문자가 섞여있는 문자열 s가 주어집니다.
 * s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요.
 * 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
 * 예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.
 */
public class PandYLength {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution("pPoooYy");
    }

    private static class Solution {
        boolean solution(String s) {
            boolean answer = true;

            // 소문자 변환
            int pLength = 0;
            int yLength = 0;
            String s1 = s.toLowerCase();
            System.out.println(s1.substring(0));
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) == 'p') {
                    pLength++;
                }
                if (s1.charAt(i) == 'y') {
                    yLength++;
                }
            }

            return pLength==yLength?true:false;
        }
    }
}
