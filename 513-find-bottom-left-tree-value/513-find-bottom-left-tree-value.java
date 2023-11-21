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
    public int findBottomLeftValue(TreeNode root) {
        return lot(root);
    }
    
    public int lot(TreeNode root){
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        int ans = root.val;
        q.add(root);
        int n =0;
        int c = 1;
        TreeNode curr = null;
        while(!q.isEmpty()){
            curr = q.poll();
            c--;
            if(curr.left!=null){
                q.add(curr.left);
                n++;
            }
            if(curr.right!=null){
                q.add(curr.right);
                n++;
            }
            
            if(c==0){
                c = n;
                n=0;
                if(!q.isEmpty()){
                ans = q.peek().val;                    
                }
            }
        }
        return ans;
    }
}