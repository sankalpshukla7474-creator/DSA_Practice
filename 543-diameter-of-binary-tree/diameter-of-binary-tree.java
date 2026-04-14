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
    int max = Integer.MIN_VALUE ;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0 ;
        dfs(root) ;
        return max ;
    }
    public void dfs(TreeNode root){
        if(root == null) return ;
        dfs(root.left) ;
        int lh = track(root.left) ;
        int rh = track(root.right) ;
        max = Math.max(max,lh+rh) ;
        dfs(root.right) ;
    }
    public int track(TreeNode root){
        if(root == null) return 0 ;
        int lh = 1 + track(root.left) ;
        int rh = 1 + track(root.right) ;
        return Math.max(lh,rh) ;
    }
}