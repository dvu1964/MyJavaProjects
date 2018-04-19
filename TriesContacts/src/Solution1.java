/*
We're going to make our own Contacts application! The application must perform two types of operations:

1) add name, where name is a string denoting a contact name. This must store name as a new contact in the application.
2) find partial, where partial is a string denoting a partial name to search the application for. It must count the 
number of contacts starting with partial and print the count on a new line.

Given n sequential add and find operations, perform each operation in order.

Input Format

The first line contains a single integer, n, denoting the number of operations to perform. 
Each line i of the n subsequent lines contains an operation in one of the two forms defined above.

Constraints
. 1 <= n <= 10^5
. 1 <= |name| <= 21
. 1 <= |partial| <= 21

It is guaranteed that name and partial contain lowercase English letters only.
The input doesn't have any duplicate name for the add operation.

Output Format

For each find partial operation, print the number of contact names starting with partial on a new line.

Sample Input

4
add hack
add hackerrank
find hac
find hak
Sample Output

2
0
Explanation

We perform the following sequence of operations:

1) Add a contact named hack.
2) Add a contact named hackerrank.
3) Find and print the number of contact names beginning with hac. There are currently two contact names 
in the application and both of them start with hac, so we print 2 on a new line.
4) Find and print the number of contact names beginning with hak. There are currently two contact names 
in the application but neither of them start with hak, so we print 0 on a new line.

========================================================================================================
The solution to this challenge is as follows:

. Insert each  in an add operation into a trie, or digital tree.
. Maintain the number of strings starting with a particular prefix in the nodes of the trie itself.
. For each find query, go to the node that represents partial  and print the number of strings having 
  partial as a prefix (you should already be maintaining this value during your string insertions); 
  if no node has partial as a prefix, print 0.
 */
import java.util.*;

class Node {
    int count;
    Node[] children;
    
    Node() {
        this.count = 0;
        this.children = new Node[26];
        Arrays.fill(children, null);
    }
    
    public void insert(Node current, String value) {

        for(char c : value.toCharArray()) {
            int index = c - 'a';
            
            if(current.children[index] == null) {
                current.children[index] = new Node();
            }
            
            current.children[index].count++;
            current = current.children[index];
        }
    }
}

public class Solution1 {

	public Solution1() {
		// TODO Auto-generated constructor stub
	}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Node trie = new Node();
        int n = scan.nextInt();
        
        while(n-- > 0) {
            
            String operation = scan.next();
            String value = scan.next();
            
            // Insertion Operation
            if(operation.equals("add")) {
                trie.insert(trie, value);
            }
            else { // Search Operation
                Node currentNode = trie;
                
                // Traverse through each level
                for(char c : value.toCharArray()) {
                    // Maintain a reference to the Node matching the char for that level
                    currentNode = currentNode.children[c - 'a'];
                    
                    if(currentNode == null) {
                        break;
                    }
                }
                
                // Print the number of results
                System.out.println((currentNode != null) ? currentNode.count : 0);
            }
        }
        scan.close();
    }
}