package org.chetanDs.Search;

import java.util.Random;

/**
 * Created by chetan on 1/10/16.
 */
public class SearchOps {
    private static int[] create()
    {
        int[] Values = null;
         Random Rand = new Random();
        int numItems = 10;
        int minStep = 3;
        int maxStep = 5;
        Values = new int[numItems];
        int value = 0;
        for (int i = 0; i < numItems; i++)
        {
            Values[i] = value;
            value += Rand.nextInt();
        }

        return Values;

    }



    // Perform the searches.
    private static void  search(int[] values,int target)
    {
        // Linear search.
        Searchers.LinearSearch(values,target);

        // Binary search.
        Searchers.BinarySearch(values,target);

        // Interpolation search.
        Searchers.InterpolationSearch(values,target);

        // Interpolation search 2.
        Searchers.InterpolationSearch2(values,target);

    }


    public static void main(String[] args) {

       int[] Values= create();
       search(Values,10);

    }

}

