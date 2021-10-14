package com.company.stack;

public class Stack {
    private int stackSize;

    public Stack(){}
    public Stack(int size){
        this.stackSize = size;
    }

    public void makeStack(){
        System.out.println("stack!");
        int[] array = new int[this.stackSize];
    }
    
}
