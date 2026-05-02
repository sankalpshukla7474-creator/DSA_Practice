/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode ptr = null ;
    List<Integer> ls = new ArrayList<>() ;
    HashMap<TreeNode,TreeNode> hm = new HashMap<>() ;
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        if(root == null) return ls ;
        dfs(root,target) ;
        Set<TreeNode> st = new HashSet<>() ;
        Queue<TreeNode> q = new LinkedList<>() ;
        q.offer(ptr) ;
        st.add(ptr) ;
        while(k-- > 0){
            int size = q.size() ;
            for(int i = 0 ; i < size ; i++){
                TreeNode temp = q.poll() ;
                if(hm.containsKey(temp) && !st.contains(hm.get(temp))){
                    q.offer(hm.get(temp)) ;
                    st.add(hm.get(temp)) ;
                }
                if(temp.left != null && !st.contains(temp.left)){
                    q.offer(temp.left) ;
                    st.add(temp.left) ;
                }
                if(temp.right != null && !st.contains(temp.right)){
                    q.offer(temp.right) ;
                    st.add(temp.right) ;
                }
            }
        }
        while(!q.isEmpty()){
            TreeNode temp = q.poll() ;
            ls.add(temp.val) ;
        }
        return ls ;
    }
    public void dfs(TreeNode root , TreeNode tar){
        if(root == null) return ;
        if(root == tar){
            ptr = root ;
        }
        if(root.left != null){
            hm.put(root.left,root) ;
            dfs(root.left,tar) ;
        }
        if(root.right != null){
            hm.put(root.right,root) ;
            dfs(root.right,tar) ;
        }
    }
}