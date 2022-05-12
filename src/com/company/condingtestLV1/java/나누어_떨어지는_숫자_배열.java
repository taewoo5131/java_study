package com.company.condingtestLV1.java;

import java.util.ArrayList;
import java.util.Collections;

/**
 * array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
 * divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
 *
 * 제한사항
 * arr은 자연수를 담은 배열입니다.
 * 정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
 * divisor는 자연수입니다.
 * array는 길이 1 이상인 배열입니다.
 */
public class 나누어_떨어지는_숫자_배열 {
    public static void main(String[] args) {
        Solution.solution(new int[]{2, 36, 1, 3},1);
    }
    static class Solution{
        static ArrayList solution(int[] arr, int divisor) {
            ArrayList result = new ArrayList();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % divisor == 0) {
                    result.add(arr[i]);
                }
            }
            if (result.isEmpty()) {
                result.add(-1);
            }
            Collections.sort(result);
            return result;
        }
    }
}
