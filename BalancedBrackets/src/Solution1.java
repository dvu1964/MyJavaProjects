/**
 * 
 */
/*
A bracket is considered to be any one of the following characters: (, ), {, }, [, or ].

Two brackets are considered to be a matched pair if the an opening bracket (i.e., (, [, or {) occurs to the left 
of a closing bracket (i.e., ), ], or }) of the exact same type. There are three types of 
matched pairs of brackets: [], {}, and ().

A matching pair of brackets is not balanced if the set of brackets it encloses are not matched. 
For example, {[(])} is not balanced because the contents in between { and } are not balanced. 
The pair of square brackets encloses a single, unbalanced opening bracket, (, and the pair of 
parentheses encloses a single, unbalanced closing square bracket, ].

Some examples of balanced brackets are []{}(), [({})]{}() and ({(){}[]})[].

By this logic, we say a sequence of brackets is considered to be balanced if the following conditions are met:

It contains no unmatched brackets.
The subset of brackets enclosed within the confines of a matched pair of brackets is also a matched pair of brackets.
Given  strings of brackets, determine whether each sequence of brackets is balanced. If a string is balanced, 
print YES on a new line; otherwise, print NO on a new line.

Input Format

The first line contains a single integer, , denoting the number of strings. 
Each line  of the  subsequent lines consists of a single string, , denoting a sequence of brackets.

Constraints

, where  is the length of the sequence.
Each character in the sequence will be a bracket (i.e., {, }, (, ), [, and ]).
Output Format

For each string, print whether or not the string of brackets is balanced on a new line. If the brackets are balanced, print YES; otherwise, print NO.

Sample Input

3
{[()]}
{[(])}
{{[[(())]]}}
Sample Output

YES
NO
YES
Explanation

The string {[()]} meets both criteria for being a balanced string, so we print YES on a new line.
The string {[(])} is not balanced, because the brackets enclosed by the matched pairs [(] and (]) are not balanced. 
Thus, we print NO on a new line.
The string {{[[(())]]}} meets both criteria for being a balanced string, so we print YES on a new line.
=======================================================================================================
Define {, (, and [ as opening brackets and }, ), and ] as closing brackets.

Whenever an opening bracket appears, we push it onto the stack. Whenever a closing bracket appears, 
we check if it matches the opening bracket at the top of the stack. If it does, we continue analyzing the string; 
we can infer that the string is not balanced, and we print NO. After processing the string completely 
and the stack is empty, the string is balanced, and we print YES. Else, we print NO.
*/

/**
 * @author daicaovu
 *
 */
//import java.util.*;
import java.util.Stack;


public class Solution1 {

	/**
	 * 
	 */
	public Solution1() {
		// TODO Auto-generated constructor stub
	}

    public static boolean isBalanced(String s) {
        // Stack of opening brackets:
        Stack<Character> stack = new Stack<Character>();
        // Flag denoting whether or not the string is balanced:
        boolean balanced = true;
        
        // Iterate through each char 'ch' in the string and check if brackets are balanced:
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            // If 'ch' is an opening bracket:
            if(     '(' == ch
               ||   '[' == ch
               ||   '{' == ch
              ) {
                stack.push(ch);
            }
            // Else, 'ch' is a closing bracket:
            else {
                // If there's no opening brace to balance, then the string cannot be balanced.
                if(stack.empty()){
                    balanced = false; 
                    break;
                }
                // Check if 'ch' closes the opening bracket at the top of the stack.
                else {
                    char top = stack.pop();
                    
                    // If the char popped off the 'top' of the stack doesn't match ch:
                    if(     (top == '(' && ch != ')') 
                       ||   (top == '[' && ch != ']') 
                       ||   (top == '{' && ch != '}') 
                      ) {
                        balanced = false;
                        break;
                    }
                }
            }
        }
        
        return (balanced && stack.empty()) ? true : false;
    }
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "{[()]}";
		String s2 = "{[(])}";
		String s3 = "{{[[(())]]}}";
		// TODO Auto-generated method stub
        System.out.println( (isBalanced(s1)) ? "YES" : "NO");
        System.out.println( (isBalanced(s2)) ? "YES" : "NO");
        System.out.println( (isBalanced(s3)) ? "YES" : "NO");
	}

}
