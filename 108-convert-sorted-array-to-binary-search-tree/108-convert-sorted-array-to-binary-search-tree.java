/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return help(0,nums.length-1,nums);
    }
    
    public TreeNode help(int i,int j,int[] nums){
        if(j<i){
            return null;
        }
        int m = (i+j)/2;
        TreeNode ans = new TreeNode(nums[m]);
        ans.left = help (i,m-1,nums);
        ans.right = help(m+1,j,nums);
        return ans;
        
    }
}