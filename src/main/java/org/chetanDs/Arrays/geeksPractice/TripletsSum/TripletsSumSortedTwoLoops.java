package org.chetanDs.Arrays.geeksPractice.TripletsSum;

import java.util.Arrays;

/*
 Input : arr[] = {-2, 0, 1, 3}
        sum = 2.
Output : 2
Explanation :  Below are triplets with sum less than 2
               (-2, 0, 1) and (-2, 0, 3) 
               
 */
/*
 
1) Sort the input array in increasing order.
2) Initialize result as 0.
3) Run a loop from i = 0 to n-2.  An iteration of this loop finds all
   triplets with arr[i] as first element.
     a) Initialize other two elements as corner elements of subarray
        arr[i+1..n-1], i.e., j = i+1 and k = n-1
        So j will be on left extreme corner while right extreme corner is k 
        Then we put a while loop with (j<k) 
        and if  arr[i] + arr[j] + arr[k] >= sum
        then we do k--(to end while loop and go to else condition(remember array is sorted))
        As we go to lower values a[k] then we go to else condition 
        ans += (k - j); 
	    and increase j so that we can get another values and end while loop
        Below is simply we check if sum is on more on left extreme or right extreme 
        
        
     b) Move j and k toward each other until they meet, i.e., while (j = sum), 
     then do k--

    // Else for current i and j, there can (k-j) possible third elements
    // that satisfy the constraint.
   (ii) Else Do ans += (k - j) followed by j++ 
 
 */

public class TripletsSumSortedTwoLoops {

	
	    static int arr[] = new int[]{5, 1, 3, 4, 7}; 
	      
	    static int countTriplets(int n, int sum) 
	    { 
	        // Sort input array 
	        Arrays.sort(arr); 
	       
	        // Initialize result 
	        int ans = 0; 
	       
	        // Every iteration of loop counts triplet with 
	        // first element as arr[i]. 
	        for (int i = 0; i < n - 2; i++) 
	        { 
	            // Initialize other two elements as corner elements 
	            // of subarray arr[j+1..k] 
	            int j = i + 1, k = n - 1; 
	       
	            // Use Meet in the Middle concept 
	            while (j < k) 
	            { 
	                // If sum of current triplet is more or equal, 
	                // move right corner to look for smaller values 
	                if (arr[i] + arr[j] + arr[k] >= sum) 
	                    k--; 
	       
	                // Else move left corner 
	                else
	                { 
	                    // This is important. For current i and j, there 
	                    // can be total k-j third elements. 
	                    ans += (k - j); 
	                    j++; 
	                } 
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


