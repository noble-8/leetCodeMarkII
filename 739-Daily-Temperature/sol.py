class Solution:
    def dailyTemperatures(self, arr: List[int]) -> List[int]:
        ans = [0]*len(arr)
        st = []
        for i in range(len(arr)):
            while st and st[-1][0]<arr[i]:
                val,index=st.pop()
                ans[index] = i-index
            st.append((arr[i],i))
        return ans 

