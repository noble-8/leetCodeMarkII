class Solution {
    List<List<Integer>> ans = new ArrayList<List<Integer>>();
    public List<List<Integer>> permute(int[] nums) {
        
        permute(nums,0,nums.length-1); 
        return ans;
    }
    
    public void  permute(int[] nums,int l,int r){
        if(l==r){
            List<Integer> x = new ArrayList<Integer>();
            for(int i:nums){
                x.add(i);
            }
            ans.add(x);
            return;
        }
        else{
            for(int i=l;i<=r;i++){
                
                swap(nums,l,i);
                permute(nums,l+1,r);
                swap(nums,l,i);
            }
        }
        
    }
    
    public void swap(int[] nums, int i,int j){
        if(i==j){
            return;
        }
        int x = nums[i];
        nums[i] = nums[j];
        nums[j] = x;
        return;
    }
}