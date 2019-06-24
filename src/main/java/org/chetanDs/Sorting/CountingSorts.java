package org.chetanDs.Sorting;

/**
 * Created by chetan on 30/9/16.
 */
public class CountingSorts {


    // Countingsort.
    public static void Countingsort(int[] values, int min, int max) {
        // Make the counts.
        int[] counts = new int[max - min + 1];
        for (int i = 0; i < values.length; i++)
            counts[values[i] - min]++;

        // Write the values back into the array.
        int index = 0;
        int nextValue = min;
        for (int i = 0; i < counts.length; i++) {
            for (int j = 0; j < counts[i]; j++)
                values[index++] = nextValue;
            nextValue++;
        }
    }
}

