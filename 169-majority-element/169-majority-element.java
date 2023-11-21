class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        int x=0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(hash.containsKey(nums[i])){
                x = hash.get(nums[i]);
                hash.put(nums[i],x+1);
                if(x+1 > n/2)
                    return nums[i];
                
            }
            else{
                hash.put(nums[i],1);
            }
        }
        
        // for(int i:hash.keySet()){
        //     if(hash.get(i)>nums.length/2){
        //         return i;
        //     }
        // }
        return -1;
        
    }
}