/**
 * 
 */
/*
For the purposes of this challenge, we define a binary search tree to be a binary tree with the following 
ordering properties:

The data value of every node in a node's left subtree is less than the data value of that node.
The data value of every node in a node's right subtree is greater than the data value of that node.
Given the root node of a binary tree, can you determine if it's also a binary search tree?

Complete the function in your editor below, which has  parameter: a pointer to the root of a binary tree. 
It must return a boolean denoting whether or not the binary tree is a binary search tree. You may have 
to write one or more helper functions to complete this challenge.

Note: We do not consider a binary tree to be a binary search tree if it contains duplicate values.

Input Format

You are not responsible for reading any input from stdin. Hidden code stubs will assemble a binary tree 
and pass its root node to your function as an argument.

Constraints

Output Format

You are not responsible for printing any output to stdout. Your function must return true if the tree is a binary search tree; otherwise, it must return false. Hidden code stubs will print this result as a Yes or No answer on a new line.

Sample Input

tree

Sample Output

Yes
Explanation

The tree in the diagram satisfies the ordering property for a Binary Search Tree, so we print Yes.
 */
/**
 * @author daicaovu
 *
 */

class Node {
    int data;
    Node left;
    Node right;
}

public class Solution1 {

	/**
	 * 
	 */
	public Solution1() {
		// TODO Auto-generated constructor stub
	}

	boolean checkBST(Node root, int minValue, int maxValue) {
	    if (root == null) {
	        return true;
	    }
	    
	    if (root.data < minValue || root.data > maxValue) {
	        return false;
	    }
	    
	    return (checkBST(root.left, minValue, root.data - 1) 
	            &&  
	            checkBST(root.right, root.data + 1, maxValue)
	           );
	}
	    
	boolean checkBST(Node root) {
	    return checkBST(root, 0, 10000);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
