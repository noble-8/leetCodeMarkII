class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        hash = Counter(nums)
        return heapq.nlargest(k, hash.keys(), key = hash.get)
