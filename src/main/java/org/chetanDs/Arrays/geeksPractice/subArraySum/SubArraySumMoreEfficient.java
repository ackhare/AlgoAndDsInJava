package org.chetanDs.Arrays.geeksPractice.subArraySum;


//Input --> For n numbers , array and sum with which you have to match the sum of numbers
/*   
 Start from the second element and add all 
elements one by one to the curr_sum. If curr_sum becomes equal to the sum, 
then print the solution. 
If curr_sum exceeds the sum, then remove trailing elements 
while curr_sum is greater than the sum.


/*
 Algo
 1)Initialize a variable curr_sum as the first element. curr_sum indicates the sum of the current subarray.
 1)one for loop from 0 to n
   a)Intialiaze cur_sum with arr[i] , start with 0 
 2)second while loop which is a bit confusing is where as soon as sum exceeds 23(input) it will 
   be subtracted by a[start] where start =0 (first time)(in below this happens for i =4) and start is incremented
   
   a)Line 44 is same as before and will stop the loop with return 
   b)Line 53 will like before add sum[i] and when will exceed 23 will venture into while
   c)start is being incremented so that it should not be subtracted by same number again and again 
 
 */

class SubarraySumMoreEfficient 
{ 
	int subArraySum(int arr[], int n, int sum)  
    { 
        int curr_sum = arr[0], start = 0, i; 
  
        // Pick a starting point 
        for (i = 1; i <= n; i++)  
        { 
            // If curr_sum exceeds the sum, then remove the starting elements 
            while (curr_sum > sum && start < i-1) 
            { 
                curr_sum = curr_sum - arr[start]; 
                start++; 
            } 
              
            // If curr_sum becomes equal to sum, then return true 
            if (curr_sum == sum)  
            { 
                int p = i-1; 
                System.out.println("Sum found between indexes " + start 
                        + " and " + p); 
                return 1; 
            } 
              
            // Add this element to curr_sum 
            if (i < n) 
            curr_sum = curr_sum + arr[i]; 
              
        } 
  
        System.out.println("No subarray found"); 
        return 0; 
    } 
  
    public static void main(String[] args)  
    { 
    	SubarraySumMoreEfficient arraysum = new SubarraySumMoreEfficient(); 
        int arr[] = {15, 2, 4, 8, 9, 5, 10, 23}; 
        int n = arr.length; 
        int sum = 23; 
        arraysum.subArraySum(arr, n, sum); 
    } 
} 

/*
The time complexity of method 2 looks more than O(n), but if we take a closer look at the program, 
then we can figure out the time complexity is O(n). We can prove it by counting the number of operations 
performed on every element of arr[] in the worst case. There are at most 2 operations performed on 
every element: (a) the element is added to the curr_sum (b) the element is subtracted from 
curr_sum. So the upper bound on the number of operations is 2n which is O(n).
*/