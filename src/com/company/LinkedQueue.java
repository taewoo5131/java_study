package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedQueue {
    public static void main(String[] args) {
        // 자바에서 제공하는 Queue 클래스 사용
//        userJavaUtilQueue();

        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        System.out.println("꺼낸 int "+myQueue.pop());
        System.out.println("선두 int " + myQueue.peek());
        System.out.println("꺼낸 int "+myQueue.pop());
        System.out.println("선두 int " + myQueue.peek());
        System.out.println("꺼낸 int "+myQueue.pop());
        System.out.println("선두 int " + myQueue.peek());
    }

    private static void userJavaUtilQueue() {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}

class MyQueue {
    /**
     * queuelsEmpty() : 큐 안이 비었는지 판단하는 함수
     * queueIsFull() : 배열의 최대크기를 벗어나면 안되기에 큐에 더이상 들어갈 공간이 없는지 판단하는 함수
     * size() : queue에 현재 들어가 있는 데이터의 개수를 return하는 함수
     * push(int value) : 큐 안에 데이터를 집어넣는 함수
     * peek() : 큐 안의 데이터들중 가장 먼저 나오는 데이터를 return 하는 함수
     * pop() : 큐 안의 데이터들 중 가장 먼저 나올수 있는 데이터를 return 하고 삭제하는 함수
     */
    int max = 10;
    int front;
    int tail;
    int[] queue;

    public MyQueue() {
        front = tail = 0;
        queue = new int[max];
    }

    public boolean queuelsEmpty() {
        return this.tail == 0 ? true : false;
    }

    public boolean queueIsFull() {
        return this.tail == max ? true : false;
    }

    public int size() {
        return this.queue.length;
    }

    public void push(int value) {
        if (queueIsFull()) {
            System.out.println("큐가 가득 참");
            return;
        }
        this.queue[tail++] = value;
    }

    public Integer peek() {
        if (queuelsEmpty()) {
            System.out.println("큐가 빔");
            return null;
        }
        return this.queue[front];
    }

    public Integer pop() {
        if (queuelsEmpty()) {
            System.out.println("큐가 빔");
            return null;
        }
        int val = this.queue[front];
        this.queue[front] = 0;
//        for (int i = 0; i < this.queue.length; i++) {
            this.queue[front] = this.queue[front + 1];
//        }
        front++;
        tail--;
        return val;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
