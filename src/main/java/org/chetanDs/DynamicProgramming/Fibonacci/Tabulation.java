package org.chetanDs.DynamicProgramming.Fibonacci;
////https://www.geeksforgeeks.org/overlapping-subproblems-property-in-dynamic-programming-dp-1/

//ALgo 
/*
 Here simply f[] is itself the table which is being stored top down
 */

public class Tabulation 
{ 
  int fib(int n) 
  { 
    int f[] = new int[n+1]; 
    f[0] = 0; 
    f[1] = 1; 
    for (int i = 2; i <= n; i++) 
          f[i] = f[i-1] + f[i-2]; 
    return f[n]; 
  } 
  
  public static void main(String[] args) 
  { 
    Tabulation f = new Tabulation(); 
    int n = 9; 
    System.out.println("Fibonacci number is" + " " + f.fib(n)); 
  } 
  
} 