/**
 * 
 */

/*
Alice is taking a cryptography class and finding anagrams to be very useful. We consider two strings to be anagrams 
of each other if the first string's letters can be rearranged to form the second string. In other words, both strings 
must contain the same exact letters in the same exact frequency For example, bacdc and dcbac are anagrams, 
but bacdc and dcbad are not.

Alice decides on an encryption scheme involving two large strings where encryption is dependent on the minimum number 
of character deletions required to make the two strings anagrams. Can you help her find this number?

Given two strings,  and , that may or may not be of the same length, determine the minimum number of character deletions
required to make  and  anagrams. Any characters can be deleted from either of the strings.

This challenge is also available in the following translations:

Chinese
Russian
Input Format

The first line contains a single string, a. 
The second line contains a single string, b.

Constraints

It is guaranteed that a and b consist of lowercase English alphabetic letters (i.e., a through z).
Output Format

Print a single integer denoting the number of characters you must delete to make the two strings anagrams of each other.

Sample Input

cde
abc
Sample Output

4
Explanation

We delete the following characters from our two strings to turn them into anagrams of each other:

Remove d and e from cde to get c.
Remove a and b from abc to get c.
We must delete  characters to make both strings anagrams, so we print 4 on a new line.
*/
/**
 * @author daicaovu
 *
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution1 {
    public static int numberNeeded(String first, String second) {
        int[] charSet = new int[256];
        
        for(int i = 0 ; i < first.length() ; i++) {
        	System.out.println("first charSet[" + i + "]: " + charSet[first.charAt(i)]);
            charSet[first.charAt(i)]++;
        }
        
        for(int i = 0; i < second.length() ; i++) {
        	System.out.println("second charSet[" + i + "]: " + charSet[second.charAt(i)]);        	
            charSet[second.charAt(i)]--;
        }
        
        int numberNeeded = 0;
        for(int i = 0 ; i < 256 ; i++)
            numberNeeded += Math.abs(charSet[i]);
        
        return numberNeeded;
    }
  
    public static void main(String[] args) {
    	/*
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();*/
    	String a = "cde";
    	String b = "abc";
        System.out.println("a: " + a);
        System.out.println("b: " + b);    	
        System.out.println(numberNeeded(a, b));
    }
}
