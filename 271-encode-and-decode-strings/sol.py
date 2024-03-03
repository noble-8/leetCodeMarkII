class Codec:
    def encode(self, strs: List[str]) -> str:
        """Encodes a list of strings to a single string.
        """
        ans = []
        for w in strs:
            ans.append(str(len(w))+"|"+w)
        return ''.join(ans)

        

    def decode(self, s: str) -> List[str]:
        """Decodes a single string to a list of strings.
        """
        i=0
        ans = []
        while i<len(s):
            x = self.get_int(i,s)
            ln = len(str(x))
            i += ln +1
            ans.append(s[i:i+x])
            i = i +x
        return ans
    def get_int(self,i,s) -> int:
        j=i
        while s[j].isdigit():
            j+=1
        return int(s[i:j])


# Your Codec object will be instantiated and called as such:
# codec = Codec()
# codec.decode(codec.encode(strs))
