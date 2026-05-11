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
    boolean flag = false ;
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true ;
        dfs(root) ;
        return !flag; 
    }

    public void dfs(TreeNode root) {
        if (root == null)
            return ;
        dfs(root.left);
        int lh = depth(root.left);
        int rh = depth(root.right);
        if (Math.abs(lh - rh) > 1){
            flag = true ;
            return ;
        }
        dfs(root.right);
    }

    public int depth(TreeNode root) {
        if (root == null)
            return 0;
        int lh = 1 + depth(root.left);
        int rh = 1 + depth(root.right);
        return Math.max(lh, rh);
    }
}