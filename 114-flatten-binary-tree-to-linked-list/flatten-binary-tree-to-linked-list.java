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
    TreeNode curr = null ;
    public void flatten(TreeNode root) {
        if(root == null) return ;
        TreeNode dum = new TreeNode(-1) ;
        curr = dum ;
        preorder(root) ;
        TreeNode temp = dum.right ;
        root.val = temp.val ;
        root.left = null ;
        root.right = temp.right ;
        return ;
    }
    public void preorder(TreeNode root){
        if(root == null) return ;
        curr.right = new TreeNode(root.val) ;
        curr.left = null ;
        curr = curr.right ;
        preorder(root.left) ;
        preorder(root.right) ;
    }
}