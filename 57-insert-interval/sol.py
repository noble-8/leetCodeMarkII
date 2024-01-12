class Solution:
    def insert(self, arr: List[List[int]], ins: List[int]) -> List[List[int]]:
        ans = []
        # arr.sort()
        for i in range(len(arr)):
            if ins[1]< arr[i][0]:
                ans.append(ins)
                return ans +arr[i:]
            elif ins[0]> arr[i][1]:
                ans.append(arr[i])
            else:
                ins = [min(ins[0],arr[i][0]),max(ins[1],arr[i][1])]
        ans.append(ins)
        return ans
