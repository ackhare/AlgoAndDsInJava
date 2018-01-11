package org.chetanDs.Stack.Array_Stack;

/**
 * Created by chetan on 30/9/16.
 */
public class ArrayStackOps {

    static private void push(int value, Stack TheStack) {
        try {
            TheStack.Push(value);
            //ShowStack();
        } catch (Exception ex) {

        }
    }

    // Pop a value off of the stack.
    static private void pop(Stack TheStack) {
        try {
            TheStack.Pop();
            //ShowStack();
        } catch (Exception ex) {

        }
    }

    // Show the stack's values.
    static private void showStack(Stack TheStack) {

        for (int i = TheStack.NextSpot - 1; i >= 0; i--) {
            System.out.println(TheStack.Values[i]);
        }
    }

    public static void main(String[] args) {
        Stack TheStack = new Stack(10);
        push(1, TheStack);
        push(2, TheStack);
        push(3, TheStack);
        push(4, TheStack);
        push(5, TheStack);
        push(6, TheStack);
        push(7, TheStack);
        System.out.println("values pushed completed");
        showStack(TheStack);
        pop(TheStack);
        pop(TheStack);
             System.out.println("values popped completed");
        showStack(TheStack);
    }


}

