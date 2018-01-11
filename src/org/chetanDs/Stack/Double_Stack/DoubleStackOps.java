package Stack.Double_Stack;


public class DoubleStackOps {


    // Push an item onto the top of the left stack.
    static private void pushLeft(int value, DoubleStack TheStack) {
        try {
            TheStack.PushLeft(value);
        } catch (Exception ex) {

        }
    }

    // Push an item onto the top of the right stack.
    static private void pushRight(int value, DoubleStack TheStack) {
        try {
            TheStack.PushRight(value);
        } catch (Exception ex) {

        }
    }

    // Pop a value off of the left stack.
    static private void popLeft(DoubleStack TheStack) {
        try {
            TheStack.PopLeft();
        } catch (Exception ex) {

        }
    }

    // Pop a value off of the right stack.
    static private void popRight(DoubleStack TheStack) {
        try {
            TheStack.PopRight();

        } catch (Exception ex) {

        }
    }

    // Show the stack's values.
    static private void showStack(DoubleStack TheStack) {

        for (int i = TheStack.NextLeft - 1; i >= 0; i--) {
            System.out.println("left stack  viewing show  " + TheStack.Values[i]);
        }


        for (int i = TheStack.NextRight + 1; i < TheStack.Values.length; i++) {
            System.out.println("right stack  viewing show  " + TheStack.Values[i]);
        }
    }

    public static void main(String[] args) {
        // The stack.
        DoubleStack TheStack = new DoubleStack(10);
        pushLeft(1, TheStack);
        pushLeft(2, TheStack);
        pushLeft(3, TheStack);
        pushLeft(4, TheStack);
        pushLeft(5, TheStack);
        pushRight(6, TheStack);
        pushRight(7, TheStack);
        pushRight(8, TheStack);
        pushRight(9, TheStack);
        pushRight(10, TheStack);
        showStack(TheStack);
        popLeft(TheStack);
        popLeft(TheStack);
        popRight(TheStack);
        popRight(TheStack);
        showStack(TheStack);


    }
}

