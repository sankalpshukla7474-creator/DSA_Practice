class Solution {
    public int maxSubArray(int[] nums) {
        int cSum = nums[0] ;
        int max = nums[0] ;
        for(int i = 1 ; i < nums.length ; i++){
            cSum = Math.max(nums[i],cSum+nums[i]) ;
            max = Math.max(max,cSum) ;
        }
        return max ;
    }
}