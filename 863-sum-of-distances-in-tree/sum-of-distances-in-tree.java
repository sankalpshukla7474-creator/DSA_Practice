class Solution {

    List<List<Integer>> adj = new ArrayList<>();
    int[] count;
    int[] ans;
    int N;

    public int[] sumOfDistancesInTree(int n, int[][] edges) {

        N = n;

        for(int i = 0; i < n; i++)
            adj.add(new ArrayList<>());

        for(int[] e : edges){
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }

        count = new int[n];
        ans = new int[n];

        dfs1(0, -1, 0);
        dfs2(0, -1);

        return ans;
    }

    private void dfs1(int node, int parent, int depth){

        ans[0] += depth;
        count[node] = 1;

        for(int child : adj.get(node)){
            if(child == parent) continue;

            dfs1(child, node, depth + 1);
            count[node] += count[child];
        }
    }

    private void dfs2(int node, int parent){

        for(int child : adj.get(node)){

            if(child == parent) continue;

            ans[child] = ans[node] - count[child] + (N - count[child]);

            dfs2(child, node);
        }
    }
}