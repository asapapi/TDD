package com.galvanize;

import java.util.EmptyStackException;

public class Stack {

    private Node node;
    private Node head;

    public Stack(){
        this.node = null;
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
        }else{
            newNode.setNext(head);
            head = newNode;
        }
    }

    public int peek() {
        if(isEmpty()) throw new EmptyStackException();
        return head.getData();
    }

    public int pop() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int temp = head.getData();
        head = head.getNext();
        return temp;
    }
}
