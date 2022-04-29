package com.company.condingtestLV1.java;

import java.util.Arrays;
import java.util.Stack;

/**
 * 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
 * s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
 *
 * 제한 사항
 * str은 길이 1 이상인 문자열입니다.
 */
public class 문자열_내림차순 {
    public static void main(String[] args) {
        Solution.solution("fedcba");
    }

    static class Solution{
        static StringBuilder solution(String s) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            Stack stack = new Stack();
            for (char c:arr) {
                stack.push(c);
            }

            StringBuilder stringBuilder = new StringBuilder();
            int length = stack.size();
            for (int i = 0; i < length; i++) {
                stringBuilder.append(stack.pop());
            }
            return stringBuilder;
        }
    }
}
