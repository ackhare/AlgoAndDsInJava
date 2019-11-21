package org.chetanDs.Strings.PatternMatching.Naive;
//https://www.geeksforgeeks.org/optimized-naive-algorithm-for-pattern-searching/
/*
 Solution: In the original Naive String matching algorithm ,
  we always slide the pattern by 1. When all characters of pattern are different, 
  we can slide the pattern by more than 1. Let us see how can we do this.
   When a mismatch occurs after j matches, we know that the first character of 
   pattern will not match the j matched characters because all characters of pattern 
   are different. So we can always slide the pattern by j without missing any valid 
   shifts. Following is the modified code that is optimized for the special patterns.
 */
class GFG 
{ 
      
/* A modified Naive Pettern Searching 
algorithn that is optimized for the 
cases when all characters of pattern are different */
static void search(String pat, String txt)  
{  
    int M = pat.length();  
    int N = txt.length();  
    int i = 0;  
  
    while (i <= N - M)  
    {  
        int j;  
  
        /* For current index i, check for pattern match */
        for (j = 0; j < M; j++)  
            if (txt.charAt(i + j) != pat.charAt(j))  
                break;  
  
        if (j == M) // if pat[0...M-1] = txt[i, i+1, ...i+M-1]  
        {  
            System.out.println("Pattern found at index "+i);  
            i = i + M;  
        }  
        else if (j == 0)  
            i = i + 1;  
        else
            i = i + j; // slide the pattern by j  
    }  
}  
  
/* Driver code*/
public static void main (String[] args)  
{ 
    String txt = "ABCEABCDABCEABCD";  
    String pat = "ABCD";  
    search(pat, txt);  
}  
} 
