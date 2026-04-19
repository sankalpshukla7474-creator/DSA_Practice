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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ls = new ArrayList<>() ;
        if(root == null) return ls ;
        Queue<TreeNode> q = new LinkedList<>() ;
        q.offer(root) ;
        int level = 1 ; 
        List<Integer> pb = new ArrayList<>() ;
        while(!q.isEmpty()){
            int size = q.size() ;
            for(int i = 0 ; i < size ; i++){
                TreeNode node = q.poll() ;
                pb.add(node.val) ;
                if(node.left != null){
                    q.offer(node.left) ;
                }
                if(node.right != null){
                    q.offer(node.right) ;
                }
            }
            if(level % 2 == 0){
                Collections.reverse(pb) ;
                ls.add(new ArrayList<>(pb)) ;
            }
            else{
                ls.add(new ArrayList<>(pb)) ;
            }
            level++ ;
            pb.clear() ;
        }
        return ls ;
    }
}