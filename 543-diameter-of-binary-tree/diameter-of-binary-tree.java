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
    int max = 0 ;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0 ;
        dfs(root) ;
        return max ;
    }
    public void dfs(TreeNode root){
        if(root == null) return ;
        dfs(root.left) ;
        int lh = height(root.left) ;
        int rh = height(root.right) ;
        max = Math.max(max,lh+rh) ;
        dfs(root.right) ;
    }
    public int height(TreeNode root){
        if(root == null) return 0 ;
        int lh = 1 + height(root.left) ;
        int rh = 1 + height(root.right) ;
        return Math.max(lh,rh) ;
    }
}