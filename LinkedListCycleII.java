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
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null)   return null;
        
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            
            if(fast == slow)    break;
        }
        
        if(fast == null || fast.next == null)   return null;
        
        //move fast to head
        fast = head;
        while(fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        
        return fast;
    }
}
