package com.company;

import com.company.stack.Stack;

class Test{
    int instanceVar = 10;
    static int classVar = 20;
}

public class Main {

    public static void main(String[] args) {
        Test test = new Test();
        Test test2 = new Test();
        test.classVar = 2222;
        test.instanceVar = 32222;
        System.out.println(test.instanceVar);
        System.out.println(test2.instanceVar);
        System.out.println(test.classVar);
        System.out.println(test2.classVar);



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
