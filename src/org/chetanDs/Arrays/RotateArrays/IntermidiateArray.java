package org.chetanDs.Arrays.RotateArrays;


import org.chetanDs.Utility.ArrayUtil;

/**
 * Created by chetan on 29/8/16.
 */

/*
Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
Solution 1 - Intermediate Array

In a straightforward way, we can create a new array and then copy elements to the new array.
Then change the original array by using System.arraycopy().
 */


class IntermidiateArray {

    public static void main(String[] args) {


        int a[] = {1, 2, 3, 4, 5, 6, 7};//declaration, instantiation and initialization
        rotate(a, 3);
        ArrayUtil.printArray(a);
    }

    private static void rotate(int[] nums, int k) {
        if (k > nums.length)
            k = k % nums.length;

        int[] result = new int[nums.length];

        for (int i = 0; i < k; i++) {
            result[i] = nums[nums.length - k + i];
        }

        int j = 0;
        for (int i = k; i < nums.length; i++) {
            result[i] = nums[j];
            j++;
        }

        System.arraycopy(result, 0, nums, 0, nums.length);
    }
}