from collections import deque
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        if root is None:
            return []
        q = deque()
        q.append(root)
        # TreeNode curr = None
        ans = []
        lvl = []
        rem = 1
        nxt =0
        while q:
            curr = q.popleft()
            rem-=1
            lvl.append(curr.val)
            if curr.left:
                q.append(curr.left)
                nxt +=1
            if curr.right:
                q.append(curr.right)
                nxt +=1
            if rem==0:
                ans.append(lvl)
                lvl = []
                rem =nxt
                nxt =0
        return ans
