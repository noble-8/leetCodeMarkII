class Solution:
    def isValidSudoku(self, arr: List[List[str]]) -> bool:
        for i in range(9):
            if self.check_row(i,arr):
                return False
        for i in range(9):
            if self.check_col(i,arr):
                return False
        x = [0,3,6]
        for i in x:
            for j in x:
                if self.check_box(arr,i,j):
                    return False
        return True

            
    def check_row(self,i, arr) -> bool:
        hash = [False]*10
        for j in range(9):
            if arr[i][j]==".":
                continue
            x = int(arr[i][j])
            if not hash[x]:
                hash[x] = True
            else:
                return True
        return False

    def check_col(self,j,arr) -> bool:
        hash = [False]*10
        for i in range(9):
            if arr[i][j]==".":
                continue
            x = int(arr[i][j])
            if not hash[x]:
                hash[x] = True
            else:
                return True
        return False
    def check_box(self,arr,x,y):
        hash = [False]*10
        for i in range(3):
            for j in range(3):
                if arr[x+i][y+j]==".":
                    continue
                z = int(arr[x+i][y+j])
                if not hash[z]:
                    hash[z]=True
                else:
                    return True
        return False
        
