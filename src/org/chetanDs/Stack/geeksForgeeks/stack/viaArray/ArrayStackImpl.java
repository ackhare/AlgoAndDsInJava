package org.chetanDs.Stack.geeksForgeeks.stack.viaArray;


/* Java program to implement basic stack
   operations */
//
//There are 4 opertains in stack
//
//push Adds an item in the stack. If the stack is full, then it is said to be an Overflow condition.
//pop Removes an item from the stack. The items are popped in the reversed order in
// which they are pushed
//peek Returns top element of stack.
//isEmpty Returns true if stack is empty, else fals.
public class ArrayStackImpl {
    static final int MAX = 1000;//Extent where it can go
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        return (top < 0);
    }

    ArrayStackImpl() {
        top = -1;//that is isEmpty has top<0
    }

    boolean push(int x) {
        if (top >= MAX) {
            System.out.println("Stack Overflow");
            return false;
        } else {

            a[++top] = x;
            return true;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    }
}

// Driver code
class Main {
    public static void main(String args[]) {

        int c = 0;
        int t = c++;
        int r = ++c;
        System.out.println(c);
        System.out.println(t);
        System.out.println(r);
        ArrayStackImpl s = new ArrayStackImpl();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }
}
