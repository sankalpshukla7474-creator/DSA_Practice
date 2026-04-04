class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        Map<Integer, List<int[]>> graph = new HashMap<>();

        for (int[] flight : flights) {
            graph.computeIfAbsent(flight[0], x -> new ArrayList<>())
                    .add(new int[] { flight[1], flight[2] });
        }
        int[] min_dist = new int[n];
        Arrays.fill(min_dist, Integer.MAX_VALUE);
        int steps = 0;
        Queue<int[]> pq = new LinkedList<>();
        pq.offer(new int[] { src, 0 });
        while (!pq.isEmpty() && steps <= k) {
            int size = pq.size();
            for (int i = 0; i < size; i++) {
                int[] curr = pq.poll();
                int node = curr[0];
                int cost = curr[1];
                if (!graph.containsKey(node))
                    continue;
                for (int[] neigh : graph.get(node)) {
                    int nex_node = neigh[0];
                    int nex_price = neigh[1];
                    int new_cost = cost + nex_price;
                    if (new_cost < min_dist[nex_node]) {
                        min_dist[nex_node] = new_cost;
                        pq.offer(new int[] { nex_node, new_cost });
                    }
                }
            }
            steps++ ;
        }
        return min_dist[dst] == Integer.MAX_VALUE ? -1 : min_dist[dst] ;
    }
}