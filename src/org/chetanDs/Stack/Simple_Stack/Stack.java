package org.chetanDs.Stack.Simple_Stack;

/**
 * Created by chetan on 30/9/16.
 */
public class Stack<T>
{
    // The top of the list.
    // We only add and remove from the top, so we don't really need a sentinel.
    public StackCell<T> Top = null;

    // Push an item onto the stack.
    public void Push(T value)
    {
        StackCell<T> newCell = new StackCell<T>();
        newCell.Value = value;
        newCell.Next = Top;
        Top = newCell;
    }

    // Pop a value off of the top of the stack.
    public T Pop() throws Exception {
        if (Top == null) {
            throw new Exception("The stack is empty.");
        }
            T result = Top.Value;
        Top = Top.Next;
        return result;
    }
}
