class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        hash = [0]*26
        for i in range(len(s)):
            hash[ord(s[i])-ord('a')]+=1
        for i in range(len(t)):
            hash[ord(t[i])-ord('a')]-=1
        for i in range(len(hash)):
            if hash[i]!=0:
                return chr(i+ord('a'))
        
