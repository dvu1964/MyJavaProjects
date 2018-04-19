/**
 * 
 */
/*
Consider the following version of Bubble Sort:

for (int i = 0; i < n; i++) {
    
    for (int j = 0; j < n - 1; j++) {
        // Swap adjacent elements if they are in decreasing order
        if (a[j] > a[j + 1]) {
            swap(a[j], a[j + 1]);
        }
    }
    
}
Task 
Given an -element array, A= a(0), a(1),...,a(n-1), of distinct elements, sort array A in ascending order using the 
Bubble Sort algorithm above. Once sorted, print the following three lines:

1. Array is sorted in numSwaps swaps., where numSwaps is the number of swaps that took place.
2. First Element: firstElement, where firstElement is the first element in the sorted array.
3. Last Element: lastElement, where lastElement is the last element in the sorted array.
Hint: To complete this challenge, you must add a variable that keeps a running tally 
of all swaps that occur during execution.

Input Format

The first line contains an integer, n, denoting the number of elements in array A. 
The second line contains n space-separated integers describing the respective values of 
a(0),a(1),...,a(n-1).

Constraints
. 2 < n < 600
. 1 <= a(i) <= 2 X 10^6, V- i E [0, n-1]
, 
Output Format

You must print the following three lines of output:

1. Array is sorted in numSwaps swaps., where numSwaps is the number of swaps that took place.
2. First Element: firstElement, where firstElement is the first element in the sorted array.
3. Last Element: lastElement, where lastElement is the last element in the sorted array.

Sample Input 0

3
1 2 3
Sample Output 0

Array is sorted in 0 swaps.
First Element: 1
Last Element: 3
Explanation 0 
The array is already sorted, so  swaps take place and we print the necessary three lines of output shown above.

Sample Input 1

3
3 2 1
Sample Output 1

Array is sorted in 3 swaps.
First Element: 1
Last Element: 3

Explanation 1 
The array is not sorted, and its initial values are: {3,2,1}. The following 3 swaps take place:

1. {3,2,1} -> {2,3,1}
2. {2,3,1} -> {2,1,3}
3. {2,1,3} -> {1,2,3,}

At this point the array is sorted and we print the necessary three lines of output shown above.

 */

/**
 * @author daicaovu
 *
 */
import java.util.Arrays;

public class Solution1 {
    private static int[] array;
    
	/**
	 * 
	 */
	public Solution1() {
		// TODO Auto-generated constructor stub
	}

    private static void bubbleSort(int[] array) {
        int n = array.length;
        
        // number of swaps for all array iterations
        int totalSwaps = 0; 

        for (int i = 0; i < n; i++) {
            // number of swaps for current array iteration
            int numSwaps = 0;
            
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    numSwaps++; 
                    totalSwaps++;
                }
            }

            if (numSwaps == 0) {
                System.out.printf("Array is sorted in %d swaps.\n", totalSwaps);
                System.out.printf("First Element: %d\n", array[0]);
                System.out.printf("Last Element: %d\n", array[n - 1]);
                
                break;
            }
        }
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {1,2,3};
        bubbleSort(array1);
		int[] array2 = {3,2,1};
        bubbleSort(array2);        
		int[] array3 = {2,3,1};
        bubbleSort(array3);        
	}

}
