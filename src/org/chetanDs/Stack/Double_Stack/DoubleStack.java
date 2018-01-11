package Stack.Double_Stack;

/**
 * Created by chetan on 30/9/16.
 */
public class DoubleStack
{
    // The stack array.
    public int[] Values;

    // The next empty spots.
    public int NextLeft, NextRight;

    // Allocate the values array.
    public DoubleStack(int size)
    {
        Values = new int[size];
        NextLeft = 0;
        NextRight = size - 1;
    }

    // Push an item onto the left stack.
    public void PushLeft(int value) throws Exception {
        if (NextLeft > NextRight) throw new Exception("The stack is full.");
        Values[NextLeft++] = value;
    }

    // Push an item onto the right stack.
    public void PushRight(int value) throws Exception
    {
        if (NextLeft > NextRight) throw new Exception("The stack is full.");
        Values[NextRight--] = value;
    }

    // Pop a value off of the top of the left stack.
    public int PopLeft() throws Exception
    {
        if (NextLeft == 0) throw new Exception("The stack is empty.");
        return Values[--NextLeft];
    }

    // Pop a value off of the top of the right stack.
    public int PopRight() throws Exception
    {
        if (NextRight == Values.length - 1) throw new Exception("The stack is empty.");
        return Values[++NextRight];
    }
}
