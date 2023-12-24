class Solution:
    def permute(self, arr: List[int]) -> List[List[int]]:
        ans = []
        def curse(curr):
            if len(curr)==len(arr):
                ans.append(curr[:])
                return
            for i in arr:
                if i not in curr:
                    curr.append(i)
                    curse(curr)
                    curr.pop()
        curse([])
        return ans
