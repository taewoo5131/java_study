package com.company.condingtestLV1.java;

/**
 * -- 1번
 * 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
 * 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
 *
 * 제한사항
 * N의 범위 : 100,000,000 이하의 자연수
 *
 *
 *
 * -- 2번
 * 길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수,
 * solution을 완성하세요. 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.
 *
 * 제한 조건
 * n은 길이 10,000이하인 자연수입니다.
 */
public class 스킬체크테스트LV1 {
    public static void main(String[] args) {
//        Solution.solution(15);
        System.out.println(Solution2.solution(3));;
    }

    // 1번
    static class Solution{
        public static int solution(int n) {
            String s = String.valueOf(n);
            char[] chars = s.toCharArray();
            int sum = 0;
            for (int i = 0; i < chars.length; i++) {
                sum += Integer.parseInt(String.valueOf(chars[i]));
            }
            return sum;
        }
    }

    // 2번
    static class Solution2{
        public static String solution(int n) {
            if (n > 10000) {
                return null;
            }
            String result = "";
            String wartermelon = "수박";
            switch (n % 2) {
                case 0:
                    for (int i = 0; i < n / 2; i++) {
                        result += wartermelon;
                    }
                    break;
                case 1:
                    for (int i = 0; i < n / 2; i++) {
                        result += wartermelon;
                    }
                    result += "수";
                    break;
            }

            return result;
        }
    }
}
