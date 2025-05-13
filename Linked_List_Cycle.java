/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> map= new HashSet<>() ;

        if(head==null){
            System.out.println("1") ;

            return false ;
        }
        if(head.next== null){
            System.out.println("2") ;

            return false ;
        }
        while(head!=null){
            if(map.contains(head)){
                return true ;
            }
            map.add(head) ;
            head=head.next ;
        }

        return false ;
        
    }

    // we can simply iterate through the linked list, if the same value occurs more than once then return true otherwise false
}
