class Solution {
    List<Integer> ls = new ArrayList<>() ;
    List<List<Integer>> adj = new ArrayList<>() ;
    public int[] findOrder(int num, int[][] p) {
        for(int i = 0 ; i < num ; i++){
            adj.add(new ArrayList<>()) ;
        }
        int[] deg = new int[num] ;
        for(int i = 0 ; i < p.length ; i++){
            int a = p[i][0] ;
            int b = p[i][1] ;
            adj.get(b).add(a) ;
            deg[a]++ ;
        }
        boolean[] visit = new boolean[num] ;
        Queue<Integer> q = new LinkedList<>() ;
        List<Integer> pb = new ArrayList<>() ;
        for(int i = 0 ; i < num ; i++){
            if(deg[i] == 0){
                q.offer(i) ;
            }
        }
        while(!q.isEmpty()){
            int u = q.poll() ;
            pb.add(u) ;
            for(int v : adj.get(u)){
                deg[v]-- ;
                if(deg[v] == 0) q.offer(v) ;
            }
        }
        if(pb.size() != num) return new int[0] ;
        return pb.stream().mapToInt(i -> i).toArray();
    }
}