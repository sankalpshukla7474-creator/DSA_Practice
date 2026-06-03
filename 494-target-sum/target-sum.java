class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length ;
        int zc = 0 , sum = 0 ;
        for(int x : nums){
            sum += x ;
            if(x == 0) zc++ ;
        }
        if (Math.abs(target) > sum) return 0;
        int tar = sum + target ;
        if(tar % 2 != 0) return 0 ;
        tar /= 2 ;
        int[][] dp = new int[n+1][tar+1] ;
        for(int i = 0 ; i <= tar ; i++){
            dp[0][i] = 0 ;
        }
        for(int i = 0 ; i <= n ; i++){
            dp[i][0] = 1 ;
        }
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= tar ; j++){
                if(nums[i-1] == 0){
                    dp[i][j] = dp[i-1][j] ;
                    continue ;
                }
                if(nums[i-1] <= j){
                    dp[i][j] = dp[i-1][j-nums[i-1]] + dp[i-1][j] ;
                }
                else{
                    dp[i][j] = dp[i-1][j] ;
                }
            }
        }
        return dp[n][tar] * (int)Math.pow(2,zc) ;
    }
}