"""
# Definition for a Node.
class Node:
    def __init__(self, val = 0, neighbors = None):
        self.val = val
        self.neighbors = neighbors if neighbors is not None else []
"""

from typing import Optional
class Solution:
    def cloneGraph(self, node: Optional['Node']) -> Optional['Node']:
        if not node:
            return node
        vis= {}
        q = deque()
        q.append(node)
        vis[node] = Node(node.val,[])
        
        while q:
            curr = q.popleft()
            for neigh in curr.neighbors:
                if neigh not in vis:
                    vis[neigh] = Node(neigh.val,[])
                    q.append(neigh)
                vis[curr].neighbors.append(vis[neigh])
        return vis[node]
