package com.company.dataStructure.이진트리;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

/**
 * 기본적으로 삽입 , 삭제 연산을 가지고 있고
 * 전위 탐색, 후위 탐색, 중위 순회 가 있다.
 */
public class BinaryTree {
    Node rootNode = null;
    //---------------------------------------------
    // * 삽입
    //---------------------------------------------
    public void insertNode(int data) {
        // root가 null일때 ( 첫번째 삽입 )
        if (rootNode == null) {
            rootNode = new Node(data);
        // 그 외 자식 노드 삽입일때
        }else{
            Node head = rootNode;
            Node parentNode = null;
            while (true) {
                parentNode = head;
                /**
                 * 현재의 노드보다 작은 경우 , 왼쪽에서부터 탐색한다.
                 */
                if (head.data > data) {
                    head = head.left;
                    break;
                } else {
                    head.right = new Node(data);
                    break;
                }
            }
        }
    }

    public void allWrite() {
        try {
            System.out.println(rootNode.data + " / " + rootNode.left.data + " / " + rootNode.right.data);
        } catch (NullPointerException e) {
            System.out.println(rootNode.data + " / " + null + " / " + null);
        }
    }
}

class Test{
    public static void main(String[] args) {
        BinaryTree bTree = new BinaryTree();
        bTree.insertNode(1);
        bTree.allWrite();
        bTree.insertNode(2);
        bTree.allWrite();
    }
}
