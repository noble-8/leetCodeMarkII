class Solution:
    def minRemoveToMakeValid(self, s: str) -> str:
        ans = []
        balance = 0
        open = 0
        for c in s:
            if c=="(":
                balance+=1
                open+=1
            if c==")":
                if balance==0:
                    continue
                balance-=1
            ans.append(c)
        res = []
        close = open -balance
        for c in ans:
            if c == "(":
                close -=1
                if close<0:
                    continue
            res.append(c)
        return ''.join(res)
