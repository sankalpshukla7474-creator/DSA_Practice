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
    List<TreeNode> ls = new ArrayList<>() ;
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null && subRoot == null) return true ;
        if(root == null || subRoot == null) return false ;
        dfs(root,subRoot) ;
        if(ls.size() == 0) return false ;
        for(TreeNode ptr : ls){
            if(isSameTree(subRoot,ptr)) return true ;
        }
        return false ;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true ;
        if(p == null || q == null) return false ;
        if(p.val != q.val) return false ;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right) ;
    }
    public void dfs(TreeNode root , TreeNode subRoot){
        if(root == null) return ;
        dfs(root.left,subRoot) ;
        if(root.val == subRoot.val){
            ls.add(root) ;
        }
        dfs(root.right,subRoot) ;
    }
}