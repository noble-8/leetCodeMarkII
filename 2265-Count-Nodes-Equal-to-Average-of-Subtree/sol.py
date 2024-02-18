# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def averageOfSubtree(self, root: TreeNode) -> int:
        counter = 0
        def curse(root):
            if not root:
                return (0,0)
            ls,lc = curse(root.left)
            rs,rc = curse(root.right)
            sum = ls+rs +root.val
            count = lc+rc+1
            nonlocal counter
            if (sum//count)==root.val:
                counter+=1
            return (sum,count)
        curse(root)
        return counter
