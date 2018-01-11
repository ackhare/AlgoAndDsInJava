package org.chetanDs.Stack.geeksForgeeks.stack.viaLinkedList;

import java.util.NoSuchElementException;

// Class to represent a node
public class StackNode {
    String data;
    StackNode next;

    public StackNode(String data) {
        this.next = null;
        this.data = data;
    }
}

class Stack {

    StackNode root;

    //Constructor to initialize the root of linked list
    public Stack() {
        this.root = null;
    }


    boolean isEmpty() {
        return root == null;
    }

    void push(String data) {
        StackNode newNode = new StackNode(data);
        newNode.next = this.root;
        root = newNode;
        System.out.println("pushed to stack " + data);
    }

    public String pop() {

        if (isEmpty())
            throw new NoSuchElementException("Underflow Exception");

        StackNode temp = root;
        root = root.next;
        String popped = temp.data;
        return popped;
    }

    public String peek() {
        if (isEmpty())
            throw new NoSuchElementException("Underflow Exception");

        else
            return root.data;
    }

}

