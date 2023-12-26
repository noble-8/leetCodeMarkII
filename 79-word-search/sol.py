class Solution:
    def exist(self, arr: List[List[str]], word: str) -> bool:
        vis = [[False]*len(arr[0]) for _ in range(len(arr))]
        for i in range(len(arr)):
            for j in range(len(arr[0])):
                if arr[i][j]==word[0] and self.exists(i,j,arr,word,vis):
                    return True
        return False
    def exists(self,i,j,arr,word,vis) -> bool:
        if len(word)==0:
            return True
        if i<0 or i>=len(arr) or j<0 or j>=len(arr[0]) or vis[i][j]==True:
            return False
        if arr[i][j]==word[0]:
            vis[i][j]=True
            val = False
            if self.exists(i-1,j,arr,word[1:],vis) or self.exists(i+1,j,arr,word[1:],vis) or self.exists(i,j-1,arr,word[1:],vis) or self.exists(i,j+1,arr,word[1:],vis):
                val = True
            vis[i][j] = False
            return val
        else:
            return False
