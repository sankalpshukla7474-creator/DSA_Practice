class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length <= 1) return nums.length ;
        int slow = 0 , max = 0 ;
        for(int r = 1 ; r < nums.length ; r++){
            if(nums[r] <= nums[r-1]){
                slow = r ;
            }
            max = Math.max(r-slow+1,max) ;
        }
        return max ;
    }
}