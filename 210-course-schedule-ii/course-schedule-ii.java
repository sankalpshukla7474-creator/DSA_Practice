class Solution {
    public int[] findOrder(int num, int[][] pre) {
        List<List<Integer>> adj = new ArrayList<>() ;
        for(int i = 0 ; i < num ; i++){
            adj.add(new ArrayList<>()) ;
        }
        int[] indeg = new int[num] ;
        for(int i = 0 ; i < pre.length ; i++){
            int u = pre[i][0] ;
            int b = pre[i][1] ;
            adj.get(b).add(u) ;
            indeg[u]++ ;
        }
        Queue<Integer> q = new LinkedList<>() ;
        for(int i = 0 ; i < num ; i++){
            if(indeg[i] == 0){
                q.offer(i) ;
            }
        }
        List<Integer> ls = new ArrayList<>() ;
        while(!q.isEmpty()){
            int u = q.poll() ;
            ls.add(u) ;
            for(int v : adj.get(u)){
                indeg[v]-- ;
                if(indeg[v] == 0){
                    q.offer(v) ;
                }
            }
        }
        if(ls.size() != num){
            return new int[0] ;
        }
        int[] arr = new int[num] ;
        for(int i = 0 ; i < num ; i++){
            arr[i] = ls.get(i) ;
        }
        return arr ;
    }
}