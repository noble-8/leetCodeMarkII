class Solution:
    def findMin(self, arr: List[int]) -> int:
        if len(arr)==1:
            return arr[0]
        l,r = 0,len(arr)-1
        if arr[l]<arr[r]:
            return arr[l]
        while l<=r:
            m = (l+r)//2
            if arr[m]>arr[m+1]:
                return arr[m+1]
            if arr[m-1]>arr[m]:
                return arr[m]
            if arr[m]>arr[0]:
                l =m+1
            else:
                r=m-1
