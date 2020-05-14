package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    public void isEmpty_emptyQueue_ShouldReturnsTrue(){
        Queue queue = new Queue();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void peek_afterAddOnce_shouldReturnsAddedData(){
        Queue queue = new Queue();
        queue.add(5);
        assertEquals(5, queue.peek());
    }

    @Test
    public void peek_afterTwoAdd_shouldReturnsFirstAddedData(){
        Queue queue = new Queue();
        queue.add(5);
        queue.add(10);
        assertEquals(5, queue.peek());
    }

    @Test
    public void peek_afterTwoAddAndOneRemove_shouldReturnsSecondAddedData(){
        Queue queue = new Queue();
        queue.add(5);
        queue.add(10);
        queue.remove();
        assertEquals(10, queue.peek());
    }

    @Test
    public void remove_afterThreeAdd_shouldReturnsFirstAddedData(){
        Queue queue = new Queue();
        queue.add(5);
        queue.add(10);
        queue.add(15);
        assertEquals(5,queue.remove());
    }

    @Test
    public void remove_afterTwoAddAndOneRemove_shouldReturnsSecondAddedData(){
        Queue queue = new Queue();
        queue.add(5);
        queue.add(10);
        queue.remove();
        assertEquals(10,queue.remove());
    }

    @Test
    public void remove_afterOneAddAndOneRemove_shouldThrowException(){
        Queue queue = new Queue();
        queue.add(5);
        queue.remove();
        assertThrows(RuntimeException.class, ()->queue.remove());
    }

    @Test
    public void peek_afterTwoAddAndTwoRemove_shouldReturnsException(){
        Queue queue = new Queue();
        queue.add(5);
        queue.add(10);
        queue.remove();
        queue.remove();
        assertThrows(RuntimeException.class, ()->queue.peek());
    }

    @Test
    public void remove_afterThreeAddAndThreeRemove_shouldReturnsException(){
        Queue queue = new Queue();
        queue.add(5);
        queue.add(10);
        queue.add(15);
        queue.remove();
        queue.remove();
        queue.remove();
        assertThrows(RuntimeException.class, ()->queue.remove());
    }

}