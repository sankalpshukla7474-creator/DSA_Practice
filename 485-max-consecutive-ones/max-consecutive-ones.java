class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0 , count = 0 ;
        for(int x : nums){
            if(x == 0){
                count = 0 ;
                continue ;
            }
            count++ ;
            max = Math.max(count,max) ;
        }
        return max ;
    }
}