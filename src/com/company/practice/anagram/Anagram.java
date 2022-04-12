package com.company.practice.anagram;

import java.util.Arrays;

public class Anagram {
    public void anagram() {
        String a = "abcde";
        String b = "cbaed";

        char[] chars = a.toCharArray();
        char[] chars1 = b.toCharArray();
        Arrays.sort(chars);
        System.out.println(chars);
        Arrays.sort(chars1);
        System.out.println(chars1);

        System.out.println(chars.equals(chars1)); // 두 배열이 같은 배열인지 비교
        System.out.println(Arrays.equals(chars,chars1)); // 배열의 값들이 같은지 비교

    }
}
class test{
    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        anagram.anagram();
    }
}