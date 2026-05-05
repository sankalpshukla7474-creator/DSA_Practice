import java.util.*;

class Solution {
    static class Pair {
        int row, col, time;
        Pair(int r, int c, int t) {
            row = r;
            col = c;
            time = t;
        }
    }

    public int orangesRotting(int[][] g) {
        int m = g.length;
        int n = g[0].length;

        Queue<Pair> q = new LinkedList<>();
        boolean[][] visit = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (g[i][j] == 2) {
                    q.offer(new Pair(i, j, 0));   
                    visit[i][j] = true;
                }
            }
        }

        int time = 0;

        while (!q.isEmpty()) {
            Pair p = q.poll();

            int i = p.row;        
            int j = p.col;       
            int period = p.time;  

            time = Math.max(time, period);  

            int[] dr = {-1, 0, 1, 0};
            int[] dc = {0, -1, 0, 1};

            for (int k = 0; k < 4; k++) {
                int ni = i + dr[k];
                int nj = j + dc[k];

                if (ni >= 0 && nj >= 0 && ni < m && nj < n &&
                    !visit[ni][nj] && g[ni][nj] == 1) {

                    visit[ni][nj] = true;
                    g[ni][nj] = 2; 
                    q.offer(new Pair(ni, nj, period + 1));
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (g[i][j] == 1) return -1;
            }
        }

        return time;
    }
}