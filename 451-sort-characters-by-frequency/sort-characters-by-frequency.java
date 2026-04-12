class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> hm = new HashMap<>() ;
        for(char ch : s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1) ;
        }
        List<Character>[] bucket = new List[s.length()+1] ;
        for(char ch : hm.keySet()){
            int fre = hm.get(ch) ;
            if(bucket[fre] == null){
                bucket[fre] = new ArrayList<>() ;
            }
            bucket[fre].add(ch) ;
        }
        StringBuilder sb = new StringBuilder() ;
        for(int i = bucket.length - 1 ; i >= 0 ; i--){
            if(bucket[i] != null){
                for(char ch : bucket[i]){
                    for(int j = i ; j > 0 ; j--){
                        sb.append(ch) ;
                    }
                }
            }
        }
        return sb.toString() ;
    }
}