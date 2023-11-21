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
        
        if(head==null|| head.next==null){
            return false;
        }

        
        ListNode fast = head;
        fast=fast.next;
        ListNode slow = head;
        
        while(fast!=null){
            
            if(fast==slow){
                return true;
            }
            
            fast = fast.next;
            if(fast==null){
                return false;}
            else{fast=fast.next;}
            slow = slow.next;
        }
        return false;
    }
}