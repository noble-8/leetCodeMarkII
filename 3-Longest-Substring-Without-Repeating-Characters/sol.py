class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        n = len(s)
        r,l = 0,0
        mp = {}
        ans = 0
        while r<n:
            while s[r] in mp :
                del mp[s[l]]
                l+=1
            ans = max(ans,len(mp)+1)
            mp[s[r]] = r
            r+=1
        return ans
