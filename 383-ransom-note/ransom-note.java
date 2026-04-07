class Solution {
    public boolean canConstruct(String ran, String mag) {
        int[] fre = new int[26] ;
        for(char ch : mag.toCharArray()){
            fre[ch-'a']++ ;
        }
        for(char ch : ran.toCharArray()){
            fre[ch-'a']-- ;
            if(fre[ch-'a'] < 0) return false ;
        }
        return true ;
    }
}