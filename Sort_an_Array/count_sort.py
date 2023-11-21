class Solution:
    def sortArray(self, arr: List[int]) -> List[int]:
        return self.count_sort(arr);
    def count_sort(self, arr: List[int]) -> List[int]:
        maxi = max(arr)
        mini = min(arr)
        hash = [0]*(maxi - mini + 1)
        for i in arr:
            hash[i-mini]+=1

        ans = [0]*len(arr)
        index = 0
        for i in range(mini, maxi +1,1):
            while hash[i-mini] >0:
                ans[index] = i
                index+=1
                hash[i-mini] -= 1
        return ans

