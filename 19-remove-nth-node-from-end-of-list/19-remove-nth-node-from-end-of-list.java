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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        
        if((head.next ==null && n==1)|| head ==null ){
            return null;
        }
        
        ListNode prv = null;
        ListNode slow = head;
        ListNode fast = head;
        for(int i=0;i<n;i++){
            if(fast==null){
                return head;
            }
            fast = fast.next;
        }
        
        while(fast != null ){
            fast = fast.next;
            prv = slow;
            slow = slow.next;
        }
        
        if(prv!=null){
            prv.next = slow.next;
        }
        else{
            return head.next;
        }
        
        
        return head;
        
        
        
    }
}