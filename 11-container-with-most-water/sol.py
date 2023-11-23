class Solution:
    def maxArea(self, arr: List[int]) -> int:
        l,r = 0,len(arr)-1
        ans =0
        while l<r:
            ans = max(ans,(r-l)*min(arr[l],arr[r]))
            if arr[l]>arr[r]:
                r-=1
            else:
                l+=1
        return ans
