class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        for i in range(len(stones)):
            stones[i]*=-1
        heapq.heapify(stones)
        while len(stones)>=2:
            x=-heapq.heappop(stones)
            y=-heapq.heappop(stones)
            if x==y:
                continue
            else:
                heapq.heappush(stones,-abs(x-y))
        return 0 if len(stones)==0 else -stones[0];
