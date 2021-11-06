/*
Merge k Sorted Lists

Description- 
 
You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.

Merge all the linked-lists into one sorted linked-list and return it.

Example 1:
	Input: lists = [[1,4,5],[1,3,4],[2,6]]
	Output: [1,1,2,3,4,4,5,6]
	Explanation: The linked-lists are:
	[
	  1->4->5,
	  1->3->4,
	  2->6
	]
	merging them into one sorted list:
	1->1->2->3->4->4->5->6
Example 2:
	Input: lists = []
	Output: []
Example 3:
	Input: lists = [[]]
	Output: []

Constraints:
	k == lists.length
	0 <= k <= 10^4
	0 <= lists[i].length <= 500
	-10^4 <= lists[i][j] <= 10^4
	lists[i] is sorted in ascending order.
	The sum of lists[i].length won't exceed 10^4.
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] listOfLists) {
        if(listOfLists.length == 0)
            return null;
        List<Integer> arrayList = new ArrayList<>();
		for(int i = 0 ; i < listOfLists.length ; i++) {
			while(listOfLists[i] != null) {
				arrayList.add(listOfLists[i].val);
				listOfLists[i] = listOfLists[i].next;
			}
		}
		Collections.sort(arrayList);
        Collections.reverse(arrayList);
        ListNode res;
        if(arrayList.size() == 0){
            return null;
        }else{
            res = new ListNode(arrayList.get(0));
            for(int i = 1 ; i < arrayList.size() ; i++) {
                res = new ListNode(arrayList.get(i), res);
            }
        }
		return res;
    }
}