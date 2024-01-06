class Solution:
    def majorityElement(self, arr: List[int]) -> int:
        ans = arr[0]
        freq = 1
        for i in range(1,len(arr)):
            if arr[i]!=ans:
                freq-=1
                # print(freq)
                if freq <=0:
                    freq = 1
                    ans = arr[i]
            else:
                freq+=1
        return ans
