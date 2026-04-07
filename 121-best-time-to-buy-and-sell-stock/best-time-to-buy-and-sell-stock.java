class Solution {
    public int maxProfit(int[] p) {
        int max = 0 , n = p.length , min = p[0];
        for(int i = 1 ; i < n ; i++){
            if(p[i] < min){
                min = p[i] ;
            }
            else{
                max = Math.max(max,p[i]-min) ;
            }
        }
        return max ;
    }
}