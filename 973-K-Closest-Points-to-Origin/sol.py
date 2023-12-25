class Solution:
    def kClosest(self, points: List[List[int]], k: int) -> List[List[int]]:
        def dist(point):
            return point[0]**2+point[1]**2
        heap =[]
        for point in points:
            heapq.heappush(heap,(-dist(point),point))
            if len(heap)>k:
                heapq.heappop(heap)
        return [point for _,point in heap]
