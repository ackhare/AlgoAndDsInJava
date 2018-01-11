package Stack.Simple_Stack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chetan on 30/9/16.
 */
public class StackOps {

    List list= new ArrayList(10);

    // Push a value onto the stack.
    static private void push(String str, Stack<String> TheStack)
    {
        TheStack.Push(str);
        //ShowStack(TheStack);
    }

    // Pop a value off of the stack.
   static  private void pop( Stack<String> TheStack)
    {
        try
        {
            TheStack.Pop();
            //ShowStack(TheStack);
        }
        catch (Exception ex)
        {

        }
    }

   static private void showStack( Stack<String> TheStack)
    {

        for (StackCell<String> cell = TheStack.Top; cell != null; cell = cell.Next)
        {
            System.out.println("value of cell "+cell.Value);
        }
    }


    public static void main(String[] args) {

        Stack<String> TheStack = new Stack<String>();
        push("123",TheStack);
        push("456",TheStack);
        push("634",TheStack);
        push("890",TheStack);
        push("97845",TheStack);
        System.out.println("pushed values are");
showStack(TheStack);

        pop(TheStack);
        pop(TheStack);
System.out.println("values popped completed");
        showStack(TheStack);


    }

}