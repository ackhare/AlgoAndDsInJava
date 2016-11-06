package Recursion.AddSmaller;

/**
 * Created by chetan on 18/10/16.
 */
public class Main {
    public static void main(String[] args) {
            int n = 10;
            long result = 0;
//            Stopwatch watch = new Stopwatch();
//            watch.Start();
            result = RecursiveAddSmaller(n);
//            watch.Stop();

        System.out.println(result);
            //recursiveTimeTextBox.Text = watch.Elapsed.TotalSeconds.ToString("0.000000");


        //            int n = int.Parse(nTextBox.Text);
//            long result = 0;
//            Stopwatch watch = new Stopwatch();
//            watch.Start();
            result = NonrecursiveAddSmaller(n);
//            watch.Stop();
//
 System.out.println(result);
//            nonrecursiveTimeTextBox.Text = watch.Elapsed.TotalSeconds.ToString("0.000000");
    }

      // Calculate AddSmaller recursively.
//        private void recursiveButton_Click(object sender, EventArgs e)
//        {
//            recursiveResultTextBox.Clear();
//            recursiveTimeTextBox.Clear();
//            Cursor = Cursors.WaitCursor;
//            Refresh();
//
//            int n = int.Parse(nTextBox.Text);
//            long result = 0;
//            Stopwatch watch = new Stopwatch();
//            watch.Start();
//            result = RecursiveAddSmaller(n);
//            watch.Stop();
//
//            recursiveResultTextBox.Text = result.ToString();
//            recursiveTimeTextBox.Text = watch.Elapsed.TotalSeconds.ToString("0.000000");
//
//            Cursor = Cursors.Default;
//        }
        private static long RecursiveAddSmaller(int n)
        {
            if (n == 0) return 0;
            return n + RecursiveAddSmaller(n - 1);
        }

        // Calculate AddSmaller non-recursively.
//        private void nonrecursiveButton_Click(object sender, EventArgs e)
//        {
//            nonrecursiveResultTextBox.Clear();
//            nonrecursiveTimeTextBox.Clear();
//            Cursor = Cursors.WaitCursor;
//            Refresh();
//
//            int n = int.Parse(nTextBox.Text);
//            long result = 0;
//            Stopwatch watch = new Stopwatch();
//            watch.Start();
//            result = NonrecursiveAddSmaller(n);
//            watch.Stop();
//
//            nonrecursiveResultTextBox.Text = result.ToString();
//            nonrecursiveTimeTextBox.Text = watch.Elapsed.TotalSeconds.ToString("0.000000");
//
//            Cursor = Cursors.Default;
//        }
        private static long NonrecursiveAddSmaller(int n)
        {
            long result = 0;
            while (n > 0)
            {
                result = result + n;
                n = n - 1;
            }
            return result;
        }

}
