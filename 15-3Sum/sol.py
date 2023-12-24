class Solution:
    def threeSum(self, arr: List[int]) -> List[List[int]]:
        arr.sort()
        i=0
        ans = []
        for i in range(len(arr)):
            if arr[i]>0:
                break
            if i==0 or arr[i-1]!=arr[i]:
                self.two_sum(arr,i,ans)
            i+=1
        return ans
    def two_sum(self,arr,i,ans):
        j= i+1
        prv = set()
        while j<len(arr):
            comp = -arr[i]-arr[j]
            if comp in prv:
                ans.append([arr[i],arr[j],comp])
                while j+1<len(arr) and arr[j]==arr[j+1]:
                    j+=1
            else:
                prv.add(arr[j])
            j+=1

