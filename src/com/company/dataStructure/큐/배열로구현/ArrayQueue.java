package com.company.dataStructure.큐.배열로구현;

public class ArrayQueue implements Queue {

    private int front;
    private int rear;
    private int queueSize;
    private String[] itemArray;

    public ArrayQueue(int queueSize) {
        this.front = -1;
        this.rear = -1;
        this.queueSize = queueSize;
        this.itemArray = new String[this.queueSize];
    }

    @Override
    public boolean isEmpty() {
        return (this.front == this.rear);
    }

    public boolean isFull() {
        return (this.rear == this.queueSize - 1);
    }

    @Override
    public void enQueue(String item) {
        if (isFull()) {
            System.out.println("enQueue 실패 : queue가 가득 참");
        }
        itemArray[++this.rear] = item;
        System.out.println("enQueue 성공 :  item : " + item);
    }

    @Override
    public String deQueue() {
        String result = itemArray[front + 1];
        itemArray[front + 1] = null;
        front++;

        return result;
    }

    public void allWrite() {
        for (int i = 0; i < this.itemArray.length; i++) {
            System.out.println(this.itemArray[i]);
        }
        System.out.println("");
    }
}

class test{
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        System.out.println(queue.isEmpty());
        queue.enQueue("A");
        queue.enQueue("B");
        queue.enQueue("C");

        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());

        System.out.println("----");
        queue.allWrite();
    }
}
