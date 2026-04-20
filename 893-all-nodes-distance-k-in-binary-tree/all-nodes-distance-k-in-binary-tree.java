class Solution {
    HashMap<TreeNode, TreeNode> hm = new HashMap<>();
    TreeNode ptr = null;
    TreeNode tar = null;

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> ls = new ArrayList<>();
        if (root == null) return ls;

        tar = target;                 // missing in your code
        dfs(root, null);

        Set<TreeNode> st = new HashSet<>();
        Queue<TreeNode> q = new LinkedList<>();

        q.offer(ptr);
        st.add(ptr);

        while (!q.isEmpty()) {
            int size = q.size();

            if (k == 0) {
                for (TreeNode node : q) {
                    ls.add(node.val);
                }
                return ls;
            }

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();

                if (hm.containsKey(node) && !st.contains(hm.get(node))) {
                    q.offer(hm.get(node));
                    st.add(hm.get(node));
                }

                if (node.left != null && !st.contains(node.left)) {
                    q.offer(node.left);
                    st.add(node.left);
                }

                if (node.right != null && !st.contains(node.right)) {
                    q.offer(node.right);
                    st.add(node.right);
                }
            }

            k--;
        }

        return ls;
    }

    public void dfs(TreeNode root, TreeNode par) {
        if (root == null) return;

        if (root == tar) {
            ptr = root;
        }

        if (root.left != null) {
            hm.put(root.left, root);
        }

        if (root.right != null) {
            hm.put(root.right, root);
        }

        dfs(root.left, root);
        dfs(root.right, root);
    }
}