class Solution {
    public int numRescueBoats(int[] p, int limit) {
        Arrays.sort(p) ;
        int l = 0 , r = p.length - 1 , count = 0 ;
        while(l <= r){
            int sum = p[l] + p[r] ;
            if(sum > limit){
                r-- ;
            }
            else{
                l++ ; r-- ;
            }
            count++ ;
        }
        return count ;
    }
}