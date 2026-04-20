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
    int levelx = -1 , levely = -1 ;
    TreeNode parx = null , pary = null ;
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null) return false ;
        dfs(root,0,null,x,y) ;
        return ((parx != pary) && (levelx == levely)) ;
    }
    public void dfs(TreeNode root, int level , TreeNode par, int x , int y){
        if(root == null) return ;
        if(root.val == x){
            parx = par ;
            levelx = level ;
        }
        if(root.val == y){
            pary = par ;
            levely = level ;
        }
        dfs(root.left,level+1,root,x,y) ;
        dfs(root.right,level+1,root,x,y) ;
    }
}