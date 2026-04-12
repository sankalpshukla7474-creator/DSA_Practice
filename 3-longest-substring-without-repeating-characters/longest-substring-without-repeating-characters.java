class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0 ;
        int i = 0 ;
        HashMap<Character,Integer> hm = new HashMap<>() ;
        for(int j = 0 ; j < s.length() ; j++){
            char ch = s.charAt(j) ;
            if(hm.containsKey(ch)){
                while(s.charAt(i) != ch){
                    char a = s.charAt(i) ;
                    hm.remove(a) ;
                    i++ ;
                }
                i++ ;
            }
            max = Math.max(max,j-i+1) ;
            hm.put(ch,1) ;
        }
        return max ;
    }
}