class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder() ;
        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                sb.append(Character.toLowerCase(ch)) ;
            }
        }
        int i = 0 , j = sb.length() - 1 ;
        while(i < j){
            if(sb.charAt(i) != sb.charAt(j)){
                return false ;
            }
            i++ ; j-- ;
        }
        return true ;
    }
}