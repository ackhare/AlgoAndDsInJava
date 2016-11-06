package Recursion.Permutation;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chetan on 18/10/16.
 */
public class Main {
    public static void main(String[] args) {

        int k = 0;
        int n = 10;
        if (k > n) {
//                MessageBox.Show("The number of items to select must be no greater than the total number of items.");
//                return;
        }

        // Make the list of items.
        int ascA = (int) 'A';
        List<String> items = new ArrayList<String>();
        for (int i = 0; i < n; i++)
            items.add(String.valueOf((char) (ascA + i)));

        int[] selections = new int[k];
        List<String> results = new ArrayList<String>();


        PermuteKofNwithDuplicates(0, selections, items, results);
        System.out.println(results);
        //withDuplicatesLabel.Text = withDuplicatesListBox.Items.Count.ToString() + " permutations";

        results = new ArrayList<String>();
        PermuteKofNwithoutDuplicates(0, selections, items, results);
        System.out.println(results);
        //withoutDuplicatesLabel.Text = withoutDuplicatesListBox.Items.Count.ToString() + " permutations";

        // Verify the counts with calculations.
        // Debug.Assert(withDuplicatesListBox.Items.Count == (int)Math.Pow(n, k));
        int total = 1;
        for (int i = n; i > n - k; i--) total *= i;
        // Debug.Assert(withoutDuplicatesListBox.Items.Count == total);
    }

    // Generate permutations allowing duplicates.
    private static void PermuteKofNwithDuplicates(int index, int[] selections, List<String> items, List<String> results) {
        // See if we have made the last assignment.
        if (index == selections.length) {
            // Add the result to the result list.
            String result = "";
            for (int i = 0; i < selections.length; i++)
                result += items.add(String.valueOf(selections[i]));
            results.add(result);
        } else {
            // Make the next assignment.
            for (int i = 0; i < items.size(); i++) {
                // Add item i to the selection.
                selections[index] = i;

                // Recursively make the other assignments.
                PermuteKofNwithDuplicates(index + 1, selections, items, results);
            }
        }
    }

    // Generate permutations not allowing duplicates.
    private static void PermuteKofNwithoutDuplicates(int index, int[] selections, List<String> items, List<String> results) {
        // See if we have made the last assignment.
        if (index == selections.length) {
            // Add the result so far to the result list.
            String result = "";
            for (int i = 0; i < selections.length; i++)
                result += items.add(String.valueOf(selections[i]));
            results.add(result);
        } else {
            // Make the next assignment.
            for (int i = 0; i < items.size(); i++) {
                // Make sure item i hasn't been used yet.
                Boolean used = false;
                for (int j = 0; j < index; j++) {
                    if (selections[j] == i) used = true;
                }

                if (!used) {
                    // Add item i to the selection.
                    selections[index] = i;

                    // Recursively make the other assignments.
                    PermuteKofNwithoutDuplicates(index + 1, selections, items, results);
                }
            }
        }
    }
}
