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
    public ListNode middleNode(ListNode head) {
        
        if(head == null){return head;}
        ListNode curr = head;
        ListNode fast = head;
        
        while(fast!=null&& fast.next!=null){
            
            curr = curr.next;
            fast = fast.next.next;    
        }
        
        return curr;
        
    }
}