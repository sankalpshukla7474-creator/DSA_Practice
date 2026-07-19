class Solution {
    public boolean equationsPossible(String[] equations) {
        int[] rank = new int[26];
        int[] par = new int[26];

        for (int i = 0; i < 26; i++) {
            par[i] = i;
        }

        // First process all equality equations
        for (String eq : equations) {
            if (eq.charAt(1) == '=') {
                int x = eq.charAt(0) - 'a';
                int y = eq.charAt(3) - 'a';

                union(rank, par, x, y);
            }
        }

        // Then check all inequality equations
        for (String eq : equations) {
            if (eq.charAt(1) == '!') {
                int x = eq.charAt(0) - 'a';
                int y = eq.charAt(3) - 'a';

                if (find(par, x) == find(par, y)) {
                    return false;
                }
            }
        }

        return true;
    }

    public int find(int[] par, int x) {
        if (par[x] == x) {
            return x;
        }

        return par[x] = find(par, par[x]);
    }

    public void union(int[] rank, int[] par, int x, int y) {
        int parx = find(par, x);
        int pary = find(par, y);

        if (parx == pary) {
            return;
        }

        if (rank[parx] > rank[pary]) {
            par[pary] = parx;
        } else if (rank[parx] < rank[pary]) {
            par[parx] = pary;
        } else {
            par[parx] = pary;
            rank[pary]++;
        }
    }
}