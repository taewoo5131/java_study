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

    /**
     * queue에 삽입
     * @param item
     */
    @Override
    public void enqueue(String item) {
        QueueNode queueNode = new QueueNode();
        // queue가 비었을때
        if (isEmpty()) {
            queueNode.data = item;
            queueNode.link = null;
            this.front = queueNode;
            this.rear = queueNode;
            System.out.println("삽입 성공 !!! " + " 삽입 노드 data : " + item + " 삽입 노드 link : " + null + " front : " + front.data + " rear : " + rear.data);
        // queue가 비어있지 않을 때
        } else {
            QueueNode old = this.rear;
            queueNode.data = item;
            queueNode.link = null;
            old.link = queueNode;
            this.rear = queueNode;
            System.out.println("삽입 성공 !!! " + " 삽입 노드 data : " + item + " 이전 삽입 노드 link : " + old.link + " ( " + old.link.data + " ) " + " front : " + front.data + " rear : " + rear.data);
        }
    }

    /**
     * queue에서 꺼내기
     * @return
     */
    @Override
    public String dequeue() {
        if (isEmpty()) {
            System.out.println("dequeue 실패 !! 큐가 비었습니다.");
            return null;
        }
        String result = front.data;
        this.front = front.link;
        return result;
    }
}

class test{
    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue();
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        System.out.println(queue.dequeue());;
        System.out.println(queue.dequeue());;
        System.out.println(queue.dequeue());;
        System.out.println(queue.dequeue());;

    }
}
