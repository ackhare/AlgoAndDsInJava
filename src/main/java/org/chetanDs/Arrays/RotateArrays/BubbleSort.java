package org.chetanDs.Arrays.RotateArrays;


import org.chetanDs.Utility.ArrayUtil;

/**
 * Created by chetan on 29/8/16.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7};//declaration, instantiation and initialization
        rotate(a, 3);
        ArrayUtil.printArray(a);
    }

    private static void rotate(int[] arr, int order) {
        if (arr == null || order < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }

        for (int i = 0; i < order; i++) {
            for (int j = arr.length - 1; j > 0; j--) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }
    }
}
