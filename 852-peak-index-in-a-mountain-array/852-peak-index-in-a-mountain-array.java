class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int i =0;
        int j = arr.length;
        
        int m;
        while(i<j){
            m = i+(j-i)/2;
            if(arr[m]>arr[m-1] && arr[m]>arr[m+1]){
                return m;
            }
            else if(arr[m-1]<arr[m]&& arr[m]<arr[m+1]){
                i =m+1;
            }
            else{
                j=m;
            }
        }
        return -1;
    }
}