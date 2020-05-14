package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    public void isEmpty_emptyLinkedList_shouldReturnsTrue(){
        LinkedList linkedList = new LinkedList();
        assertTrue(linkedList.isEmpty());
    }

    @Test
    public void isEmpty_afterOneAddLast_shouldReturnsFalse(){
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(5);
        assertFalse(linkedList.isEmpty());
    }

    @Test
    public void isEmpty_afterOneAddLastAndOneRemoveFirst_shouldReturnsTrue(){
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(5);
        linkedList.removeFirst();
        assertTrue(linkedList.isEmpty());
    }

    @Test
    public void removeLast_afterOneAddLast_shouldReturnsLastAddedData(){
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(5);
        assertEquals(5, linkedList.removeLast());
    }

    @Test
    public void removeLast_afterOneAddLastAndOneRemoveLast_shouldReturnsException(){
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(5);
        linkedList.removeLast();
        assertThrows(RuntimeException.class, ()-> linkedList.removeLast());
    }

    @Test
    public void removeFirst_afterOneAddLastAndOneRemoveLast_shouldReturnsException(){
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(5);
        linkedList.removeLast();
        assertThrows(RuntimeException.class, ()-> linkedList.removeFirst());
    }

    @Test
    public void isEmpty_afterOneAddFirstAndOneAddLast_shouldReturnsFalse(){
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(5);
        linkedList.addLast(10);
        assertFalse(linkedList.isEmpty());
    }

    @Test
    public void isEmpty_afterTwoAddFirstAndTwoRemoveLast_shouldReturnsTrue(){
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(5);
        linkedList.addFirst(10);
        linkedList.removeLast();
        linkedList.removeLast();
        assertTrue(linkedList.isEmpty());
    }

    @Test
    public void removeLast_afterOneAddFirstAndOneAddLast_shouldReturnsLastAddedData(){
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(5);
        linkedList.addLast(10);
        assertEquals(10, linkedList.removeLast());
    }

    @Test
    public void removeLast_afterOneAddFirstAndOneRemoveLast_shouldReturnsException(){
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(5);
        linkedList.removeLast();
        assertThrows(RuntimeException.class, () -> linkedList.removeLast());
    }

}