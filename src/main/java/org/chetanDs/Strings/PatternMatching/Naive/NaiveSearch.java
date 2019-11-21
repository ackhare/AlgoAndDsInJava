package org.chetanDs.Strings.PatternMatching.Naive;
//https://www.geeksforgeeks.org/naive-algorithm-for-pattern-searching/
/*
 Input:  txt[] = "THIS IS A TEST TEXT"
        pat[] = "TEST"
Output: Pattern found at index 10

Naive Pattern Searching:
Slide the pattern over text one by one and check for a match.
 If a match is found, then slides by 1 again to check for subsequent matches.
 */
public class NaiveSearch { 
	  
    public static void search(String txt, String pat) 
    { 
        int M = pat.length(); 
        int N = txt.length(); 
  
        /* A loop to slide pat one by one */
        for (int i = 0; i <= N - M; i++) { 
  
            int j; 
  
            /* For current index i, check for pattern  
              match */
            for (j = 0; j < M; j++) 
                if (txt.charAt(i + j) != pat.charAt(j)) 
                    break; 
  
            if (j == M) // if pat[0...M-1] = txt[i, i+1, ...i+M-1] 
                System.out.println("Pattern found at index " + i); 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        String txt = "AABAACAADAABAAABAA"; 
        String pat = "AABA"; 
        search(txt, pat); 
    } 
} 
/*

What is the best case?
The best case occurs when the first character of the pattern 
is not present in text at all.
The number of comparisons in best case is O(n).

What is the worst case ?
The worst case of Naive Pattern Searching occurs in following scenarios.
1) When all characters of the text and pattern are same.
2) Worst case also occurs when only the last character is different.

The number of comparisons in the worst case is O(m*(n-m+1)).
 Although strings which have repeated characters are not likely to appear in English
  text,
   //they may well occur in other applications (for example, in binary texts)
  */
