class Solution {
    public int maxArea(int[] h) {
        int max = 0 ;
        int l = 0 , r = h.length - 1 ;
        while(l < r){
            int len = r - l ;
            int area = Math.min(h[l],h[r]) * len ;
            max = Math.max(max,area) ;
            if(h[l] <= h[r]) l++ ;
            else r-- ;
        }
        return max ;
    }
}