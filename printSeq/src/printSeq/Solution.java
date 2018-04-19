package printSeq;

public class Solution {

	public Solution() {
	}

	private static void printUp(int start, int end) {    

		System.out.print(start + " ");

		if(start < end){
			printUp(start + 1, end);
		    System.out.print(start + " "); //backtracking
		}
	}
	
	public static void main(String[] args) {
		printUp(3, 7);
		System.out.println("\n");
		printUp(7, 3);
		System.out.println("\n");
		printUp(3, 3);
		System.out.println("\n");
		printUp(0, 0);
		System.out.println("\n");
		printUp(-3, 3);
		System.out.println("\n");		
	}

}
