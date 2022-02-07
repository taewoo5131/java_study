package com.company.condingtestLV1.java;

import java.util.ArrayList;
import java.util.List;

/**
 * 함수 solution은 정수 x와 자연수 n을 입력 받아,
 * x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
 * 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
 *
 * x는 -10000000 이상, 10000000 이하인 정수입니다.
 * n은 1000 이하인 자연수입니다.
 */
public class x만큼간격 {
    public static void main(String[] args) {
        Solution.solution(4,3);
    }
    private static class Solution {
        static public List solution(int x, int n) {
            List<Long> result = new ArrayList();
            long num = x;
            long i = 0;
            if (n > 0 && n <= 1000) {
                while (i < n) {
                    i++;
                    result.add(Long.valueOf(x * i));
                }
                System.out.println(result.toString());
                return result;
            }
            return null;
        }
    }
}
