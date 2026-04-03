class Solution {
    List<List<Integer>> ans ;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n = graph.length ;
        ans = new ArrayList<>() ;
        List<Integer> pb = new ArrayList<>() ;
        dfs(0,n-1,pb,graph) ;
        return ans ;
    }
    public void dfs(int u , int des,List<Integer> pb , int[][] graph){
        pb.add(u) ;
        if(u == des){
            ans.add(new ArrayList<>(pb)) ;
        }
        for(int v : graph[u]){
            dfs(v,des,pb,graph) ;
        }
        pb.remove(pb.size()-1) ;
    }
}