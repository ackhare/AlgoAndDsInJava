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

    StackNode root;//In tree and linked list this is always 1st node and called root

    //Constructor to initialize the root of linked list
    public Stack() {
        this.root = null;
    }//just to intailaize and if any data it should be

    // empty and point to no where
    boolean isEmpty() {
        return root == null;
    }
    void push(String data) {
        StackNode newNode = new StackNode(data);
        newNode.next = this.root;
        root = newNode;//so that next time when above line(29) runs where the orignal
        // points should be pointed by this one
        System.out.println("pushed to stack " + data);
    }
    public String pop() {
        if (isEmpty())
            throw new NoSuchElementException("Underflow Exception");
        StackNode temp = root;//root is containing the entire linked list as stack where data
        // with 30 pointys to node of data with 20

        root = root.next;//data with 20 will now point to root thus kicking off 30 from its path
        // and its data can be printed
        String popped = temp.data;
        //so that it does not gets lost it is stored in a  temp variable
        return popped;
    }

    public String peek() {
        if (isEmpty())
            throw new NoSuchElementException("Underflow Exception");

        else
            return root.data;
    }

}

