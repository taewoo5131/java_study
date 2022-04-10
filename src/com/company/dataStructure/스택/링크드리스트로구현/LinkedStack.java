package com.company.dataStructure.스택.링크드리스트로구현;

public class LinkedStack implements Stack {

    private StackNode top;

    @Override
    public boolean isEmpty() {
        return (this.top == null);
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void push(String item) {
        StackNode node = new StackNode();
        node.data = item;
        node.link = this.top;
        this.top = node;
        try {
            System.out.println("push 성공 -- node.data : " + node.data + " / " + " node.link : " + node.link.data);
        } catch (NullPointerException e) {
            System.out.println("push 성공 -- node.data : " + node.data + " / " + " node.link : " + null);
        }
    }

    @Override
    public String pop() {
        if (isEmpty()) {
            System.out.println("pop 실패 ~ stack이 비어있슴.");
            return null;
        }
        String item = top.data;
        top = top.link;
        System.out.println("pop 성공 ~ item : " + item);
        return item;
    }

    public void allWrite() {

    }
}

class testStack{
    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();
        System.out.println(stack.isEmpty());
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println("-----");
        stack.pop();

    }
}
