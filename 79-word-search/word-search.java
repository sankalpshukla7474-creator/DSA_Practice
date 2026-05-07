class Solution {

    public boolean exist(char[][] b, String word) {

        int m = b.length;
        int n = b[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                boolean[][] used = new boolean[m][n];

                if (find(b, word, i, j, m, n, used, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean find(char[][] b,
                        String word,
                        int i,
                        int j,
                        int m,
                        int n,
                        boolean[][] used,
                        int idx) {

        // boundary
        if (i < 0 || i >= m || j < 0 || j >= n) {
            return false;
        }

        // already used or mismatch
        if (used[i][j] || b[i][j] != word.charAt(idx)) {
            return false;
        }

        // whole word matched
        if (idx == word.length() - 1) {
            return true;
        }

        used[i][j] = true;

        boolean found =
                find(b, word, i + 1, j, m, n, used, idx + 1) ||
                find(b, word, i - 1, j, m, n, used, idx + 1) ||
                find(b, word, i, j + 1, m, n, used, idx + 1) ||
                find(b, word, i, j - 1, m, n, used, idx + 1);

        // BACKTRACK
        used[i][j] = false;

        return found;
    }
}