class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> hm = new HashMap<>() ;
        for(String w : words){
            hm.put(w,hm.getOrDefault(w,0)+1) ;
        }
        PriorityQueue<String> pq = new PriorityQueue<>((a,b)->{
            if(hm.get(a).equals(hm.get(b))){
                return a.compareTo(b) ;
            }
            else{
                return hm.get(b) - hm.get(a) ;
            }
        }) ;
        pq.addAll(hm.keySet()) ;
        List<String> ls = new ArrayList<>() ;
        while(k-- > 0){
            ls.add(pq.poll()) ;
        }
        return ls ;
    }
}