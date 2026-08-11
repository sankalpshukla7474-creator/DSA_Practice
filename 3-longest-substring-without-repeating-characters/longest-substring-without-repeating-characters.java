class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0 , l = 0 ;
        Map<Character,Integer> hm = new HashMap<>() ;
        for(int r = 0 ; r < s.length() ; r++){
            char ch = s.charAt(r) ;
            if(hm.containsKey(ch)){
                while(s.charAt(l) != ch){
                    char ph = s.charAt(l) ;
                    hm.put(ph,hm.get(ph)-1) ;
                    if(hm.get(ph) == 0){
                        hm.remove(ph) ;
                    }
                    l++ ;
                }
                l++ ;
            }
            hm.put(ch,1) ;
            max = Math.max(max,r-l+1) ;
        }
        return max ;
    }
}