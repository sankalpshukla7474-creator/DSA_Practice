class Solution {
    public int leastInterval(char[] tasks, int n) {
        if(tasks.length == 0) return 0 ;
        Map<Character,Integer> hm = new HashMap<>() ;
        for(char ch : tasks){
            hm.put(ch,hm.getOrDefault(ch,0)+1) ;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a) ;
        for(char ch : hm.keySet()){
            pq.offer(hm.get(ch)) ;
        }
        int count = 0 ;
        int max = pq.peek() ;
        while(!pq.isEmpty() && pq.peek() == max){
            count++ ;
            pq.poll() ;
        }
        int time = (max-1)*(n+1) + count ;
        return Math.max(time,tasks.length) ;
    }
}