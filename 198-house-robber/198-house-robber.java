class Solution {
    public int rob(int[] nums) {
        int n= nums.length;
        
        if(n==1){return nums[0];}
        if(n==2){return Math.max(nums[1],nums[0]);}
        
        int slow =nums[0];
        int fast = nums[1];
        int ans =0;
        for(int i=2;i<n;i++){
            ans = Math.max(fast,slow+nums[i]);
            slow = Math.max(slow,fast);
            fast = ans;
        }
        return ans;
        
    }
}