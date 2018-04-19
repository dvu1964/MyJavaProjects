/**
 * 
 */

import java.util.*;

/*
A left rotation operation on an array of size n shifts each of the array's elements 1 unit to the left. 
For example, if 2 left rotations are performed on array [1,2,3,4,5,], then the array would become 
[3,4,5,1,2].

Given an array of n integers and a number, d, perform d left rotations on the array. Then print the updated 
array as a single line of space-separated integers.

Input Format

The first line contains two space-separated integers denoting the respective values of n (the number of integers) 
and d (the number of left rotations you must perform). 
The second line contains n space-separated integers describing the respective elements of the array's initial state.

Constraints

Output Format

Print a single line of n space-separated integers denoting the final state of the array after performing d left rotations.

Sample Input

5 4
1 2 3 4 5
Sample Output

5 1 2 3 4
*/

@SuppressWarnings("resource")
public class Solution{

    public static void main(String[] args) {
    	/*
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();*/
    	int n = 5;
    	int k = 2;
        int a[] = {1,2,3,4,5};
        int b[] = new int[n];
        
        /*for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }*/
        
        for(int i = 0 ; i < n ; i++){
            if((i - k) < 0)
                b[n+i-k]=a[i];
            else
                b[i-k]=a[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();
        
        //in.close();
    }
}