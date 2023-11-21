class Solution {
    public int[] productExceptSelf(int[] nums) {
        int t = 1;
        int z=0;
        for(int i=0;i<nums.length;i++){

            if(nums[i]==0){
                z++;
                continue;
            }
            t = t*nums[i];
        }
        
        int[] ans = new int[nums.length];
        if(z>1){
            return ans;
        }
        for(int i=0;i<nums.length;i++){
           if(z==0){
               ans[i] = t/nums[i];
           }else{
               if(nums[i]==0){
                   ans[i]=t;
               }else{
                   ans[i]=0;
               }
           }
        }
        return ans;
    }
}