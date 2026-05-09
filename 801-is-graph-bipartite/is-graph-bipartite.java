class Solution {
    public boolean isBipartite(int[][] g) {
        int n = g.length;
        boolean[] visit = new boolean[n];
        int[] color = new int[n];
        Arrays.fill(color, -1);
        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                if (!dfs(i, 0, g, visit, color)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean dfs(int node, int clr, int[][] g, boolean[] visit, int[] color) {
        visit[node] = true;
        color[node] = clr;
        for (int v : g[node]) {
            if (!visit[v]) {
                if (color[v] == -1) {
                    if (!dfs(v, 1 - clr, g, visit, color)) {
                        return false;
                    }
                }
            } else if (color[v] == clr) {
                return false;
            }

        }
        return true;
    }
}