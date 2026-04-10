class Solution {
    List<List<Integer>> adj = new ArrayList<>() ;
    int max = Integer.MIN_VALUE ;
    public int longestPath(int[] p, String s) {
        int n = p.length ;
        for(int i = 0 ; i < n ; i++){
            adj.add(new ArrayList<>()) ;
        }
        for(int i = 1 ; i < n ; i++){
            int u = i ;
            int v = p[i] ;
            adj.get(u).add(v) ;
            adj.get(v).add(u) ;
        }
        dfs(0,-1,s) ;
        return max ;
    }
    public int dfs(int u , int par , String s){
        int f_l = 0 ;
        int s_l = 0 ;
        for(int child : adj.get(u)){
            if(child == par) continue;
            int child_len = dfs(child,u,s) ;
            if(s.charAt(u) == s.charAt(child)) continue ;
            if(child_len > s_l) s_l = child_len ;
            if(s_l > f_l){
                int temp = s_l ;
                s_l = f_l ;
                f_l = temp ;
            }
        }
        int koi = Math.max(f_l,s_l) + 1 ;
        int only = 1 ;
        int neeche = 1 + s_l + f_l ;
        max = Math.max(max,Math.max(koi,Math.max(only,neeche))) ;
        return Math.max(koi , only ) ;
    }
}