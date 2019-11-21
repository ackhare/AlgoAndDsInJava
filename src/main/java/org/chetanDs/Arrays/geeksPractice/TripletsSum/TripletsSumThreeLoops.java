package org.chetanDs.Arrays.geeksPractice.TripletsSum;
/*
 Input : arr[] = {-2, 0, 1, 3}
        sum = 2.
Output : 2
Explanation :  Below are triplets with sum less than 2
               (-2, 0, 1) and (-2, 0, 3) 
               
 */
/*
 
 Below is simple program with three loop only thing is that second and third loop start with 
 previous loop + 1 and main logic is is that we will just increases counter when 
 sum is found
 One thing in this SUM problem is that first loop will run n-2, second loop will run n-1 and third will run n time loop
 
 
 */

public class TripletsSumThreeLoops {

	static int arr[] = new int[]{5, 1, 3, 4, 7}; 
    
    static int countTriplets(int n, int sum) 
    { 
        // Initialize result 
        int ans = 0; 
       
        // Fix the first element as A[i] 
        for (int i = 0; i < n-2; i++) 
        { 
           // Fix the second element as A[j] 
           for (int j = i+1; j < n-1; j++) 
           { 
               // Now look for the third number 
               for (int k = j+1; k < n; k++) 
                   if (arr[i] + arr[j] + arr[k] < sum) 
                       ans++; 
           } 
        } 
       
        return ans; 
    } 
      
    // Driver method to test the above function 
    public static void main(String[] args)  
    { 
        int sum = 12;  
        System.out.println(countTriplets(arr.length, sum)); 
    } 
}
