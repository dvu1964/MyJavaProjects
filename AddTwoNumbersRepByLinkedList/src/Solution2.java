//import Solution.Node;

//import Solution.Node;

/**
* Definition for singly-linked list.
* public class ListNode {
*    int val;
*    ListNode next;
*    ListNode(int x) { val = x; }
* }
*/

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; next = null;}
}

class Solution2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode prev = new ListNode(0);
        ListNode head = prev;
        int carry = 0;

        return calc(l1, l2, carry);
    }

    public static ListNode calc(ListNode l1, ListNode l2, int carry){
        if(l1 == null && l2 == null){
            if(carry != 0){
                return new ListNode(carry);
            }else {
                return null;
            }
        }

        int sum = 0;
        sum = sum + (l1 != null ? l1.val: 0);
        sum = sum + (l2 != null ? l2.val: 0);
        sum = sum + carry;
        carry = sum / 10;
        sum = sum % 10;
        ListNode newNode = new ListNode(sum);

        newNode.next = calc(l1 != null ? l1.next : l1, l2 != null ? l2.next : l2, carry);

        return newNode;
    }

    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        ListNode list1 = new ListNode(7);
        list1.next = new ListNode(5);
        list1.next.next = new ListNode(9);
        list1.next.next.next = new ListNode(4);
        list1.next.next.next.next = new ListNode(6);
        System.out.print("First List is ");
        printList(list1);
 
        // creating seconnd list
        ListNode list2 = new ListNode(8);
        list2.next = new ListNode(4);
        System.out.print("Second List is ");
        printList(list2);
 
        // add the two lists and see the result
        ListNode rs = addTwoNumbers(list1, list2);
        System.out.print("Resultant List is ");
        printList(rs);
    }    
}
