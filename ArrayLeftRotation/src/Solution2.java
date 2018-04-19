/**
 * 
 */


public class Solution2 {

    public static void main(String[] args) {
    	/*
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }*/
    	int k = 2;
    	int a[] = {2, 3, 1, 5, 4, 6};
        rotateLeft(a, k);
    }
    
    private static void rotateLeft(int[] a, int d) {
        int n = a.length;
        int[] rotated = new int[n];
        System.arraycopy(a, d, rotated, 0, n - d);
        System.arraycopy(a, 0, rotated, n - d, d);
        for(int a_i=0; a_i < n; a_i++){
            System.out.print(rotated[a_i] + " ");
        }
        System.out.println();
    }
}
