/*
Remove Nth Node From End of List

Description-

Given the head of a linked list, remove the nth node from the end of the list and return its head.

Example 1:
	Input: head = [1,2,3,4,5], n = 2
	Output: [1,2,3,5]
Example 2:
	Input: head = [1], n = 1
	Output: []
Example 3:
	Input: head = [1,2], n = 1
	Output: [1]
 
Constraints:
	The number of nodes in the list is sz.
	1 <= sz <= 30
	0 <= Node.val <= 100
	1 <= n <= sz
 
Follow up: Could you do this in one pass?
 */
 
public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current1 = head;
        ListNode current2 = head;
        int count = 0;
        while(current1 != null){
            count++;
            current1 = current1.next;
        }
        if(count == n){
            head = head.next;
            return head;
        }
        int target = count - n;
        int i = 0;
            while(i < target - 1){
                current2 = current2.next;
                i++;
            }
        current2.next = current2.next.next;
        
        return head;
    }
	