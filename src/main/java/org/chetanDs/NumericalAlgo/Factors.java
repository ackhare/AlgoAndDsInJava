package org.chetanDs.NumericalAlgo;

import java.util.ArrayList;
import java.util.List;

import org.chetanDs.Utility.CollectionUtil;

/**
 * Created by chetan on 29/8/16.
 */
public class Factors {
    public static void main(String[] args) {



        Integer number=555;
        List factors=find_factors(number);
        CollectionUtil.printList(factors);
    }

     static List find_factors(int number)
    {
//number whose factor to find

        List<Integer> factors = new ArrayList<Integer>();
        // Pull out factors of 2.
        while (number % 2 == 0)
        {
            factors.add(2);
            number /= 2;
        }

        // Look for other factors.
        int factor = 3;
        int stopAt = (int)Math.sqrt(number);
        while (factor <= stopAt)
        {
            // See if factor divides evenly into number.
            while (number % factor == 0)
            {
                // Pull out this factor.
                factors.add(factor);
                number /= factor;

                // Calculate a new stopAt value.
                stopAt = (int)Math.sqrt(number);
            }

            // Go to the next possible factor.
            factor += 2;
        }

        // Add whatever is left over to the factors.
        if (number > 1) factors.add(number);

        return factors;

    }

}
