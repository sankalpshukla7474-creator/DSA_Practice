class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min = Integer.MAX_VALUE ;
        String s = "" ;
        for(String p : strs){
            if(p.length() < min){
                min = Math.min(min,p.length()) ;
                s = p ;
            }
        }
        StringBuilder sb = new StringBuilder() ;
        int i = 0 ;
        boolean flag = false ;
        while(i < s.length()){
            char ch = s.charAt(i) ;
            for(String p : strs){
                if(ch != p.charAt(i)){
                    flag = true ;
                    break ;
                }
            }
            if(flag) break ;
            sb.append(ch) ;
            i++ ;
        }
        return sb.toString() ;
    }
}