/**
 * 
 */
/*
Brief Description: Given an array A, we have to rotate the array in the right direction by K steps.

Prerequisite: None

Difficulty: Easy

Detailed Explanation: 
Let's begin with an example.
 A = {1, 2, 3, 4, 5} and K = 6, then if we rotate the array by K times, the resultant array would look like: 
 {5, 1, 2, 3, 4} . So, we can see that 
 even if the rotation was of 6 steps, we are getting the result equal to one step rotation. 
That means, if K > N , we can modify K to K % N. 
Let us denote B as the rotated array.Then we can write :
B[(i + K) % N] = A[i]

This is because the i(th) element of A becomes (i + K)th element of B. We are using %N to ensure that it never overflows.
Alternatively, we can see that element at A[(i + (N - K)) % N] becomes B[i].

Pseudo Code:

k=k%n;
for i from 1 to N:
    b[(i+k)%n]=a[i];
for i from 1 to N:
    print b[i];
Time Complexity: O(N ); N is the length of input array.

Space Complexity: O(N)
*/

/**
 * @author daicaovu
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Integer;
import java.util.*;

public class Solution {

	/**
	 * 
	 */
	public Solution() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String tc = br.readLine();                // Reading input from STDIN
        //int testCases = Integer.parseInt(tc);
		int testCases = 1;
        
        for (int i = 0 ; i < testCases ; i++) {
            //Scanner s = new Scanner(System.in);
            //String in2 = s.nextLine();
            
            //String[] input = in2.split(" ");
        	String[] input = {"4", "51"};
            int N = Integer.parseInt(input[0]);
            int K = Integer.parseInt(input[1]);
            //BufferedReader br3 = BufferedReder(new inputStreamReader(System.in));
            //String in3 = s.nextLine();
            //String[] inputArray = in3.split(" ");
            String[] inputArray = {"12754", "12399", "19932", "15060"};
            int[] A = new int[N];
            
            for (int i2 = 0 ; i2 < inputArray.length ; i2++) {
                A[i2] = Integer.parseInt(inputArray[i2]);
             }
            
            //int[] rotatedRight = new int[N];
            K %= N;
            
            for (int a_i = 0 ; a_i < N ; a_i++){
                System.out.print(A[(a_i + (N - K)) % N] + " ");
            }
            /*
            System.arraycopy(A, 0, rotatedRight, K, N - K);
            System.arraycopy(A, N - K, rotatedRight, 0, K);
            for (int a_i = 0 ; a_i < N ; a_i++){
                System.out.print(rotatedRight[a_i] + " ");
            }*/
        }
    }
}
