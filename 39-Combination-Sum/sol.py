class Solution:
    def combinationSum(self, arr: List[int], tar: int) -> List[List[int]]:
        ans = []
        def curse(index,curr,tar):
            if tar<0 or index> len(arr):
                return
            if tar==0:
                ans.append(curr[:])
                return
            for i in range(index,len(arr)):
                curr.append(arr[i])
                curse(i,curr,tar-arr[i])
                curr.pop()
        curr = []
        curse(0,[],tar)
        return ans
