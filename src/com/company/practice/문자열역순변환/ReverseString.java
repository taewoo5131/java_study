package com.company.practice.문자열역순변환;

import java.util.Stack;

public class ReverseString {
    public void reverse(String param) {
        Stack stack = new Stack();
        char[] arr = param.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            Object pop = stack.pop();
            System.out.println(pop.toString());
        }
    }
}

class Test{
    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        reverseString.reverse("abcd");
    }
}
