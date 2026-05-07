class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int range = 0 ;
        for(int x : nums){
            range += x ;
        }
        if(Math.abs(target) > range) return 0;
        if((range + target) % 2 != 0) return 0;
        int tar = (range + target) / 2 ;
        return find(tar,nums,nums.length-1) ;
    }
    public int find(int tar , int[] nums , int i){
        if(i < 0){
            if(tar == 0) return 1;
            return 0;
        }
        int a = find(tar-nums[i],nums,i-1) ;
        int b = find(tar,nums,i-1) ;
        return (a+b) ;
    }
}