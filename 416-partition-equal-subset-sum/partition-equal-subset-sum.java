class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length ;
        if(n == 0) return false ;
        int sum = 0 ;
        for(int x : nums){
            sum += x ;
        }
        if(sum % 2 != 0) return false ;
        int tar = sum / 2 ;
        boolean[][] dp = new boolean[n+1][tar+1] ;
        for(int i = 0 ; i <= n ; i++){
            for(int j = 0 ; j <= tar ; j++){
                if(i == 0){
                    dp[i][j] = false ;
                }
                else if( j == 0){
                    dp[i][j] = true ;
                }
            }
        }
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= tar ; j++){
                if(nums[i-1] <= j){
                    dp[i][j] = dp[i-1][j-nums[i-1]] || dp[i-1][j] ;
                }
                else{
                    dp[i][j] = dp[i-1][j] ;
                }
            }
        }
        return dp[n][tar] ;
    }
}