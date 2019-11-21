package org.chetanDs.Arrays.geeksPractice.subArraySum;

import java.util.HashMap;

//Given an unsorted array of integers, find a subarray which adds to a given number. 
//If there are more than one subarrays with the sum as the given number, print any of them.

//A simple solution is to consider all subarrays one by one and check if the sum of 
//every subarray is equal to the given sum or not. 
//The complexity of this solution would be O(n^2)
/*
 An efficient way is to use a map. The idea is to maintain the sum of elements encountered 
 so far in a variable (say curr_sum). 
 Let the given number is the sum.
 Now for each element, we check if curr_sum – sum exists in the map or not.
 If we found it in the map that means, we have a subarray present with the 
 given sum, else we insert curr_sum into the map and proceed to the next element.
 If all elements of the array are processed and we didn’t find any subarray with 
 the given sum, then subarray doesn’t exist.
 */
//https://stackoverflow.com/questions/39322019/using-a-map-to-find-subarray-with-given-sum-with-negative-numbers
/*
 Algo
 1)We intialiaze empty hash map with start as 0 and end as -1
 2)Run a loop from 0 to n 
 a)add curr_sum with arr[i] , Everytime we check it with input sum and if sum is not present in Hashmap we put it
 b)Line 44 is only for when sum has a start point of 0 and end point might be anything from 0 to n-1
 c)while line number 53 is when there is start point is not intial point while it might be from any to any index
 d)Important point to note that hashmap will consisits of increasing sum that is for a 
 nput: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
 map[1]=0
map[5]=1
map[25]=2
map[28]=3
map[38]=4
SO if sum exists eg 33 and we deduct with a[i](hashMap.containsKey(cur_sum - sum))
so if it matches which is 38 - 5 =33  , here 5 deonotes to key 1 which will add to 1
1+1=2(start + 1) which will denote start and end will be i 
 
 */

class SubarraySumWithNegative  
{ 
	public static void subArraySum(int[] arr, int n, int sum) { 
        //cur_sum to keep track of cummulative sum till that point 
        int cur_sum = 0; 
        int start = 0; 
        int end = -1; 
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>(); 
  
        for (int i = 0; i < n; i++) { 
            cur_sum = cur_sum + arr[i]; 
            //check whether cur_sum - sum = 0, if 0 it means 
            //the sub array is starting from index 0- so stop
            //Below code will work when sum is find between 
            if (cur_sum - sum == 0) { 
                start = 0; 
                end = i; 
                break; 
            } 
            //if hashMap already has the value, means we already  
            // have subarray with the sum - so stop 
            if (hashMap.containsKey(cur_sum - sum)) { 
                start = hashMap.get(cur_sum - sum) + 1; 
                end = i; 
                break; 
            } 
            //if value is not present then add to hashmap 
            hashMap.put(cur_sum, i); 
  
        } 
        // if end is -1 : means we have reached end without the sum 
        if (end == -1) { 
            System.out.println("No subarray with given sum exists"); 
        } else { 
            System.out.println("Sum found between indexes " 
                            + start + " to " + end); 
        } 
  
    } 
  
    // Driver code 
    public static void main(String[] args) { 
        int[] arr =  {1, 4, 20, 3, 10, 5}; 
        int n = arr.length; 
        int sum = 33; 
        subArraySum(arr, n, sum); 
  
    } 
} 
//Time Complexity : O(n^2) in worst case.