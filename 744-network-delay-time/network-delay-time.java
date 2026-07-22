class Solution {
    public int networkDelayTime(int[][] t, int n, int k) {
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>() ;
        for(int i = 0 ; i <= n ; i++){
            adj.add(new ArrayList<>()) ;
        }
        int[] ans = new int[n+1] ;
        Arrays.fill(ans,Integer.MAX_VALUE) ;
        for(int i = 0 ; i < t.length ; i++){
            int u = t[i][0] ;
            int v = t[i][1] ;
            int wt = t[i][2] ;
            adj.get(u).add(new int[]{v,wt}) ;
        }
        ans[k] = 0 ;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]) ;
        pq.offer(new int[]{k,0}) ;
        while(!pq.isEmpty()){
            int[] arr = pq.poll() ;
            int node = arr[0] ;
            int wt = arr[1] ;
            if(wt > ans[node]) continue ;
            for(int[] prr : adj.get(node)){
                int neigh = prr[0] ;
                int size = prr[1] ;
                int u = size + wt ;
                if(u < ans[neigh]){
                    ans[neigh] = u ;
                    pq.offer(new int[]{neigh,u}) ;
                }
            }
        }
        int result = -1 ;
        for(int i = 1 ; i <= n ; i++){
            if(ans[i] == Integer.MAX_VALUE){
                return -1 ;
            }
            result = Math.max(result,ans[i]) ;
        }
        return result ;
    }
}