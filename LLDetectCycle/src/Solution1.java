/**
 * 
 */

/**
 * @author daicaovu
 *
 */
/*
A linked list is said to contain a cycle if any node is visited more than once while traversing the list.

Complete the function provided in the editor below. It has one parameter: a pointer to a Node object named head 
that points to the head of a linked list. Your function must return a boolean denoting whether or not 
there is a cycle in the list. If there is a cycle, return true; otherwise, return false.

Note: If the list is empty, head will be null.

Input Format

Our hidden code checker passes the appropriate argument to your function. You are not responsible for reading any 
input from stdin.

Constraints
0 <= list size <= 100

Output Format

If the list contains a cycle, your function must return true. If the list does not contain a cycle, 
it must return false. The binary integer corresponding to the boolean value returned by your function 
is printed to stdout by our hidden code checker.

Sample Input

The following linked lists are passed as arguments to your function:

=====================================================================================================
There are  scenarios to consider:

1) The list is empty (i.e.,  is null).
2) The list does not contain a cycle, so you can traverse the list and terminate once there are 
   no more nodes (i.e.,  is null).
3) The list contains a cycle, so you will be stuck looping forever if you attempt to traverse it. 

To solve this problem, we must traverse the list using two pointers that we'll refer to as  and . Our  pointer moves forward  node at a time, and our  pointer moves forward  nodes at a time. If at any point in time these pointers refer to the same object, then there is a loop; otherwise, the list does not contain a loop. 


We recommend that you check out Floyd's Tortoise and Hare cycle-finding algorithm.
*/

class Node
{
    int key;
    Node next;
 
    public Node(int item)
    {
        key = item;
        next = null;
    }
}

public class Solution1 {

	/**
	 * 
	 */
	public Solution1() {
		// TODO Auto-generated constructor stub
	}

	boolean hasCycle(Node head) {
	    Node fast = head;
	    
	    while(fast != null && fast.next != null) {
	        fast = fast.next.next;
	        head = head.next;
	        
	        if(head.equals(fast)) {
	            return true;
	        }
	    }
	    return false;
	}	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
