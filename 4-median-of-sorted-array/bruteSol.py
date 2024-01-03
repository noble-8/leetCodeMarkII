class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        arr = [0]*(len(nums1)+len(nums2))
        i,j,k = 0,0,0
        while i<len(nums1) and j<len(nums2):
            if nums1[i]<nums2[j]:
                arr[k] = nums1[i]
                i+=1
            else:
                arr[k] = nums2[j]
                j+=1
            k+=1
        while i<len(nums1):
            arr[k] = nums1[i]
            k+=1
            i+=1
        while j<len(nums2):
            arr[k]= nums2[j]
            j+=1
            k+=1
        if len(arr)%2==1:
            return arr[len(arr)//2]
        else:
            return (arr[len(arr)//2]+arr[len(arr)//2-1])/2            
