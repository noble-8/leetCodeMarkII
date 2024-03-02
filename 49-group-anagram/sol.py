class Solution:
    # basic idea is to have a key which is the same across all anagrams 
    # I use a the sorted string because each anagram would the same sorted string
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hash = defaultdict(list)
        for i in range(len(strs)):
            hash[''.join(sorted(strs[i]))].append(strs[i])
        # given input strs = ["eat","tea","tan","ate","nat","bat"]
        # hash = {'aet': ['eat', 'tea', 'ate'], 'ant': ['tan', 'nat'], 'abt': ['bat']})
        return hash.values()
