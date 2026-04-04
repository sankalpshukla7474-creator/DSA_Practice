class Solution {
    public int closestMeetingNode(int[] ed, int node1, int node2) {
        int n = ed.length;
        int[] dist1 = get_dist(ed, node1, n);
        int[] dist2 = get_dist(ed, node2, n);
        int ans = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (dist1[i] != -1 && dist2[i] != -1) {
                int max = Math.max(dist1[i], dist2[i]);
                if (max < min) {
                    min = max;
                    ans = i;
                }

            }
        }
        return ans ;
    }

    public int[] get_dist(int[] ed, int start, int n) {
        int[] dist = new int[n];
        int curr = start;
        Arrays.fill(dist, -1);
        int d = 0 ;
        while (curr != -1 && dist[curr] == -1) {
            dist[curr] = d++;
            curr = ed[curr];
        }
        return dist;
    }
}