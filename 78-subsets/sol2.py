class Solution:
    def subsets(self, arr: List[int]) -> List[List[int]]:
        n = len(arr)
        i = 2**n-1
        ans = []
        while i>=0:
            x = i
            j=0
            t = []
            while x>0:
                if x%2==1:
                    t.append(arr[j])
                x = x//2
                j+=1
            ans.append(t)
            i-=1 
        return ans
