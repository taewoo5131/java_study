package com.company;

import java.util.LinkedList;
import java.util.List;

public class Queue implements Q{
    public static void main(String[] args) {
        System.out.println("test");
        List<String> que = new LinkedList<String>();
        que.add("a");
        que.add("b");
        que.add("c");
        que.add("d");
        System.out.println(que);
    }
}
