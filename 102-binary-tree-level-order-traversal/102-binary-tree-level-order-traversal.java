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
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        
        if(root==null){
            return ans;
        }
        
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        int lvl = 1;
        int n =0;
        TreeNode curr = null;
        List<Integer> x = new ArrayList<Integer>();
        while(!q.isEmpty()){
            
            curr = q.poll();
            x.add(curr.val);
            lvl--;
            if(curr.left!=null){
                q.add(curr.left);
                n++;
            }
            if(curr.right!=null){
                q.add(curr.right);
                n++;
            }
            
            if(lvl==0){
                ans.add(x);
                x = new ArrayList<Integer>();
                lvl = n;
                n=0;
            }
        }
        
        return ans;
        
    }
}