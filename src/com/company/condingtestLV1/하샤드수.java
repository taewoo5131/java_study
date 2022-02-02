package com.company.condingtestLV1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
 * 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
 * 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
 *
 * x는 1 이상, 10000 이하인 정수입니다.
 */
public class 하샤드수 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(11));
    }
    private static class Solution {
        static public boolean solution(int x) {
            int num = x;
            if (x > 0 && x < 10001) {
                Stack stack = new Stack();
                while(x > 0) {
                    stack.add(x % 10);
                    x /= 10;
                }
                int result = 0;
                while (stack.size() != 0){
                    result += (Integer)stack.pop();
                }
                return num % result == 0 ? true : false ;
            }
            return false;
        }
    }
}
