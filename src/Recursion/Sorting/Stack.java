package Recursion.Sorting;

/**
 * Created by chetan on 30/9/16.
 */
public class Stack
{
    // The stack array.
    public int[] Values;

    // The next empty spot.
    public int NextSpot = 0;

    // Allocate the values array.
    public Stack(int size)
    {
        Values = new int[size];
    }

    // Push an item onto the stack.
    public void Push(int value) throws Exception {
        if (NextSpot >= Values.length) throw new Exception("The stack is full.");
        Values[NextSpot++] = value;
    }

    // Pop a value off of the top of the stack.
    public int Pop() throws Exception {
        if (NextSpot == 0) throw new Exception("The stack is empty.");
        return Values[--NextSpot];
    }
}
