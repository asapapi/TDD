package com.galvanize;

public class Queue {

    private Node head;
    private Node tail;

    public Queue(){
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }else{
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    public int peek() {
        if(isEmpty()) throw new RuntimeException("Empty Queue.");
        return head.getData();
    }

    public int remove() {
        if(isEmpty()) throw new RuntimeException("Empty Queue.");
        int temp = head.getData();
        head = head.getNext();
        return temp;
    }
}
