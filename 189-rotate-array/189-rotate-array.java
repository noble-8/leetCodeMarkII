class Solution {
    public void rotate(int[] nums, int k) {
        int[] arr = new int[k];
        k = k%nums.length;
        
        for(int i=0;i<k;i++){
            arr[i]=(nums[nums.length-k+i]);
        }
        
        for(int i=0;i<=nums.length-k-1;i++){
            nums[nums.length-1-i] = nums[nums.length-1-k-i];            
        }
        
        for(int i=0;i<k;i++){
            nums[i] = arr[i];    
        }
        
    }
}