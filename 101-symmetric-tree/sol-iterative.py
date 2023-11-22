# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        p = []
        p.append(root)
        p.append(root)
        while p:
            l = p.pop()
            r = p.pop()
            if not l and not r:
                continue
            elif not l or not r:
                return False
            elif l.val != r.val:
                return False
            p.append(l.left)
            p.append(r.right)
            p.append(l.right)
            p.append(r.left)
        return True
