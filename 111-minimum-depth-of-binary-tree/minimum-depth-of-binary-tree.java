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
    public int minDepth(TreeNode root) {
        if(root == null) return 0 ;
        Queue<Pair> q = new LinkedList<>() ;
        q.offer(new Pair(root,1)) ;
        while(!q.isEmpty()){
            Pair p = q.poll() ;
            TreeNode roo = p.node ;
            int k = p.val ;
            if(roo.left == null && roo.right == null){
                return k ;
            }
            if(roo.left != null){
                q.offer(new Pair(roo.left,k+1)) ;
            }
            if(roo.right != null){
                q.offer(new Pair(roo.right,k+1)) ;
            }
        }
        return -1 ;
    }
    class Pair{
        TreeNode node ;
        int val ;
        Pair(TreeNode node , int val){
            this.node = node ;
            this.val = val ;
        }
    }
}