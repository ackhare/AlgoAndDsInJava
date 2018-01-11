package Recursion.Selection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chetan on 18/10/16.
 */
public class Main {

    public static void main(String[] args) {
           int k = 0;
            int n = 10;
//            if (k > n)
//            {
//                MessageBox.Show("The number of items to select must be no greater than the total number of items.");
//                return;
//            }

            // Make the list of items.
            int ascA = (int)'A';
            List<String> items = new ArrayList<String>();
            for (int i = 0; i < n; i++)
                items.add(String.valueOf((char)(ascA + i)));

            int[] selections = new int[k];
            List<String> results = new ArrayList<String>();

            SelectKofNwithDuplicates(0, selections, items, results);
        System.out.println(results);
           // withDuplicatesLabel.Text = withDuplicatesListBox.Items.Count.ToString() + " combinations";

            results = new ArrayList<String>();
            SelectKofNwithoutDuplicates(0, selections, items, results);
            System.out.println(results);
           // withoutDuplicatesLabel.Text = withoutDuplicatesListBox.Items.Count.ToString() + " combinations";
//
//            // Verify the counts with calculations.
//            Debug.Assert(withDuplicatesListBox.Items.Count == Choose(n + k - 1, k));
//            Debug.Assert(withoutDuplicatesListBox.Items.Count == Choose(n, k));
    }

    // Generate combinations allowing duplicates.
    private static void SelectKofNwithDuplicates(int index, int[] selections, List<String> items, List<String> results)
    {
        // See if we have made the last assignment.
        if (index == selections.length)
        {
            // Add the result to the result list.
            String result = "";
            for (int i = 0; i < selections.length; i++)
                result += items.add(String.valueOf(selections[i]));
            results.add(result);
        }
        else
        {
            // Get the smallest value we can use for the next selection.
            int start = 0;
            if (index > 0) start = selections[index - 1];

            // Make the next assignment.
            for (int i = start; i < items.size(); i++)
            {
                // Add item i to the selection.
                selections[index] = i;

                // Recursively make the other assignments.
                SelectKofNwithDuplicates(index + 1, selections, items, results);
            }
        }
    }

    // Generate combinations not allowing duplicates.
    private static void SelectKofNwithoutDuplicates(int index, int[] selections, List<String> items, List<String> results)
    {
        // See if we have made the last assignment.
        if (index == selections.length)
        {
            // Add the result so far to the result list.
            String result = "";
            for (int i = 0; i < selections.length; i++)
                result += items.add(String.valueOf(selections[i]));
            results.add(result);
        }
        else
        {
            // Get the smallest value we can use for the next selection.
            int start = 0;
            if (index > 0) start = selections[index - 1] + 1;

            // Make the next assignment.
            for (int i = start; i < items.size(); i++)
            {
                // Add item i to the selection.
                selections[index] = i;

                // Recursively make the other assignments.
                SelectKofNwithoutDuplicates(index + 1, selections, items, results);
            }
        }
    }

}
