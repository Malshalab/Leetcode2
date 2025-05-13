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

 // Approach:

 // we can take the tail of the linked list and iterate from the head, the head becomes the tail  and repeat setting the next value to point to this tail
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null ;
        ListNode current= head ;

        while(current!=null){
            ListNode temp= current.next ;

            current.next=prev ;
            prev=current ;
            current=temp ;  
        }
        return prev ;
    }
}
