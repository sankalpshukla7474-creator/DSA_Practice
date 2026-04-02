class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size() ;
        boolean[] visit = new boolean[n] ;
        Queue<Integer> q = new LinkedList<>() ;
        q.offer(0) ;
        visit[0] = true ;
        while(!q.isEmpty()){
            int u = q.poll() ;
            for(int v : rooms.get(u)){
                if(!visit[v]){
                    visit[v] = true ;
                    q.offer(v) ;
                }
            }
        }
        for(int i = 0 ; i < n ; i++){
            if(visit[i] == false){
                return false  ;
            }
        }
        return true ;
    }
}