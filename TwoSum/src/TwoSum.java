// Java implementation using Hashing
import java.io.*;
 
class TwoSum
{
    private static final int MAX = 100000; // Max size of Hashmap

    static int[] printPairs2(int[] nums, int target) {
        int[] map = new int[20050];
          int size = 5;
          for (int i = 0; i < nums.length; i++) {
              map[nums[i] + size] = (i + 1);
              int diff = target - nums[i + 1] + size;
              System.out.println("diff: " + diff);
              if (diff < 0) continue;
              int d = map[diff];
              System.out.println("d: " + d);              
              if (d > 0) {
                  System.out.println("Pair with given sum " +
                          target + " is (" + nums[i+1] +
                          ", " + nums[d-1] + ")");            	  
                  return new int[]{d - 1, i + 1};
              }
          }
          return null;
    }
 
    static void printPairs(int arr[],int sum)
    {
        // Declares and initializes the whole array as false
        boolean[] binmap = new boolean[MAX];
    	
        for (int i=0; i<arr.length; ++i)
        {
            int temp = sum-arr[i];
 
            // checking for condition
            if (temp>=0 && binmap[temp])
            {
                System.out.println("Pair with given sum " +
                                    sum + " is (" + arr[i] +
                                    ", "+temp+")");
            }
            binmap[arr[i]] = true;
        }
    }
 
    // Main to test the above function
    public static void main (String[] args)
    {
        //int A[] = {1, 4, 45, 6, 10, 8};
        int A[] = {1, 1, 45, 6, 10, 8};
        int n = 16;
        printPairs(A,  n);
        printPairs2(A,  n);        
    }
}
 
// This article is contributed by Aakash Hasija