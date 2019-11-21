package org.chetanDs.DynamicProgramming.Fibonacci;

//https://www.geeksforgeeks.org/overlapping-subproblems-property-in-dynamic-programming-dp-1/
//Top Down
/*
 1)Intilaize a look up arrary with NIL
 2)first consult the look up if the look up is nil at that n only that we will do computationm and put it 
 else 
 return lookup of n
 3)Due to recursion in FIb(n) this will continue til n
 */
/* Java program for Memoized version */
public class Memoization 
{ 
  final int MAX = 100; 
  final int NIL = -1; 
  
  int lookup[] = new int[MAX]; 
  
  /* Function to initialize NIL values in lookup table */
  void _initialize() 
  { 
    for (int i = 0; i < MAX; i++) 
        lookup[i] = NIL; 
  } 
  
  /* function for nth Fibonacci number */
  int fib(int n) 
  { 
    if (lookup[n] == NIL) 
    { 
      if (n <= 1) 
          lookup[n] = n; 
      else
          lookup[n] = fib(n-1) + fib(n-2); 
    } 
    return lookup[n]; 
  } 
  
  public static void main(String[] args) 
  { 
	  Memoization f = new Memoization(); 
    int n = 40; 
    f._initialize(); 
    System.out.println("Fibonacci number is" + " " + f.fib(n)); 
  } 
  
} 
