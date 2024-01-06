class Solution:
    def rotate(self, arr: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        aux = [0]*len(arr)
        n = len(arr)
        for i in range(len(arr)):
            index = (i-k)%n
            aux[i] = arr[index]
        arr[:] = aux
