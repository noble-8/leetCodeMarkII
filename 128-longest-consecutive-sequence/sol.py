class Solution:
    def longestConsecutive(self, arr: List[int]) -> int:
        look = set(arr)
        ans = 0
        for i in look:
            if i-1 not in look:
                curr = i
                streak =1
                while curr+1 in look:
                    streak+=1
                    curr+=1
                ans = max(ans,streak)
        return ans
