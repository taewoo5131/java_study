package com.company.dataStructure.스택.배열로구현;

public class ArrayStack implements Stack {

    private int top;
    private int stackSize;
    private String[] itemArray;

    public ArrayStack(int stackSize) {
        this.top = -1;
        this.stackSize = stackSize;
        this.itemArray = new String[this.stackSize];
    }

    @Override
    public boolean isEmpty() {
        return (this.top == -1);
    }

    @Override
    public boolean isFull() {
        return (this.top == this.stackSize-1);
    }

    @Override
    public void push(String item) {
        if (isFull()) {
            System.out.println("push 실패 ~ stack이 가득 찼습니다.");
            return;
        }
        this.itemArray[++this.top] = item;
        System.out.println("push 성공 ~ item : " + item);
    }

    @Override
    public String pop() {
        if (isEmpty()) {
            System.out.println("pop 실패 ~ stack이 비었습니다.");
            return null;
        }

        String item = this.itemArray[this.top];
        this.itemArray[this.top] = null;
        this.top--;
        System.out.println("pop 성공 ~ item : " + item);
        return item;
    }

    public void allWrite() {
        for (int i = 0; i < this.itemArray.length; i++) {
            System.out.println(this.itemArray[i]);
        }
        System.out.println("");
    }
}

class testStack{
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        stack.allWrite();
        stack.push("A");
        stack.allWrite();
        stack.push("B");
        stack.allWrite();
        stack.push("C");
        stack.allWrite();

        stack.pop();
        stack.allWrite();
    }
}
