class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        hash = [0]*26
        n = len(s1)
        for c in s1:
            hash[ord(c)-ord('a')]+=1
        for i in range(len(s2)):
            if hash[ord(s2[i])-ord('a')] != 0 and i+n<=len(s2) and self.is_perm(s2[i:i+n],hash):
                return True
        return False
    def is_perm(self,s2,hash):
        map = [0]*26
        for c in s2:
            map[ord(c)-ord('a')]+=1
        for i in range(26):
            if map[i]!=hash[i]:
                return False
        return True
