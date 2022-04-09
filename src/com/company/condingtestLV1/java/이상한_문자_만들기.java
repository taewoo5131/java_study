package com.company.condingtestLV1.java;

import com.mysql.jdbc.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * 문자열 s는 한 개 이상의 단어로 구성되어 있습니다.
 * 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
 * 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
 */
public class 이상한_문자_만들기 {

    static class Solution {
        public static StringBuilder solution(String s) {
            StringBuilder result = new StringBuilder();
            List emptyIdxList = new ArrayList();
            char[] arr1 = s.toCharArray();
            for (int i = 0; i < arr1.length; i++) {
                if (String.valueOf(arr1[i]).equals(" ")) {
                    emptyIdxList.add(i);
                }
            }
            System.out.println(emptyIdxList);
            String param = s.replace(" ","");
            System.out.println(param);
            char[] arr = param.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                if(i % 2 == 0){
                    result.append(String.valueOf(arr[i]).toUpperCase());
                }else{
                    result.append(String.valueOf(arr[i]).toLowerCase());
                }
            }
            if (!emptyIdxList.isEmpty()) {
//                int num = 1;
                for (int i = 0; i < emptyIdxList.size(); i++) {
                    result.insert((Integer) emptyIdxList.get(i), " ");
                }
            }
            System.out.println(result);
            return result;
        }
    }
    public static void main(String[] args) {
        Solution.solution(" aaaa ");
    }
}
