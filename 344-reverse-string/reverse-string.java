class Solution {
    public void reverseString(char[] s) {
        if(s.length == 0) return ;
        track(s,0,s.length-1) ;
    }
    public void track(char[] s , int i , int j ){
        if(i >= j) return ;
        char
         temp = s[i] ;
        s[i] = s[j] ;
        s[j] = temp ;
        track(s,i+1,j-1) ;
    }
}