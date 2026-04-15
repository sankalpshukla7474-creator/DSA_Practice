class Solution {
    public int countSubstrings(String s) {
        if(s.length() == 0) return 0 ;
        int count = 0 ;
        for(int i = 0 ; i < s.length() ; i++){
            for(int j = i ; j < s.length() ; j++){
                if(fun(s,i,j)){
                    count += 1 ;
                }
            }
        }
        return count ;
    }
    public boolean fun(String s , int i , int j ){
        if(i > j) return false ;
        while(i <= j){
            if(s.charAt(i) != s.charAt(j)){
                return false ;
            }
            else{
                i++ ; j-- ;
            }
        }
        return true ;
    }
}