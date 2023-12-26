class Solution:
    def combinationSum2(self, arr: List[int], target: int) -> List[List[int]]:
        ans = []
        arr.sort()
        def curse(curr,tar,index):
            if tar<0 or index>len(arr):
                return
            if tar==0:
                ans.append(curr[:])
                return
            i = index
            while i<len(arr):
                curr.append(arr[i])
                curse(curr,tar-arr[i],i+1)
                curr.pop()
                while i+1<len(arr) and arr[i+1]==arr[i]:
                    i+=1
                i+=1
        curse([],target,0)
        return ans
