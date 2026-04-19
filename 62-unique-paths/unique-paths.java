class Solution {
    int[][] dp = new int[101][101] ;
    public int uniquePaths(int m, int n) {
        for(int i = 0 ; i < m ; i++){
            Arrays.fill(dp[i],-1) ;
        }
        return track(0,0,m,n)  ;
    }
    public int track(int i , int j , int m , int n){
        if(i == m-1 && j == n-1) return 1 ;
        if(i >= m || j >= n) return 0 ;
        if(dp[i][j] != -1) return dp[i][j] ;
        int a = track(i+1,j,m,n) ;
        int b = track(i,j+1,m,n) ;
        return dp[i][j] = (a+b) ;
    }
}