package com.company.condingtestLV1.java;

public class 수박수박수박 {
    public static void main(String[] args) {
        Solution.solution(5);
    }
    static class Solution{
        static String solution(int n) {
            StringBuffer stringBuffer = new StringBuffer();
            String str = "수박";
            for (int i = 0; i < n / 2; i++) {
                stringBuffer.append(str);
            }
            if (n % 2 != 0) {
                stringBuffer.append("수");
            }
            return stringBuffer.toString();
        }
    }
}
