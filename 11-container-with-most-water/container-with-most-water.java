class Solution {
    public int maxArea(int[] h) {
        int n = h.length ;
        int l = 0 , r = n - 1 ;
        int max = 0 ;
        while(l < r){
            int area = Math.min(h[l],h[r]) * (r - l) ;
            max = Math.max(max,area) ;
            if(h[l] <= h[r]){
                l++ ;
            }
            else{
                r-- ;
            }
        }
        return max ;
    }
}