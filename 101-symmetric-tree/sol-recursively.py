# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        return self.isSym(root,root)
    def isSym(self,p:Optional[TreeNode],q:Optional[TreeNode]) -> bool:
        if not p and not q:
            return True
        elif not p or not q:
            return False
        return (p.val == q.val) and self.isSym(p.right,q.left) and self.isSym(p.left,q.right) 
