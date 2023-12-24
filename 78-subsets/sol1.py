class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        ans = []
        curr = []
        def curse(i):
            if i>=len(nums):
                ans.append(list(curr))
                return 
            curr.append(nums[i])
            curse(i+1)
            curr.pop()
            curse(i+1)
        curse(0)
        return ans
