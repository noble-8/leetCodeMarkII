class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        l = [1]* len(nums)
        for i in range(1,len(nums)):
            l[i] = nums[i-1]*l[i-1]
        R=1
        for i in reversed(range(len(nums))):
            l[i] = l[i]*R
            R = R*nums[i]
        # for i in range(len(nums)):
            # l[i] = l[i]*r[i]
        return l
