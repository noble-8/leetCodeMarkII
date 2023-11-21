class Solution {
    public int findPeakElement(int[] arr) {
        int x=Integer.MIN_VALUE;
        int y=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>x){
                x=arr[i];
                y = i;
            }
        }
        return y;
    }
}