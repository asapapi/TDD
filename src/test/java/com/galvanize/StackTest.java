package com.galvanize;

import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    public void createStackObj_shouldReturnsNewObj(){
        Stack stack = new Stack();
        assertNotNull(stack);
    }

    @Test
    public void isEmpty_emptyStack_shouldReturnsTrue(){
        Stack stack = new Stack();
        assertEquals(true, stack.isEmpty());
    }

    @Test
    public void add_emptyStack_shouldAddData(){
        Stack stack = new Stack();
        int data = 5;
        stack.add(data);
        assertEquals(false, stack.isEmpty());
    }

    @Test
    public void peek_WithItemsInStack_shouldReturnsData(){
        Stack stack = new Stack();
        stack.add(5);
        assertEquals(5, stack.peek());
    }

    @Test
    public void pop_afterAdd_shouldReturnsAddedData(){
        Stack stack = new Stack();
        stack.add(5);
        assertEquals(5, stack.pop());
    }

    @Test
    public void popTwice_afterTwoAdds_shouldReturnsLastAddedData(){
        Stack stack = new Stack();
        stack.add(5);
        stack.add(10);
        stack.pop();
        assertEquals(5, stack.pop());
    }

    @Test
    public void popThrice_afterTwoAdd_shouldReturnsEmptyException(){
        Stack stack = new Stack();
        stack.add(5);
        stack.add(10);
        stack.pop();
        stack.pop();
        assertThrows(EmptyStackException.class, ()-> stack.pop());
    }

    @Test
    public void peekOnce_afterOneAddAndOnePop_shouldReturnsEmptyException(){
        Stack stack = new Stack();
        stack.add(5);
        stack.pop();
        assertThrows(EmptyStackException.class, ()-> stack.peek());
    }

}