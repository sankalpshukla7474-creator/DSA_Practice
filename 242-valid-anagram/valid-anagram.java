class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> hm1 = new HashMap<>() ;
        Map<Character,Integer> hm2 = new HashMap<>() ;
        for(char ch : s.toCharArray()){
            hm1.put(ch,hm1.getOrDefault(ch,0)+1) ;
        }
        for(char ch : t.toCharArray()){
            hm2.put(ch,hm2.getOrDefault(ch,0)+1) ;
        }
        return hm1.equals(hm2) ;
    }
}