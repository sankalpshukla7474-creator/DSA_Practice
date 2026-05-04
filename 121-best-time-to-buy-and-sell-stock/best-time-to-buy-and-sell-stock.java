class Solution {
    public int maxProfit(int[] p) {
        int min = p[0] ;
        int total = 0 ;
        for(int i = 1 ; i < p.length ; i++){
            if(p[i] < min) min = p[i] ;
            total = Math.max(total,Math.abs(p[i]-min)) ;
        }
        return total ;
    }
}