class Solution {
    public int maxArea(int[] h) {
        int i = 0 , j = h.length - 1 ;
        int max = Integer.MIN_VALUE ;
        while(i < j){
            int len = j - i ;
            max = Math.max(max,len*Math.min(h[i],h[j])) ;
            if(h[i] <= h[j]){
                i++ ;
            }
            else{
                j-- ;
            }
        }
        return max ;
    }
}