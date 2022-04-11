package com.company.dataStructure.큐.링크드리스트로구현;

public class LinkedQueue implements Queue {

    // 링크드리스트의 제일 첫번째 노드를 가리킴
    QueueNode front = null;
    // 링크드리스트의 제일 마지막 노드를 가리킴
    QueueNode rear = null;

    public LinkedQueue() {

    }

    @Override
    public boolean isEmpty() {
        return (this.front == null);
    }

    @Override
    public void enqueue(String item) {
        QueueNode oldQueueNode = rear; // 기존의 rear를 잠시 보관해두고
        rear = new QueueNode();        // 새로운 rear 생성
        rear.data = item;              // rear의 data는 파라미터로 받은 String
        rear.link = null;               // rear의 link는 일단 null
        // 첫번째 노드일 경우에는 노드의 포인터 링크가 null
        if (isEmpty()) {
            front = rear;
        } else {
            oldQueueNode.link = rear;
//            rear.link = rear;
//            System.out.println(rear.link);
        }
        try {
            System.out.println("삽입 성공 !!! " + " 삽입 노드 data : " + item + " 삽입 노드 link : " + oldQueueNode.link + " ( " + oldQueueNode.link.data + " ) " + " front : " + front.data + " rear : " + rear.data);
        } catch (NullPointerException e) {
            System.out.println("삽입 성공 !!! " + " 삽입 노드 data : " + item + " 삽입 노드 link : " + null + " front : " + front.data + " rear : " + rear.data);
        }
    }

    @Override
    public String dequeue() {
        return null;
    }
}

class test{
    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue();
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
    }
}
