package com.company.stack;

public class Stack {
    private int stackSize;
    private int[] array;
    private int top;

    public Stack(){}
    public Stack(int size){
        this.stackSize = size;
    }

    public String makeStack(){
        System.out.println("stack!");
        array = new int[this.stackSize];
        top = -1;
        return array.toString();
    }

    // stack is empty?
    public boolean isEmpty(){
        return (top == -1);
    }

    public void printToStack(){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public void put(int n){
        if(this.top + 1 == stackSize){
            System.out.println("stack is full !!!!");
            return;
        }
        if(isEmpty()){
            array[0] = n;
            this.top = 0;
        }else{
            array[this.top + 1] = n;
            this.top = this.top + 1;
        }
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("ERROR : the stack is Empty !! impossible pop this stack.");
        }else{
            System.out.println(array[this.top]);
            array[this.top] = 0;
            this.top = this.top - 1;
        }
    }

    public void clearStack(){
        for(int i = 0; i < array.length; i++){
            array[i] = 0;
        }
        System.out.println("stack clear !!");
    }


    
}
