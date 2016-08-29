package NumericalAlgo;

/**
 * Created by chetan on 29/8/16.
 */
public class GCD {


    private static long findGCD(long a, long b)
    {
        while (b != 0)
        {
            // Calculate the remainder.
            long remainder = a % b;

            // Calculate GCD(b, remainder).
            a = b;
            b = remainder;
        }

        // GCD(a, 0) is a.
        return a;
    }

}
