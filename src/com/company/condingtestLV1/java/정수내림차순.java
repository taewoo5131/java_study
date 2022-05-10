package com.company.condingtestLV1.java;

import java.util.Arrays;
import java.util.Collections;

/**
 * 함수 solution은 정수 n을 매개변수로 입력받습니다.
 * n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
 * 예를들어 n이 118372면 873211을 리턴하면 됩니다.
 *
 * 제한 조건
 * n은 1이상 8000000000 이하인 자연수입니다.
 */
public class 정수내림차순 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(118372));
    }
    static class Solution{
        static public long solution(long n) {
            Long[] arr = new Long[String.valueOf(n).length()];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Long.parseLong(String.valueOf(String.valueOf(n).charAt(i)));
            }
            Arrays.sort(arr, Collections.reverseOrder());
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < arr.length; i++) {
                stringBuffer.append(arr[i]);
            }
            return Long.parseLong(String.valueOf(stringBuffer));
        }
    }
}
