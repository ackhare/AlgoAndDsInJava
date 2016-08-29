package NumericalAlgo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chetan on 29/8/16.
 */
public class SieveOfEratosthenes {

    public static void main(String[] args) {


        System.out.println(findPrimes(80));

    }


    private static List<Integer> findPrimes(int maxNumber)
    {
        // Create the array.
        List<Boolean> isPrime =  new ArrayList<Boolean>();

        // Cross out multiples of 2.
        for (int p = 4; p <= maxNumber; p += 2)
        {
            isPrime.add(false);
        }

        // Cross out other multiples.
        int stopAt = (int)Math.sqrt(maxNumber);
        for (int p = 3; p <= stopAt; p += 2)
        {
            // Only cross out multiples of primes.
            if ((Boolean)isPrime.get(p))
            {
                for (int multiple = p * p; multiple <= maxNumber; multiple += 2 * p)
                    isPrime.add(false);
            }
        }

        // Copy the primes into a List<int>.
        List<Integer> primes = new ArrayList<Integer>();
        for (int i = 2; i <= maxNumber; i++)
            if (isPrime.get(i-1))
            {
                primes.add(i);
            }

        // Return the primes.
        return primes;
    }
}
