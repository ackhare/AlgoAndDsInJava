package org.chetanDs.Recursion.Fibonacci;

/**
 * Created by chetan on 18/10/16.
 */
class Main {
    static  long[] FibValues = new long[10000];
    public static void main(String[] args) {

        FibValues[0] = 1;
        FibValues[1] = 1;
        int n = 10;
//        if (n > 40)
//        {
//            if (MessageBox.Show("This may take a while. Continue anyway?",
//                    "Continue?", MessageBoxButtons.YesNo)
//                    == DialogResult.No)
//                return;
//        }

        long result = 0;
//        Stopwatch watch = new Stopwatch();
//        watch.Start();
        result = IterativeFibonacci(n);
//        watch.Stop();
        System.out.println("mmmmmmm");
        System.out.println(result);

//        recursiveTimeTextBox.Text = watch.Elapsed.TotalSeconds.ToString("0.000000");
    }

    private static long RecursiveFibonacci(int n) {
        if (n <= 1) return 1;
        return RecursiveFibonacci(n - 1) + RecursiveFibonacci(n - 2);
    }

    private static long TableFibonacci(int n) {
        if (FibValues[n] == 0)
            //FibValues[n] = checked(TableFibonacci(n - 1) + TableFibonacci(n - 2));
        FibValues[n] = TableFibonacci(n - 1) + TableFibonacci(n - 2);
            return FibValues[n];
    }

    private static long IterativeFibonacci(int n) {
        if (n <= 1) return 1;

        long fib_i_1 = 1;   // Fib(1)
        long fib_i_2 = 1;   // Fib(0)
        long fib = 0;
        for (int i = 2; i <= n; i++) {
            //fib = checked(fib_i_1 + fib_i_2);
            fib = (fib_i_1 + fib_i_2);
            fib_i_2 = fib_i_1;
            fib_i_1 = fib;
        }

        return fib;
    }
}
