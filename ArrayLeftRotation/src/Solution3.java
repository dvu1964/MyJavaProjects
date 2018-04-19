/**
 * 
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

/*
To solve this challenge, we perform the following basic steps:

1) Create a new -element (where  is the length of arr) array named rotated to hold the rotated items.
2) Copy the contents of arr over to the new array in two parts:
   a. The d-element contiguous segment from  arr(0) to arr(d-1)  must be copied over to the 
      contiguous segment starting at rotated(n-d).
   b. The (n-d)-element contiguous segment from arr(d)  to arr(n-1) must be copied over to the 
      contiguous segment starting at rotated(0).
3) Reassign the reference to  so that it points to rotated instead.
This is implemented by the following Java code:
*/

public class Solution3 {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        int[] tmp = new int[n];
        for(int i=0; i<k; i++) {
            tmp = a;
            int f = tmp[0];
            for(int j=0; j<n-1; j++) {
                a[j] = tmp[j+1];
            }
            a[n-1] = f;
        }
        return a;
    }
    
    public static void main(String[] args) {
    	/*
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }*/
        
    	int a[] = {3,5,6,2,3,4,1};
    	int n = a.length;
    	int k = 3;
        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();
      
    }
}
