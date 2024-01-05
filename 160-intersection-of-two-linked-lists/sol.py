# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> Optional[ListNode]:
        a = headA
        b = headB
        vis = set()
        while a:
            vis.add(a)
            a = a.next
        while b:
            if b in vis:
                return b
            else:
                b = b.next
        return None
