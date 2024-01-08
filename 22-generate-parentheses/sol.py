class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        ans = []
        def curse(s,l,r):
            if l<0 or r<0 or l<r:
                return
            if l==0 and r==0:
                ans.append(s)
                return
            if l>0:
                curse(s+"(",l-1,r)
            if r>0 and r>l:
                curse(s+")",l,r-1)
        curse("",n,n)
        return ans
