class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() == 0 && s2.length() == 0) return true ;
        if(s1.length() == 0 || s2.length() == 0) return false ;

        Map<Character,Integer> hm = new HashMap<>() ;
        for(char ch : s1.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1) ;
        }

        Map<Character,Integer> pm = new HashMap<>() ;
        int i = 0 ;
        for(int j = 0 ; j < s2.length() ; j++){
            char ph = s2.charAt(j) ;
            pm.put(ph,pm.getOrDefault(ph,0)+1) ;
            if(j-i+1 == s1.length()){
                if(pm.equals(hm)) return true ;
                char a = s2.charAt(i) ;
                pm.put(a,pm.get(a)-1) ;
                if(pm.get(a) == 0){
                    pm.remove(a) ;
                }
                i++ ;
            }
        }
        return false ;
    }
}