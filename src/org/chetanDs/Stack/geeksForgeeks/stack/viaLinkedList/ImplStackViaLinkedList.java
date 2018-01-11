package org.chetanDs.Stack.geeksForgeeks.stack.viaLinkedList;

public class ImplStackViaLinkedList {

    public static void main(String[] args) {

        //Driver program to test above class
        Stack stack = new Stack();
        stack.push("10");
        stack.push("20");
        stack.push("30");
        System.out.println("popped from stack" + stack.pop());
        System.out.println("Top elemnt is " + stack.peek());
    }
}
