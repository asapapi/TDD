package com.galvanize;

public class LinkedList {

    private Node head;
    private Node tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }else{
            newNode.setNext(head);
            head = newNode;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }else{
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    public int removeFirst() {
        if(isEmpty()) throw new RuntimeException("Empty Queue.");
        int temp = head.getData();
        head = head.getNext();
        return temp;
    }

    public int removeLast() {
        if(isEmpty()) throw new RuntimeException("Empty Queue.");
        Node tempNode = head;
        Node secondLastNode = null;
        while(tempNode.getNext() != null){
            secondLastNode = tempNode;
            tempNode = tempNode.getNext();
        }
        if(secondLastNode == null){
            head = null;
            tail = null;
            return tempNode.getData();
        }else{
            secondLastNode.setNext(null);
            tail = secondLastNode;
            return tempNode.getData();
        }
    }

}
