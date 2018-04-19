/**
 * 
 */

/**
 * @author daicaovu
 *
 */
public class Solution1 {

	/**
	 * 
	 */
	public Solution1() {
		// TODO Auto-generated constructor stub
	}

	public static void mergeTwoSortedArrays(int[] arry1, int[] arry2, int arry1Size,
			                          int arry2Size, int[]arry3) {
		int i = 0, j = 0, k = 0;
		
		while (i < arry1Size && j < arry2Size) {
			if (arry1[i] < arry2[j]) {
				arry3[k++] = arry1[i++];
			} else {
				arry3[k++] = arry2[j++];
			}
		}
		
		while (i < arry1Size) {
			arry3[k++] = arry1[i++];
		}
		
		while (j < arry2Size) {
			//System.out.print("j: " + j + " ");			
			arry3[k++] = arry2[j++];
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 30, 32, 42, 70};
        int[] array2 = {9, 12, 13, 17, 22, 30, 33, 36, 37, 40, 41, 43, 45, 50};
        
        int n1 = array1.length;
        int n2 = array2.length;
        int[] array3 = new int[n1 + n2];
        
        mergeTwoSortedArrays(array1, array2, n1, n2, array3);
        
        for (int indx = 0 ; indx < array3.length ; indx++) {
        	System.out.print(array3[indx] + " ");
        }
	}

}
