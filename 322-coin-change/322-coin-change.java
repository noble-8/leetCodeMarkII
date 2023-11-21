class Solution {
    public int coinChange(int[] nums, int amount) {
      
        if(amount ==0){
            return 0;
        }
        int[] arr = new int[amount +1];
        arr[0] = 0;
        for(int i=1;i<arr.length;i++){
            int t =Integer.MAX_VALUE;
            for(int j=0;j<nums.length;j++){
                if(i-nums[j]>=0){
                    if(arr[i-nums[j]] != Integer.MAX_VALUE){
                        t = Math.min(t,arr[i-nums[j]]+1);
                    }
                }
            }
            arr[i] = t;
        }
        if(arr[amount]==Integer.MAX_VALUE){
            return -1;
        }
        return arr[amount];
    }
}