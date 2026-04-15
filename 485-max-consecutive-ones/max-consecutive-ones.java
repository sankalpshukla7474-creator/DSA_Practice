class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i = 0 ;
        int total = 0 ;
        int j = 0 ;
        while(j < nums.length){
            if(nums[j] == 0){
                i = j + 1 ;
            }
            total = Math.max(total,j-i+1) ;
            j++ ;
        }
        return total ;
    }
}