class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        l = [1]* len(nums)
        for i in range(1,len(nums)):
            l[i] = nums[i-1]*l[i-1]
        r = [1]*len(nums)
        for i in reversed(range(0,len(nums)-1)):
            r[i] = nums[i+1]*r[i+1]
        for i in range(len(nums)):
            l[i] = l[i]*r[i]
        return l
