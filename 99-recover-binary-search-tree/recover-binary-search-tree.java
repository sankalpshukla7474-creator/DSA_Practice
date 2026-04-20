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
    List<Integer> ls = new ArrayList<>() ;
    int i = 0 ;
    public void recoverTree(TreeNode root) {
        if(root == null) return ;
        dfs(root) ;
        Collections.sort(ls) ;
        correct(root) ;
        return ;
    }
    public void dfs(TreeNode root){
        if(root == null) return ;
        dfs(root.left) ;
        ls.add(root.val) ;
        dfs(root.right) ;
    }
    public void correct(TreeNode root ){
        if(root == null) return ;
        correct(root.left) ;
        root.val = ls.get(i) ;
        i++ ;
        correct(root.right) ;
    }
}