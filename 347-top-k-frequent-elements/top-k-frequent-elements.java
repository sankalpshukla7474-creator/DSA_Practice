class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((p,q)->q.val-p.val) ;
        HashMap<Integer,Integer> hm = new HashMap<>() ;
        for(int x : nums){
            hm.put(x,hm.getOrDefault(x,0)+1) ;
        }
        for(int a : hm.keySet()){
            Pair p = new Pair(a,hm.get(a)) ;
            pq.offer(p) ;
        }
        int[] arr = new int[k] ;
        int i = 0 ;
        while(i < k){
            Pair u = pq.poll() ;
            arr[i] = u.num ;
            i++ ;
        }
        return arr ;
    }
    class Pair{
        int num ;
        int val ;
        Pair(int num , int val){
            this.num = num ;
            this.val = val ;
        }
    }
}