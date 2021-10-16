package com.company;

import com.company.stack.Stack;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        String array = stack.makeStack(); // 만들기
        stack.put(1);
        stack.printToStack();
        stack.put(2);
        stack.printToStack();
        stack.put(3);
        stack.printToStack();
        stack.put(4);
        stack.printToStack();
        stack.put(5);
        stack.printToStack();
        stack.put(6);
        stack.printToStack();
        System.out.println("put over !!!!");
        stack.pop();
        stack.printToStack();
        stack.pop();
        stack.printToStack();
        stack.clearStack();
        stack.printToStack();
    }
}
