package Sorting;

/**
 * Created by chetan on 1/10/16.
 */
public  class Sorts
    {

           // #region Insertionsort

// Insertionsort.
public static void Insertionsort(int[] values)
        {
        for (int i = 1; i < values.length; i++)
        {
        // Find the spot where item i belongs.
        int item = values[i];
        int index = 0;
        while ((index <= i) && (item.CompareTo(values[index]) > 0))
        index++;

        // The item belongs in position index.
        // Move the items between values[i - 1] and values[index]
        // one spot to the right to make room.
        for (int j = i - 1; j >= index; j--)
        values[j + 1] = values[j];

        // Deposit the item in position index.
        values[index] = item;
        }
        }

//        #endregion Insertionsort
//
//        #region Selectionsort

// Selectionsort.
public static void Selectionsort(int[] values)
        {
        for (int i = 0; i < values.length - 1; i++)
        {
        // Find the smallest item with index >= i.
        int bestIndex = i;
        int bestValue = values[bestIndex];
        for (int j = i + 1; j < values.length; j++)
        {
        // See if values[j] is smaller.
        if (bestValue.CompareTo(values[j]) > 0)
        {
        // Update the best value.
        bestIndex = j;
        bestValue = values[j];
        }
        }

        // Swap values[i] and values[bestIndex].
        values[bestIndex] = values[i];
        values[i] = bestValue;
        }
        }

//        #endregion Selectionsort
//
//        #region Quicksort

// Quicksort.
public static void Quicksort(int[] values)
        {
        DoQuicksort(values, 0, values.length - 1);
        }

// Perform the quicksort algorithm for the indicated part of the array.
private static void DoQuicksort(int[] values, int min, int max)
        {
        // If min >= max, there's nothing to sort.
        if (min >= max) return;

        // Pick the dividing item.
        int divider = values[min];
        int left = min;
        int right = max;

        // Divide the array into two halves.
        while (left < right)
        {
        // The empty spot is at values[left].
        // Look down from position right.
        while ((right > left) && (values[right].CompareTo(divider) > 0)) right--;

        // See if we're done.
        if (right <= left) break;

        // Swap this item into the left side.
        values[left] = values[right];
        left++;


        // The empty spot is at values[right].
        // Look up from position left.
        while ((right > left) && (values[left].CompareTo(divider) <= 0)) left++;

        // See if we're done.
        if (right <= left) break;

        // Swap this item into the right side.
        values[right] = values[left];
        right--;
        }

        // Desposit the dividing item.
        values[left] = divider;

        // Recurse.
        DoQuicksort(values, min, left - 1);
        DoQuicksort(values, left + 1, max);
        }

//        #endregion Quicksort
//
//        #region Heapsort

// Heapsort.
public static void Heapsort(int[] values)
        {
        // Build the heap.
        BuildHeap(values);

        // Pull out the values in sorted order.
        HeapToSortedArray(values);
        }

// Build the initial heap.
private static void BuildHeap(int[] values)
        {
        // Start at index 1 because the values form a
        // trivial heap when only item 0 is in the tree.
        for (int i = 1; i < values.length; i++)
        {
        // Add values[i] to the bottom of the heap.
        // Fix the heap from the bottom up.
        int child = i;
        for (; ; )
        {
        int parent = (child - 1) / 2;

        // Compare the value to its parent.
        // If values[child] <= values[parent], the tree is a heap.
        if (values[child].CompareTo(values[parent]) <= 0) break;

        // Swap the new value and its parent.
        int temp = values[child];
        values[child] = values[parent];
        values[parent] = temp;

        // Move up to the next level.
        child = parent;
        }
        }
        }

// Convert the heap into a sorted array.
private static void HeapToSortedArray(int[] values)
        {
        // Loop through the array from back-to-front.
        for (int i = values.length - 1; i > 0; i--)
        {
        // Swap values[0] and values[i].
        int temp = values[i];
        values[i] = values[0];
        values[0] = temp;

        // Fix the heap by pushing the root item down into the tree.
        int parent = 0;
        for (; ; )
        {
        // Get the child indexes.
        int child1 = 2 * parent + 1;
        if (child1 >= i) break; // Outside of the current heap.

        // If child2 is outside of the current heap, just use child1.
        int child2 = child1 + 1;
        if (child2 >= i) child2 = child1;

        // Find the larger child.
        int largerIndex = child1;
        int largerValue = values[child1];
        if (largerValue.CompareTo(values[child2]) < 0)
        {
        largerIndex = child2;
        largerValue = values[child2];
        }

        // If the larger child is <= the parent, it's a heap again.
        if (largerValue.CompareTo(values[parent]) <= 0) break;

        // Swap the parent with the larger child.
        values[largerIndex] = values[parent];
        values[parent] = largerValue;
        parent = largerIndex;
        }
        }
        }

// Debugging methods.
private static String ShowHeap(int[] values)
        {
        return ShowHeapPreorder(values, 0, 0);
        }
private static String ShowHeapPreorder(int[] values, int i, int indent)
        {
            String format = "{0," + indent.toString() + "}\r\n";
            String result = String.Format(format, values[i].ToString());

        int child1 = (2 * i) + 1;
        if (child1 < values.length)
        result += ShowHeapPreorder(values, child1, indent + 4);

        child1++;
        if (child1 < values.Length)
        result += ShowHeapPreorder(values, child1, indent + 4);

        return result;
        }

//        #endregion Heapsort
//
//        #region Mergesort

// Mergesort.
public static void Mergesort(int[] values)
        {
        // Make a temporary storage array so we don't have to
        // make lots of arrays in the calls to DoMergesort.
        int[] temp = new int[values.length];

        // Perform the sort.
        DoMergesort(temp, values, 0, values.length - 1);
        }

// Perform the sort.
private static void DoMergesort(int[] temp, int[] values, int min, int max)
        {
        // If we're working with 0 or 1 items, we're done.
        if (max - min + 1 < 2) return;

        // Find the middle index;
        int mid = (max + min) / 2;

        // Recursively sort the two halves [min, mid] and [mid + 1, max].
        DoMergesort(temp, values, min, mid);
        DoMergesort(temp, values, mid + 1, max);

        // Use the temporary array to merge the results.
        int leftIndex = min;
        int rightIndex = mid + 1;
        int smallerValue;
        for (int i = min; i <= max; i++)
        {
        if (leftIndex > mid)
        {
        // We ran out of left values. Use the next right value.
        smallerValue = values[rightIndex];
        rightIndex++;
        }
        else if (rightIndex > max)
        {
        // We ran out of right values. Use the next left value.
        smallerValue = values[leftIndex];
        leftIndex++;
        }
        else
        {
        // Use whichever value is smaller.
        if (values[leftIndex].CompareTo(values[rightIndex]) <= 0)
        {
        // Use the left value.
        smallerValue = values[leftIndex];
        leftIndex++;
        }
        else
        {
        // Use the right value.
        smallerValue = values[rightIndex];
        rightIndex++;
        }
        }

        // Move the selected value into the temp array.
        temp[i] = smallerValue;
        }

        // Copy the results back into the values array.
        for (int i = min; i <= max; i++)
        {
        values[i] = temp[i];
        }
        }

//        #endregion Mergesort
//
//        #region Mergesort2

// Mergesort2.
// This is the same as the previous version except it uses
// Array.Copy to copy values from the temporary array back
// into the main values array. For small arrays (up to 1,000 items),
// the first version is faster, presumably because Array.Copy has
// some overhead. For larger arrays (over 10,000), the second version
// is faster.
public static void Mergesort2(int[] values)
        {
        // Make a temporary storage array so we don't have to
        // make lots of arrays in the calls to DoMergesort2.
        int[] temp = new int[values.length];

        // Perform the sort.
        DoMergesort2(temp, values, 0, values.length - 1);
        }

// Perform the sort.
private static void DoMergesort2(int[] temp, int[] values, int min, int max)
        {
        // If we're working with 0 or 1 items, we're done.
        if (max - min + 1 < 2) return;

        // Find the middle index;
        int mid = (max + min) / 2;

        // Recursively sort the two halves [min, mid] and [mid + 1, max].
        DoMergesort2(temp, values, min, mid);
        DoMergesort2(temp, values, mid + 1, max);

        // Use the temporary array to merge the results.
        int leftIndex = min;
        int rightIndex = mid + 1;
       int smallerValue;
        for (int i = min; i <= max; i++)
        {
        if (leftIndex > mid)
        {
        // We ran out of left values. Use the next right value.
        smallerValue = values[rightIndex];
        rightIndex++;
        }
        else if (rightIndex > max)
        {
        // We ran out of right values. Use the next left value.
        smallerValue = values[leftIndex];
        leftIndex++;
        }
        else
        {
        // Use whichever value is smaller.
        if (values[leftIndex].CompareTo(values[rightIndex]) <= 0)
        {
        // Use the left value.
        smallerValue = values[leftIndex];
        leftIndex++;
        }
        else
        {
        // Use the right value.
        smallerValue = values[rightIndex];
        rightIndex++;
        }
        }

        // Move the selected value into the temp array.
        temp[i] = smallerValue;
        }

        // Copy the results back into the values array.
        // This version uses a .NET library tool:
        Array.Copy(temp, min, values, min, max - min + 1);
        }

//        #endregion Mergesort2
//
//        #region Bubblesort

// Bubblesort.
public static void Bubblesort(int[] values)
        {
        boolean madeSwap = false;
        do
        {
        madeSwap = false;
        for (int i = 1; i < values.length; i++)
        {
        // See if values[i] < values[i - 1].
        if (values[i].CompareTo(values[i - 1]) < 0)
        {
        // Swap values[i] and values[i - 1].
        int temp = values[i];
        values[i] = values[i - 1];
        values[i - 1] = temp;
        madeSwap = true;
        }
        }
        } while (madeSwap);
        }

//        #endregion Bubblesort
//
//        #region Bubblesort2

// Bubblesort2.
public static void Bubblesort2(int[] values)
        {
            boolean madeSwap = false;
        for (; ; )
        {
        // Swap down.
        madeSwap = false;
        for (int i = 1; i < values.length; i++)
        {
        // See if values[i] < values[i - 1].
        if (values[i].CompareTo(values[i - 1]) < 0)
        {
        // Swap values[i] and values[i - 1].
        int temp = values[i];
        values[i] = values[i - 1];
        values[i - 1] = temp;
        madeSwap = true;
        }
        }
        if (!madeSwap) break;

        // Swap up.
        madeSwap = false;
        for (int i = values.length - 1; i > 0; i--)
        {
        // See if values[i] < values[i - 1].
        if (values[i].CompareTo(values[i - 1]) < 0)
        {
        // Swap values[i] and values[i - 1].
        int temp = values[i];
        values[i] = values[i - 1];
        values[i - 1] = temp;
        madeSwap = true;
        }
        }
        if (!madeSwap) break;
        }
        }

//        #endregion Bubblesort2

        }
