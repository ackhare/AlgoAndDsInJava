package org.chetanDs.Arrays.geeksPractice.subArraySum;

//Simple solution with O(n2) time
//Input --> For n numbers , array and sum with which you have to match the sum of numbers

/*
 Algo
 1)one for loop from 0 to n
   a)Intialiaze cur_sum with arr[i] 
 2)second array j from i+1 to n where we do 
   a)if curr_sum equal to sum then we print i and second index(j-1) If Not
   b)For efficensy we put break if sum exceeds input sum(see 1(a)) or j==n
   c)Everytime we increase cur_sum= curr_sum + arr[j]; 
 
 */

class SubarraySum  
{ 
    /* Returns true if the there is a subarray of arr[] with a sum equal to 
       'sum' otherwise returns false.  Also, prints the result */
    int subArraySum(int arr[], int n, int sum)  
    { 
        int curr_sum, i, j; 
  
        // Pick a starting point 
        for (i = 0; i < n; i++)  
        { 
            curr_sum = arr[i]; 
  
            // try all subarrays starting with 'i' 
            for (j = i + 1; j <= n; j++)  
            { 
                if (curr_sum == sum)  
                { 
                    int p = j - 1; 
                    System.out.println("Sum found between indexes " + i 
                            + " and " + p); 
                    return 1; 
                } 
                if (curr_sum > sum || j == n) 
                    break; 
                curr_sum = curr_sum + arr[j]; 
            } 
        } 
  
        System.out.println("No subarray found"); 
        return 0; 
    } 
  
    public static void main(String[] args)  
    { 
        SubarraySum arraysum = new SubarraySum(); 
        int arr[] = {15, 2, 4, 8, 9, 5, 10, 23}; 
        int n = arr.length; 
        int sum = 23; 
        arraysum.subArraySum(arr, n, sum); 
    } 
} 
//Time Complexity : O(n^2) in worst case.